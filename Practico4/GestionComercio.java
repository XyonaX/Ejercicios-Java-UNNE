import java.util.Scanner;

public class GestionComercio {
    public static void main(String[] args) {
        Comercio comercio = new Comercio("Tia Doris");

        Scanner teclado = new Scanner(System.in);

        int pregunta;

        do {
            System.out.println("Ingrese numero de cuil: ");
            long cuil = teclado.nextLong();
            teclado.nextLine();
            System.out.println("Ingrese nombre del empleado: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese apellido del empleado: ");
            String apellido = teclado.nextLine();
            System.out.println("Ingrese Sueldo Bruto del empleado: ");
            double sueldo = teclado.nextDouble();

            Empleado empleado = new Empleado(cuil, apellido, nombre, sueldo, 2001);
            comercio.altaEmpleado(empleado);

            System.out.println("Desea ingresar otro empleado? 1-SI 2-NO: ");
            pregunta = teclado.nextInt();

        } while (pregunta == 1);

        comercio.nomina();
        teclado.close();
    }
}
