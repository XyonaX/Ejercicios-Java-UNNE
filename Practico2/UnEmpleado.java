import java.util.Scanner;

public class UnEmpleado
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
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
        teclado.close();
        
        Empleado empleado = new Empleado(cuit, apellido, nombre, sueldo, anioIngreso);
        empleado.mostrar();
        String linea = empleado.mostrarLinea();
        System.out.println(linea);
    }
}
