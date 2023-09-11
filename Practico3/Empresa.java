import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Empresa {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Calendar fechaIngreso = new GregorianCalendar(2010,7,8);
        EmpleadoConJefe jefe = new EmpleadoConJefe(20414420401L, "Vargas", "Jonatan", 2500000,fechaIngreso,null);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Instanciar Empleado");
            System.out.println("2. Verificar si es aniversario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                //tuve que poner este nextLine() para limpiar el buffer
                teclado.nextLine();
                System.out.print("¿El empleado tiene jefe? (S/N): ");
                    String tieneJefe = teclado.nextLine();
                    if ("S".equalsIgnoreCase(tieneJefe)) {
                        if (jefe == null) {
                            System.out.println("Debe instanciar un Gerente General primero.");
                        } else {
                            EmpleadoConJefe empleado = instanciarEmpleado(teclado, jefe);
                            empleado.mostrar();
                        }
                    } else {
                        EmpleadoConJefe empleado = instanciarEmpleado(teclado, null);
                        empleado.mostrar();
                    }
                    break;
                case 2:
                    // verificarAniversario(empleado);
                    break;
                case 3:
                    System.out.println("Saliendo del programa.");
                    teclado.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static EmpleadoConJefe instanciarEmpleado(Scanner teclado, EmpleadoConJefe jefe) {
        teclado.nextLine();
        System.out.print("Ingrese el CUIL del empleado: ");
        long cuil = teclado.nextLong();
        teclado.nextLine(); 

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = teclado.nextLine();

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = teclado.nextLine();

        System.out.print("Ingrese el sueldo basico del empleado: ");
        double sueldoBasico = teclado.nextDouble();

        System.out.print("Ingrese el anio de ingreso del empleado: ");
        int anioIngreso = teclado.nextInt();

        System.out.println("Ingrese el mes de ingreso del empleado siendo 0 -> enero, 1 -> febrero... : ");
        int mesIngreso = teclado.nextInt();

        System.out.println("Ingrese el dia de ingreso del empleado: ");
        int diaIngreso = teclado.nextInt();




        Calendar fechaIngreso = new GregorianCalendar(anioIngreso, mesIngreso, diaIngreso);

        return new EmpleadoConJefe(cuil, nombre, apellido, sueldoBasico, fechaIngreso, jefe);
    }

    // private static Empleado instanciarEmpleado(Scanner teclado) {
    //     teclado.nextLine();
    //     System.out.print("Ingrese el CUIL del empleado: ");
    //     long cuil = teclado.nextLong();
    //     teclado.nextLine(); // Consumir la nueva línea

    //     System.out.print("Ingrese el nombre del empleado: ");
    //     String nombre = teclado.nextLine();

    //     System.out.print("Ingrese el apellido del empleado: ");
    //     String apellido = teclado.nextLine();

    //     System.out.print("Ingrese el sueldo basico del empleado: ");
    //     double sueldoBasico = teclado.nextDouble();

    //     System.out.print("Ingrese el anio de ingreso del empleado: ");
    //     int anioIngreso = teclado.nextInt();

    //     System.out.println("Ingrese el mes de ingreso del empleado siendo 0 -> enero, 1 -> febrero... : ");
    //     int mesIngreso = teclado.nextInt();

    //     System.out.println("Ingrese el dia de ingreso del empleado: ");
    //     int diaIngreso = teclado.nextInt();




    //     Calendar fechaIngreso = new GregorianCalendar(anioIngreso, mesIngreso, diaIngreso);

    //     return new Empleado(cuil, nombre, apellido, sueldoBasico, fechaIngreso);
    // }

    private static void verificarAniversario(EmpleadoConJefe empleado) {
        if (empleado == null) {
            System.out.println("Primero debe instanciar un empleado.");
            return;
        }

        if (empleado.esAniversario()) {
            System.out.println("Es aniversario!");
        } else {
            System.out.println("No es aniversario.");
        }
    }
}
