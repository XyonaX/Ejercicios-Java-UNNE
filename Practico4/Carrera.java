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

        // Alumno juan = new Alumno(30123, "Juan", "Perez");
        // Alumno pedro = new Alumno(32555, "Pedro", "Gomez");
        // Alumno maria = new Alumno(23564, "Maria", "Vasquez");
        // Alumno marcela = new Alumno(32655, "Marcela", "Martinez");

        int pregunta;
        do {
            System.out.println("Ingrese numero de libreta universitaria: ");
            int lu = teclado.nextInt();
            teclado.nextLine();
            System.out.println("Ingrese nombre del alumno: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingrese apellido del alumno: ");
            String apellido = teclado.nextLine();

            Alumno alumno = new Alumno(lu, nombre, apellido);
            programacion.inscribirAlumno(alumno);

            System.out.println("Desea ingresar otro alumno? 1-SI 2-NO: ");
            pregunta = teclado.nextInt();

        } while (pregunta == 1);

        for (Map.Entry<Integer, Alumno> alumno : programacion.getAlumnos().entrySet()) {
            System.out.printf("Ingrese la nota1 del alumno %s: ", alumno.getValue().nomYApe());
            double nota1 = teclado.nextDouble();
            alumno.getValue().setNota1(nota1);
            System.out.printf("Ingrese la nota2 del alumno %s: ", alumno.getValue().nomYApe());
            double nota2 = teclado.nextDouble();
            alumno.getValue().setNota1(nota2);
        }
        teclado.close();

        programacion.mostrarInscriptos();
        Alumno alumnoBuscado = programacion.buscarAlumno(32555);
        alumnoBuscado.mostrar();
        programacion.quitarAlumno(32555);
        programacion.mostrarInscriptos();

    }
}
