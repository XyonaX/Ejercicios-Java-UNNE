import java.util.Scanner;

public class ArrayDePuntos {
    public static void main(String[] args) {
        Punto[] puntos = new Punto[6];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < puntos.length; i++) {
            System.out.println("Ingrese un valor de x: ");
            double x = teclado.nextDouble();
            System.out.println("Ingrese un valor de y: ");
            double y = teclado.nextDouble();
            puntos[i] = new Punto(x, y);
        }
        for (int i = 0; i < puntos.length; i++) {
            String coordenadas = puntos[i].coordenadas();
            System.out.println(coordenadas);
        }
        for (int i = 0; i < puntos.length - 1; i++) {
            int aux = i + 1;
            double distancia = puntos[i].distanciaA(puntos[aux]);
            System.out.println(distancia);
        }
        teclado.close();
    }
}