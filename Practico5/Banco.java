import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Banco {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Calendar fechaNacimiento = new GregorianCalendar(1998, 7, 8);

        Persona juan = new Persona(41442040, "Juan", "Perez", fechaNacimiento);

        CuentaBancaria cajaAhorro = new CajaDeAhorro(1, juan);
        CuentaBancaria cuentaCorriente = new CuentaCorriente(2, juan);

        int opcion;
        do {
            System.out.println("\n\n----- Menú -----");
            System.out.println("1. Operar en Caja de Ahorro");
            System.out.println("2. Operar en Cuenta Corriente");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    operarCuenta(cajaAhorro);
                    break;
                case 2:
                    operarCuenta(cuentaCorriente);
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);
    }

    private static void operarCuenta(CuentaBancaria cuenta) {
        int operacion;
        do {
            System.out.println("\n----- Operaciones -----");
            System.out.println("1. Mostrar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Extraer");
            System.out.println("4. Volver al Menú Principal");
            System.out.print("Elija una opción: ");
            operacion = scanner.nextInt();

            switch (operacion) {
                case 1:
                    cuenta.mostrar();
                    break;
                case 2:
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();
                    cuenta.depositar(montoDeposito);
                    break;
                case 3:
                    System.out.print("Ingrese el monto a extraer: ");
                    double montoExtraccion = scanner.nextDouble();
                    cuenta.extraer(montoExtraccion);
                    break;
                case 4:
                    System.out.println("Volviendo al Menú Principal...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (operacion != 4);
    }
}
