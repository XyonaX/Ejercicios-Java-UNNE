import java.util.Scanner;

public class Comercio {
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
                int opcion;
                do {
                        System.out.println("\n\n----- Menú -----");
                        System.out.println("1. Ver información de Cocina");
                        System.out.println("2. Ver información de Heladera");
                        System.out.println("3. Ver información de Lavarropas");
                        System.out.println("4. Salir");
                        System.out.print("Elija una opción: ");
                        opcion = scanner.nextInt();

                        switch (opcion) {
                                case 1:
                                        mostrarInformacion(new Cocina("Volcan", 600, 15, 4, 2000, "80*60*60"));
                                        break;
                                case 2:
                                        mostrarInformacion(new Heladera("Gafa", 2000, 8, 4, 2, true));
                                        break;
                                case 3:
                                        mostrarInformacion(new Lavarropas("Drean", 1500, 10, 4, 6, false));
                                        break;
                                case 4:
                                        System.out.println("Saliendo del programa...");
                                        break;
                                default:
                                        System.out.println("Opción inválida. Intente de nuevo.");
                        }
                } while (opcion != 4);
        }

        private static void mostrarInformacion(ArtefactoHogar artefacto) {
                int cuotas = 0;

                System.out.println("Elija las cuotas: \n1.3 Cuotas\n2.6 Cuotas\n3.12 Cuotas");
                System.out.println("Su opcion: ");
                int opc = scanner.nextInt();
                float interes = (float) 2.53;
                switch (opc) {
                        case 1:
                                cuotas = 3;
                                break;
                        case 2:
                                cuotas = 6;
                                break;
                        case 3:
                                cuotas = 12;
                                break;
                        default:
                                System.out.println("Opcion incorrecta!");
                                break;
                }

                artefacto.imprimir();
                System.out.printf("Cuotas: %d - Interes: %.2f%%", cuotas, interes);
                System.out.printf("\nValor Cuota: $%.2f\nValor Cuota Con Adicionales: $%.2f\n",
                                artefacto.cuotaCredito(cuotas, interes),
                                artefacto.creditoConAdicional(cuotas, interes));
        }
}
