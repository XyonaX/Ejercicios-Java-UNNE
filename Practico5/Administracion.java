import java.util.ArrayList;
import java.util.Scanner;

public class Administracion {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        Jardin rayitoLuz = new Jardin("Rayito de Luz", figuras);

        int opcion;
        do {
            System.out.println("\n\n----- Menú -----");
            System.out.println("1. Ingresar Figuras");
            System.out.println("2. Detalle de Figuras");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    figuras.add(ingresarDatosFiguras());
                    break;
                case 2:
                    rayitoLuz.detalleFiguras();
                    break;
                case 3:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

    private static FiguraGeometrica ingresarDatosFiguras() {

        System.out.print("Ingrese la coordenada x del centro: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y del centro: ");
        double y = scanner.nextDouble();

        Punto centro = new Punto(x, y);
        System.out
                .println("Que Figura desea Agregar: \n1.Cuadrado\n2.Triangulo\n3.Circulo\n4.Elipse\n5.Rectangulo");
        System.out.print("Tu opcion: ");
        int opc = scanner.nextInt();
        switch (opc) {
            case 1:
                System.out.println("Ingrese los datos de las figuras:");
                System.out.print("Medida de los Lados del cuadrado: ");
                double ladoCuadrado = scanner.nextDouble();
                return new Cuadrado(centro, ladoCuadrado);
            case 2:
                System.out.println("Ingrese los datos de las figuras:");
                System.out.print("Base del triángulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Altura del triángulo: ");
                double alturaTriangulo = scanner.nextDouble();
                return new Triangulo(centro, baseTriangulo, alturaTriangulo);
            case 3:
                System.out.println("Ingrese los datos de las figuras:");
                System.out.print("Radio del círculo: ");
                double radioCirculo = scanner.nextDouble();
                return new Circulo(centro, radioCirculo);
            case 4:
                System.out.println("Ingrese los datos de las figuras:");
                System.out.print("Semi-eje mayor de la elipse: ");
                double semiEjeMayor = scanner.nextDouble();
                System.out.print("Semi-eje menor de la elipse: ");
                double semiEjeMenor = scanner.nextDouble();
                return new Elipse(centro, semiEjeMayor, semiEjeMenor);
            case 5:
                System.out.println("Ingrese los datos de las figuras:");
                System.out.println("Ingrese el ancho del rectangulo:");
                double ancho = scanner.nextDouble();
                System.out.println("Ingrese la altura del rectangulo:");
                double altura = scanner.nextDouble();
                return new Rectangulo(centro, ancho, altura);
            default:
                System.out.println("Numero incorrecto!");
                return null;
        }
    }
}
