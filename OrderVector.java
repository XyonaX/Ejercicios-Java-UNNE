import java.util.Scanner;

public class OrderVector {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double[] numeros = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese el elemento " + (i + 1) + ": ");
            numeros[i] = teclado.nextDouble();
        }

        teclado.close();

        // Encontrar el menor elemento
        double menor = numeros[0];
        for (int i = 1; i < 4; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        System.out.println("El menor elemento es: " + menor);

        // Ordenar el vector utilizando el método de la burbuja
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3 - i; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    double temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Elementos ordenados:");
        for (double elemento : numeros) {
            System.out.print(elemento + "\t");
        }
    }
}
