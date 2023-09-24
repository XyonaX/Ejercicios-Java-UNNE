import java.util.Scanner;

public class GestionComercio {
    public static void main(String[] args) {
        Comercio comercio = new Comercio("Tia Doris");

        Scanner teclado = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n--- Menú de Gestión de Comercio ---");
            System.out.println("1. Ingresar Empleado");
            System.out.println("2. Mostrar Nómina");
            System.out.println("3. Quitar Empleado");
            System.out.println("4. Buscar Empleado");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarEmpleado(teclado, comercio);
                    break;
                case 2:
                    comercio.nomina();
                    break;
                case 3:
                    quitarEmpleado(teclado, comercio);
                    break;
                case 4:
                    buscarEmpleado(teclado, comercio);
                    break;
                case 5:
                    System.out.println("Saliendo!...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 5);

        teclado.close();
    }

    private static void agregarEmpleado(Scanner teclado, Comercio comercio) {
        System.out.println("Ingrese número de CUIL: ");
        long cuil = teclado.nextLong();
        teclado.nextLine();
        System.out.println("Ingrese nombre del empleado: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese apellido del empleado: ");
        String apellido = teclado.nextLine();
        System.out.println("Ingrese Sueldo Bruto del empleado: ");
        double sueldo = teclado.nextDouble();
        System.out.println("Ingrese año de ingreso del empleado: ");
        int anio = teclado.nextInt();

        Empleado empleado = new Empleado(cuil, apellido, nombre, sueldo, anio);
        comercio.altaEmpleado(empleado);
    }

    private static void quitarEmpleado(Scanner teclado, Comercio comercio) {
        System.out.println("Ingrese CUIL del empleado a dar de baja: ");
        long cuilBaja = teclado.nextLong();
        Empleado empleadoDadoDeBaja = comercio.bajaEmpleado(cuilBaja);
        if (empleadoDadoDeBaja != null) {
            System.out.println("Empleado dado de baja correctamente:");
            empleadoDadoDeBaja.mostrar();
        } else {
            System.out.println("No se encontró un empleado con ese CUIL.");
        }
    }

    private static void buscarEmpleado(Scanner teclado, Comercio comercio) {
        System.out.println("Ingrese el número de cuil del empleado a buscar: ");
        long cuilBuscar = teclado.nextLong();
        teclado.nextLine();
        Empleado empleadoBuscado = comercio.buscarEmpleado(cuilBuscar);
        if (empleadoBuscado != null) {
            String mostrar = empleadoBuscado.mostrarLinea();
            System.out.println(mostrar);
        } else {
            System.out.println("No se encontró un alumno con ese número de libreta.");
        }
    }
}
