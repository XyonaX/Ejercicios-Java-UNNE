import java.util.Scanner;
public class GestionStock
{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        Laboratorio lab1 = new Laboratorio("Colgate S.A","Scalabrini Ortiz 5524","54-11 -4239-8447");
        int opc;
        Productos producto = null;

        do {
            mostrarMenu();
            opc = teclado.nextInt();

            switch(opc){
                case 1:
                    producto = crearNuevoProducto(teclado,lab1);
                    pausarPrograma();
                    break;
                case 2: 
                    producto.mostrar();
                    pausarPrograma();
                    break;
                case 3:
                    ajusteStock(teclado,producto);
                    pausarPrograma();
                    break;
                case 4:
                    String precios = String.format("Producto: %s\nPrecio Lista: %.2f \tPrecio Contado: %.2f",producto.getDescripcion(),producto.precioLista(), producto.precioContado());
                    System.out.println(precios);
                    break;
                case 5:
                    ajustarPtoRepo(teclado, producto);
                    break;
                case 6:
                    ajustarExistMinima(teclado, producto);
                    break;
                case 7:
                    System.out.println("Hasta Luego!");
                    break;
                default:
                    System.out.println("Valor incorrecto!");
                    mostrarMenu();
            }
        } while (opc != 7);

        teclado.close();
    }

    private static void mostrarMenu(){
        System.out.println("\t\t\t\t-----------MENU-----------");
        System.out.println("\t\t\t\t1. Crear un nuevo producto");
        System.out.println("\t\t\t\t2. Mostrar información de un producto");
        System.out.println("\t\t\t\t3. Realizar ajuste de stock");
        System.out.println("\t\t\t\t4. Precios");
        System.out.println("\t\t\t\t5. Ajustar PtoRepo");
        System.out.println("\t\t\t\t6. Ajustar Existencia Minima");
        System.out.println("\t\t\t\t7. Salir");
        System.out.print("\t\t\t\tSeleccione una opción: ");
    }

    private static Productos crearNuevoProducto(Scanner teclado, Laboratorio lab){
        System.out.println("Ingrese el codigo del producto: ");
        int cod = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Ingrese el rubro del producto");
        String rubro = teclado.nextLine();

        System.out.println("Ingrese la descripcion del producto: ");
        String desc = teclado.nextLine();

        System.out.println("Ingrese el costo del producto: ");
        double costo = teclado.nextDouble();

        System.out.print("¿Desea especificar el porcentaje de punto de reposición? (S/N): ");
        char opcionPorcPtoRepo = teclado.next().charAt(0);
        double porcPtoRepo = 0;  // Valor por defecto
        if (opcionPorcPtoRepo == 'S' || opcionPorcPtoRepo == 's') {
            System.out.print("Ingrese el porcentaje de punto de reposición: ");
            porcPtoRepo = teclado.nextDouble();
        }

        System.out.print("¿Desea especificar la existencia mínima? (S/N): ");
        char opcionExistMinima = teclado.next().charAt(0);
        int existMinima = 0;  // Valor por defecto
        if (opcionExistMinima == 'S' || opcionExistMinima == 's') {
            System.out.print("Ingrese la existencia mínima: ");
            existMinima = teclado.nextInt();
        }

        Productos producto = new Productos(cod,rubro,desc,costo,porcPtoRepo,existMinima,lab);
        System.out.println("Producto creado Exitosamente!");
        return producto;
    }

    private static void ajusteStock(Scanner teclado, Productos producto){
        System.out.println("Ingrese la cantadidad de stock: ");
        int stock = teclado.nextInt();
        producto.ajuste(stock);
    }

    private static void ajustarPtoRepo(Scanner teclado,Productos producto){
        System.out.println("Ingrese un valor de ptoRepo: ");
        double ptoRepo = teclado.nextDouble();
        producto.ajustarPtoRepo(ptoRepo);
    }

    private static void ajustarExistMinima(Scanner teclado, Productos producto){
        System.out.println("Ingrese un valor de existencia minima: ");
        int existMin = teclado.nextInt();
        producto.ajustarExistMinima(existMin);
    }

    private static void pausarPrograma() {
        System.out.print("Presiona Enter para continuar...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
    }

}
