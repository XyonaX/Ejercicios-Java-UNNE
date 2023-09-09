import java.util.Scanner;

public class Puntos
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Punto[] puntos = new Punto[2];
        int contadorPuntos = 0;

        int opcion;

        do {
            System.out.println("\t\t\t\t\t----------MENU----------:");
            System.out.println("\t\t\t\t\t1. Crear Puntos");
            System.out.println("\t\t\t\t\t2. Calcular la distancia entre dos puntos");
            System.out.println("\t\t\t\t\t0. Salir");
            System.out.print("\t\t\t\t\tSeleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    crearPunto(contadorPuntos, puntos,teclado);
                    contadorPuntos++;
                    break;
                case 2:
                    calcularDistancia(contadorPuntos, puntos);
                    break;

                case 0:
                    System.out.println("Saliendo del programa.");
                    break;

                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 0);

        teclado.close();
    }

    public static void crearPunto(int contador, Punto[] puntos, Scanner teclado){
        if (contador < 2) {
            puntos[contador] = crearPunto(teclado);
            System.out.println("Punto creado exitosamente.");
        } else {
            System.out.println("Ya has creado el número máximo de puntos (2).");
        }
    }

    public static void calcularDistancia(int contador, Punto[] puntos){
        if (contador >= 2) {
            double distancia = puntos[0].distanciaA(puntos[1]);
            System.out.println("La distancia entre los puntos es: " + distancia +"\n\n");
        } else {
            System.out.println("Debes crear al menos dos puntos primero.");
        }
    }

    public static Punto crearPunto(Scanner scanner) {
        System.out.print("Ingrese la coordenada X: ");
        double x = scanner.nextDouble();
        System.out.print("Ingrese la coordenada Y: ");
        double y = scanner.nextDouble();
        return new Punto(x, y);
    }
    
}
