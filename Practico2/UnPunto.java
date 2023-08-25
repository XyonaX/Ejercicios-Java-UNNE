import java.util.Scanner;

public class UnPunto
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del punto x: ");
        double puntoX = teclado.nextDouble();
        System.out.println("Ingrese el valor del punto y: ");
        double puntoY = teclado.nextDouble();
        Punto unPunto = new Punto(puntoX,puntoY);
        unPunto.mostrar();
        System.out.println("Para desplazar X ingrese otro valor: ");
        double dx = teclado.nextDouble();
        System.out.println("Para desplazar Y ingrese otro valor: ");
        double dy = teclado.nextDouble();
        unPunto.desplazar(dx, dy);
        teclado.close();
        String coordenadas = unPunto.coordenadas();
        System.out.println("Coordenadas: " + coordenadas);
    }
}
