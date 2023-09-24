import java.util.Map;
import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        // 32555 Pedro Gomez
        // 23564 Maria Vasquez
        // 30123 Juan Perez
        // 32655 Marcela Martinez
        Curso programacion = new Curso("Programacion");

        Scanner teclado = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de la Carrera ---");
            System.out.println("1. Ingresar Alumno");
            System.out.println("2. Ingresar Notas");
            System.out.println("3. Mostrar Inscriptos");
            System.out.println("4. Buscar Alumno");
            System.out.println("5. Quitar Alumno");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    agregarAlumno(teclado, programacion);
                    break;
                case 2:
                    cargarNotas(teclado, programacion);
                    break;
                case 3:
                    programacion.mostrarInscriptos();
                    break;
                case 4:
                    buscarAlumno(teclado, programacion);
                    break;
                case 5:
                    quitarAlumno(teclado, programacion);
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
                    break;
            }
        } while (opcion != 6);
        teclado.close();
    }

    private static void agregarAlumno(Scanner teclado, Curso curso) {
        System.out.println("Ingrese numero de libreta universitaria: ");
        int lu = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese nombre del alumno: ");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese apellido del alumno: ");
        String apellido = teclado.nextLine();

        Alumno alumno = new Alumno(lu, nombre, apellido);
        curso.inscribirAlumno(alumno);
    }

    private static void cargarNotas(Scanner teclado, Curso curso) {
        for (Map.Entry<Integer, Alumno> alumnoEntry : curso.getAlumnos().entrySet()) {
            System.out.printf("Ingrese la nota1 del alumno %s: ", alumnoEntry.getValue().nomYApe());
            double nota1 = teclado.nextDouble();
            alumnoEntry.getValue().setNota1(nota1);

            System.out.printf("Ingrese la nota2 del alumno %s: ", alumnoEntry.getValue().nomYApe());
            double nota2 = teclado.nextDouble();
            alumnoEntry.getValue().setNota2(nota2);
        }
    }

    private static void buscarAlumno(Scanner teclado, Curso curso) {
        System.out.println("Ingrese el número de libreta universitaria del alumno a buscar: ");
        int luBuscar = teclado.nextInt();
        teclado.nextLine();
        Alumno alumnoBuscado = curso.buscarAlumno(luBuscar);
        if (alumnoBuscado != null) {
            alumnoBuscado.mostrar();
        } else {
            System.out.println("No se encontró un alumno con ese número de libreta.");
        }
    }

    private static void quitarAlumno(Scanner teclado, Curso curso) {
        System.out.println("Ingrese el número de libreta universitaria del alumno a quitar: ");
        int luQuitar = teclado.nextInt();
        teclado.nextLine();
        curso.quitarAlumno(luQuitar);
        if (!curso.estaInscripto(luQuitar)) {
            System.out.println("Alumno eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar al alumno.");
        }
    }
}
