import java.util.ArrayList;
import java.util.Scanner;

public class ArmadoPedido {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Renglon> etiquetas = new ArrayList<>();
        Pedido pedidos = new Pedido(etiquetas);

        int opcion;
        do {
            System.out.println("\n\n----- Menú -----");
            System.out.println("1. Agregar Renglón");
            System.out.println("2. Mostrar Pedido");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Renglon renglon = crearRenglon();
                    etiquetas.add(renglon);
                    break;
                case 2:
                    pedidos.mostrar();
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

    private static Renglon crearRenglon() {
        System.out.print("Ingrese la cantidad de etiquetas: ");
        int cantidad = scanner.nextInt();

        System.out.print("Ingrese el tipo de etiqueta (1: Comun, 2: Premium): ");
        int tipoEtiqueta = scanner.nextInt();

        Etiqueta etiqueta;
        switch (tipoEtiqueta) {
            case 1:
                System.out.print("Ingrese el precio base de la etiqueta común: ");
                double precioBaseComun = scanner.nextDouble();
                etiqueta = new Comun(precioBaseComun, 100);
                break;
            case 2:
                System.out.print("Ingrese el precio base de la etiqueta premium: ");
                double precioBasePremium = scanner.nextDouble();
                System.out.println("Ingrese cantidad de colores: ");
                int colores = scanner.nextInt();
                etiqueta = new Premium(precioBasePremium, colores);
                break;
            default:
                System.out.println("Opción de tipo de etiqueta inválida. Se creará una etiqueta común por defecto.");
                etiqueta = new Comun(100, cantidad);
                break;
        }
        return new Renglon(cantidad, etiqueta);
    }

}
