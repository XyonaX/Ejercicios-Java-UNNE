import java.util.ArrayList;
import java.util.Scanner;

public class AplicacionFacultad {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Profesor> profesores = new ArrayList<>();
        Facultad unne = new Facultad("UNNE");

        int opcion;
        do {
            System.out.println("\n\n----- Menú -----");
            System.out.println("1. Agregar Profesor");
            System.out.println("2. Listar Profesores por Cargos");
            System.out.println("3. Mostrar Nómina de Profesores");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Profesor profesor = crearProfesor();
                    unne.altaProfesor(profesor);
                    profesores.add(profesor);
                    break;
                case 2:
                    unne.listarProfesoresCargos();
                    break;
                case 3:
                    unne.nominaProfesores();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }

    private static Profesor crearProfesor() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el DNI del profesor: ");
        int dni = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el nombre del profesor: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido del profesor: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el año de nacimiento del profesor: ");
        int anioNacimiento = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        System.out.print("Ingrese el título del profesor: ");
        String titulo = scanner.nextLine();

        ArrayList<Cargo> cargos = new ArrayList<>();
        int agregarMasCargos = 1;
        int horasInvestigacion;
        while (cargos.size() < 3 && agregarMasCargos == 1) {
            System.out.print("Ingrese el nombre del cargo: ");
            String nombreCargo = scanner.nextLine();

            System.out.print("Ingrese el sueldo básico del cargo: ");
            double sueldoBasico = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese la cantidad de horas de docencia: ");
            int horasDocencia = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el tipo de cargo (1: Simple, 2: SemiExclusivo, 3: Exclusivo): ");
            int tipoCargo = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            Cargo cargo;
            switch (tipoCargo) {
                case 1:
                    cargo = new Cargo(nombreCargo, sueldoBasico, anioNacimiento, horasDocencia);
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad de horas de investigación: ");
                    horasInvestigacion = scanner.nextInt();
                    cargo = new SemiExclusivo(nombreCargo, sueldoBasico, anioNacimiento, horasDocencia,
                            horasInvestigacion);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad de horas de investigación: ");
                    horasInvestigacion = scanner.nextInt();
                    System.out.print("Ingrese la cantidad de horas de extensión: ");
                    int horasExtension = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de línea
                    cargo = new Exclusivo(nombreCargo, sueldoBasico, anioNacimiento, horasDocencia, horasInvestigacion,
                            horasExtension);
                    break;
                default:
                    System.out.println("Opción de tipo de cargo inválida. Se creará un cargo Simple por defecto.");
                    cargo = new Cargo(nombreCargo, sueldoBasico, anioNacimiento, horasDocencia);
                    break;
            }

            cargos.add(cargo);

            if (cargos.size() < 3) {
                System.out.println("¿Desea agregar otro cargo? 1.Si 2.No: ");
                agregarMasCargos = scanner.nextInt();
                scanner.nextLine(); // Consumir el salto de línea
            } else {
                System.out.println("El profesor ya tiene 3 cargos y no puede agregar más.");
                agregarMasCargos = 2;
            }
        }

        Profesor profesor = new Profesor(dni, nombre, apellido, anioNacimiento, titulo, cargos);

        return profesor;
    }

}
