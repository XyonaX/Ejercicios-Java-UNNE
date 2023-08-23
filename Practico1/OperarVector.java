package Practico1;
import java.util.Scanner;

public class OperarVector {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la nota del alumno " + (i + 1) + ": ");
            notas[i] = teclado.nextDouble();
        }

        teclado.close();

        double suma = 0;
        double mayorNota = notas[0];

        for (double nota : notas) {
            suma += nota;
            if (nota > mayorNota) {
                mayorNota = nota;
            }
        }

        double promedio = (double) suma / notas.length;

        System.out.println("\nNotas ingresadas:");
        for (double nota : notas) {
            System.out.print(nota + "\t");
        }

        System.out.println("\nPromedio de notas: " + promedio);
        System.out.println("Mayor nota: " + mayorNota);
    }
}
