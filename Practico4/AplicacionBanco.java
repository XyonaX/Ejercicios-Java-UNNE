import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionBanco {
    public static void main(String[] args) {
        Localidad localidadBanco = new Localidad("Corrientes", "Corrientes");
        ArrayList<Empleado> empleados = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        // Vamos a probar lo que seria el ejercicio 4

        ArrayList<CuentaBancaria> cuentas = new ArrayList<>();
        Banco provincia = new Banco("Provincia", localidadBanco, 1, empleados, cuentas);

        int opcion;
        do {
            System.out.println("\n--- Menú del Banco ---");
            System.out.println("1. Agregar Empleado");
            System.out.println("2. Agregar Cuenta Bancaria");
            System.out.println("3. Mostrar Resumen Cuentas Bancarias Y Sueldos a pagar");
            System.out.println("4. Quitar Empleado");
            System.out.println("5. Quitar Cuenta Bancaria");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarEmpleado(teclado, empleados);
                    break;
                case 2:
                    agregarCuentaBancaria(teclado, cuentas);
                    break;
                case 3:
                    provincia.mostrarResumen();
                    System.out.println("\n\n");
                    provincia.mostrar();
                    break;
                case 4:
                    quitarEmpleado(teclado, empleados, provincia);
                    break;
                case 5:
                    quitarCuentaBancaria(teclado, cuentas, provincia);
                    break;
                case 6:
                    System.out.println("Saliendo!...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);

        teclado.close(); // Cerrar el scanner al salir del programa
    }

    private static void agregarEmpleado(Scanner teclado, ArrayList<Empleado> empleados) {
        System.out.print("Ingrese CUIL (sin guiones ni espacios): ");
        long cuil = teclado.nextLong();
        teclado.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese Apellido: ");
        String apellido = teclado.nextLine();
        System.out.print("Ingrese Nombre: ");
        String nombre = teclado.nextLine();
        System.out.print("Ingrese Sueldo: ");
        double sueldo = teclado.nextDouble();
        teclado.nextLine();
        System.out.print("Ingrese Año de Ingreso: ");
        int anioIngreso = teclado.nextInt();
        teclado.nextLine();

        Empleado nuevoEmpleado = new Empleado(cuil, apellido, nombre, sueldo, anioIngreso);
        empleados.add(nuevoEmpleado);
        System.out.println("Empleado agregado correctamente.");
    }

    private static void agregarCuentaBancaria(Scanner teclado, ArrayList<CuentaBancaria> cuentas) {
        System.out.print("Ingrese número de cuenta: ");
        int numeroCuenta = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese DNI del titular: ");
        int dniTitular = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese Nombre del titular: ");
        String nombreTitular = teclado.nextLine();
        System.out.print("Ingrese Apellido del titular: ");
        String apellidoTitular = teclado.nextLine();
        System.out.print("Ingrese Año de Nacimiento del titular: ");
        int anioNacimientoTitular = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Ingrese Saldo inicial: ");
        double saldoInicial = teclado.nextDouble();
        teclado.nextLine();

        Persona titular = new Persona(dniTitular, nombreTitular, apellidoTitular, anioNacimientoTitular);
        CuentaBancaria nuevaCuenta = new CuentaBancaria(numeroCuenta, titular, saldoInicial);
        cuentas.add(nuevaCuenta);
        System.out.println("Cuenta Bancaria agregada correctamente.");
    }

    private static void quitarEmpleado(Scanner teclado, ArrayList<Empleado> empleados, Banco banco) {
        System.out.print("Ingrese CUIL del empleado a eliminar: ");
        long cuilEliminar = teclado.nextLong();
        teclado.nextLine();

        Empleado empleadoEliminar = null;
        for (Empleado empleado : empleados) {
            if (empleado.getCuil() == cuilEliminar) {
                empleadoEliminar = empleado;
                break;
            }
        }

        if (empleadoEliminar != null) {
            boolean eliminado = banco.quitarEmpleado(empleadoEliminar);
            if (eliminado) {
                System.out.println("Empleado eliminado correctamente.");
            } else {
                System.out.println("No se pudo eliminar al empleado.");
            }
        } else {
            System.out.println("No se encontró un empleado con ese CUIL.");
        }
    }

    private static void quitarCuentaBancaria(Scanner teclado, ArrayList<CuentaBancaria> cuentas, Banco banco) {
        if (cuentas.isEmpty()) {
            System.out.println("No hay cuentas bancarias para eliminar.");
        } else {
            System.out.print("Ingrese número de cuenta a eliminar: ");
            int numeroCuentaEliminar = teclado.nextInt();
            teclado.nextLine();

            CuentaBancaria cuentaEliminar = null;
            for (CuentaBancaria cuenta : cuentas) {
                if (cuenta.getNroCuenta() == numeroCuentaEliminar) {
                    cuentaEliminar = cuenta;
                    break;
                }
            }

            if (cuentaEliminar != null) {
                boolean eliminada = banco.quitarCuentaBancaria(cuentaEliminar);
                if (eliminada) {
                    System.out.println("Cuenta bancaria eliminada correctamente.");
                } else {
                    System.out.println("No se pudo eliminar la cuenta bancaria.");
                }
            } else {
                System.out.println("No se encontró una cuenta bancaria con ese número.");
            }
        }
    }
}
