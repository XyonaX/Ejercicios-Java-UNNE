package Practico1;
import java.util.Scanner;

public class CircunferenciaScanner {
    
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
        double radio = teclado.nextDouble();
        double perimetro = calcularPerimetro(radio);
        teclado.close();

        System.out.println("El perimetro de la circunferencia es: " + perimetro);
    }

    public static double calcularPerimetro(double radio){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
