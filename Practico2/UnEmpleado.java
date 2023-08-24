import java.util.Scanner;

public class UnEmpleado
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int pregunta = 0;
        do {
            System.out.println("Ingrese un cuit: ");
            long cuit = teclado.nextLong();

            // Limpiar el búfer del scanner después de nextLong()
            teclado.nextLine();

            System.out.println("Ingrese su apellido: ");
            String apellido = teclado.nextLine();

            System.out.println("Ingrese su nombre: ");
            String nombre = teclado.nextLine();

            System.out.println("Ingrese el sueldo basico: ");
            double sueldo = teclado.nextDouble();

            System.out.println("Ingrese el anio de ingreso: ");
            int anioIngreso = teclado.nextInt();

            Empleado empleado = new Empleado(cuit, apellido, nombre, sueldo, anioIngreso);
            empleado.mostrar();
            empleado.mostrarLinea();

            System.out.println("Desea ingresar otro empleado ? 1-Si 0-No");
            pregunta = teclado.nextInt();
        } while (pregunta != 0);

        teclado.close();
    }
}
