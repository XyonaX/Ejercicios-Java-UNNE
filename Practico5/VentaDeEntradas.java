import java.util.*;

public class VentaDeEntradas {
  public static void main(String args[]) {
    ArrayList<Visitante> visitantes = new ArrayList<>();
    Zoologico zoologico1 = new Zoologico("El Caribú", visitantes);
    Calendar fecha = new GregorianCalendar(2023, 10 - 1, 1);

    int opcion;
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.println("\n\n----- Menú -----");
      System.out.println("1. Agregar Visitante Individuo");
      System.out.println("2. Agregar Visitante Delegación");
      System.out.println("3. Listar Visitantes por Fecha");
      System.out.println("4. Calcular Recaudación");
      System.out.println("5. Salir");
      System.out.print("Elija una opción: ");
      opcion = scanner.nextInt();

      switch (opcion) {
        case 1:
          Visitante individuo = crearVisitanteIndividuo(fecha);
          zoologico1.nuevoVisitante(individuo);
          System.out.println("Visitante individuo agregado. Lista de visitantes:");
          break;
        case 2:
          Visitante delegacion = crearVisitanteDelegacion(fecha);
          zoologico1.nuevoVisitante(delegacion);
          System.out.println("Visitante delegación agregado. Lista de visitantes:");
          break;
        case 3:
          zoologico1.listaVisitantePorFecha(fecha);
          break;
        case 4:
          Calendar fechaInicio = new GregorianCalendar(2023, 8, 1);
          Calendar fechaFin = new GregorianCalendar(2023, 9, 30);

          System.out.println("Total recaudación: " + zoologico1.recaudacion(fechaInicio, fechaFin));
          break;
        case 5:
          System.out.println("Saliendo del programa...");
          break;
        default:
          System.out.println("Opción inválida. Intente de nuevo.");
      }
    } while (opcion != 5);

    scanner.close();
  }

  private static Visitante crearVisitanteIndividuo(Calendar fecha) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el código del visitante: ");
    String codigo = scanner.nextLine();

    System.out.print("Ingrese el año de nacimiento del visitante: ");
    int anioNacimiento = scanner.nextInt();
    scanner.nextLine();
    System.out.print("Ingrese el nombre del visitante: ");
    String nombre = scanner.nextLine();

    System.out.print("Ingrese el apellido del visitante: ");
    String apellido = scanner.nextLine();

    System.out.println("Ingrese DNI del visitante: ");
    int dni = scanner.nextInt();

    return new Individuo(codigo, fecha, new Persona(dni, nombre, apellido, anioNacimiento));
  }

  private static Visitante crearVisitanteDelegacion(Calendar fecha) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Ingrese el nombre de la delegación: ");
    String nombreDelegacion = scanner.nextLine();

    ArrayList<Individuo> integrantes = new ArrayList<>();

    int agregarMasIntegrantes;
    do {
      Visitante individuo = crearVisitanteIndividuo(fecha);
      integrantes.add((Individuo) individuo);

      System.out.print("¿Desea agregar otro integrante? 1.Si 2.No: ");
      agregarMasIntegrantes = scanner.nextInt();
      scanner.nextLine(); // Consumir el salto de línea
    } while (agregarMasIntegrantes == 1);
    return new Delegacion(nombreDelegacion, fecha, integrantes);
  }
}
