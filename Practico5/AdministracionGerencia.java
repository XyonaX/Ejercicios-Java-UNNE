import java.util.*;

public class AdministracionGerencia {
  private static Scanner scanner = new Scanner(System.in);

  public static void main(String args[]) {

    ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();

    Gerencia gerencia = new Gerencia("Los arroyos", alojamientos);

    int opcion;
    do {
      System.out.println("\n\n----- Menú -----");
      System.out.println("1. Agregar Alojamiento");
      System.out.println("2. Mostrar Liquidación");
      System.out.println("3. Salir");
      System.out.print("Elija una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          agregarAlojamiento(gerencia);
          break;
        case 2:
          gerencia.mostrarLiquidacion();
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

  private static void agregarAlojamiento(Gerencia gerencia) {
    System.out.println("Seleccione el tipo de alojamiento:");
    System.out.println("1. Hotel");
    System.out.println("2. Cabaña");
    int tipo = scanner.nextInt();
    String tipoHibitacion = "";
    int capacidad = 0;

    scanner.nextLine();
    if (tipo == 1) {
      System.out.println("Ingrese el tipo de habitacion: ");
      tipoHibitacion = scanner.nextLine();
    } else {
      System.out.print("Ingrese la capacidad del alojamiento: ");
      capacidad = scanner.nextInt();
    }

    System.out.print("Ingrese el nombre del alojamiento: ");
    String nombre = scanner.next();
    System.out.print("Ingrese el costo por noche: ");
    double costoPorNoche = scanner.nextDouble();
    System.out.print("Ingrese la cantidad de noches: ");
    int cantidadNoches = scanner.nextInt();

    ArrayList<Servicio> servicios = new ArrayList<Servicio>();
    System.out.println("Ingrese los servicios (ingrese 'fin' para terminar):");
    while (true) {
      System.out.print("Nombre del servicio (o 'fin' para terminar): ");
      String nombreServicio = scanner.next();
      if (nombreServicio.equalsIgnoreCase("fin")) {
        break;
      }
      System.out.print("Costo del servicio: ");
      double costoServicio = scanner.nextDouble();
      servicios.add(new Servicio(nombreServicio, costoServicio));
    }

    if (tipo == 1) {
      Hotel hotel = new Hotel(tipoHibitacion, nombre, costoPorNoche, cantidadNoches, servicios);
      gerencia.agregarAlojamiento(hotel);
    } else if (tipo == 2) {
      Cabania cabania = new Cabania(capacidad, nombre, costoPorNoche, cantidadNoches, servicios);
      gerencia.agregarAlojamiento(cabania);
    } else {
      System.out.println("Opción inválida.");
    }
  }
}