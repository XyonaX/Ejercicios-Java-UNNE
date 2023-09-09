import java.util.Random;
import java.util.Scanner;

public class CrearFigura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        Random rand = new Random();
        double random = 100.0 * rand.nextDouble();
        double random2 = 100.0 * rand.nextDouble();
        double random3 = 100.0 * rand.nextDouble();
        double random4 = 100.0 * rand.nextDouble();

        // Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(x,y);

        // Circulo circulo1 = new Circulo(random,punto1);
        // Circulo circulo2 = new Circulo(random2,punto2);
        
        Rectangulo rectangulo1 = new Rectangulo(random,random2);
        Rectangulo rectangulo2 = new Rectangulo(punto2, random3, random4);

        int opc;
        
        do {
            mostrarMenu();
            opc = teclado.nextInt();

            switch (opc) {
                case 1:
                    desplazar(rectangulo1, teclado);
                    // desplazar(circulo1, teclado);
                    break;
                case 2:
                    desplazar(rectangulo2, teclado);
                    // desplazar(circulo2, teclado);
                    break;
                case 3:
                    // circulo1.caracteristicas();
                    // circulo2.caracteristicas();
                    rectangulo1.caracteristicas();
                    rectangulo2.caracteristicas();
                    break;
                case 4:
                    // mostrarMayor(circulo1,circulo2);
                    mostrarMayor(rectangulo1,rectangulo2);
                    break;
                case 5:
                    double distancia = rectangulo1.distanciaA(rectangulo2);
                    System.out.println("La distancia entre los dos circulos es: " +distancia);
                    break;
                case 6:
                System.out.println("Saliendo....!");
                break;
                default:
                System.out.println("Valor ingresado incorrecto");
                    break;
            }
        } while (opc != 6);
    }

    private static void mostrarMenu(){
        System.out.println("\t\t\t\t-----------MENU-----------");
        System.out.println("\t\t\t\t1. Desplazar el Circulo1/Rectangulo1");
        System.out.println("\t\t\t\t2. Desplazar el Circulo2/Rectangulo2");
        System.out.println("\t\t\t\t3. Mostrar información de ambos ciruculos/rectangulos");
        System.out.println("\t\t\t\t4. Mostrar información del circulo/rectangulo mayor");
        System.out.println("\t\t\t\t5. Mostrar distancia entre circulos/rectangulos");
        System.out.println("\t\t\t\t6. Salir");
        System.out.print("\t\t\t\tSeleccione una opción: ");
    }

    // private static void desplazar(Circulo circulo, Scanner teclado){
    //     System.out.println("Ingrese un valor de X: ");
    //     double x = teclado.nextDouble();
    //     System.out.println("Ingrese un valor de Y: ");
    //     double y = teclado.nextDouble();
    //     circulo.desplazar(x, y);
    // }
    private static void desplazar(Rectangulo rectangulo, Scanner teclado){
        System.out.println("Ingrese un valor de X: ");
        double x = teclado.nextDouble();
        System.out.println("Ingrese un valor de Y: ");
        double y = teclado.nextDouble();
        rectangulo.desplazar(x, y);
    }

    // private static void mostrarMayor(Circulo circulo1, Circulo circulo2){
    //     Circulo elMayor = circulo1.elMayor(circulo2);
    //     elMayor.caracteristicas();
    // }
    
    private static void mostrarMayor(Rectangulo rectangulo1, Rectangulo rectangulo2){
        Rectangulo elMayor = rectangulo1.elMayor(rectangulo2);
        elMayor.caracteristicas();
    }
}
