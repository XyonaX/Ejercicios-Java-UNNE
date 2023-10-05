public class Escuela {
    public static void main(String[] args) {
        Persona persona = new Persona(41442040, "Jonatan", "Vargas", 1998);
        Alumno alumno = new Alumno(1, "Luis", "Gomez", 123, 2003);

        persona.mostrar();
        System.out.println("\n\n");
        alumno.mostrar();
        alumno.setNota1(8);
        alumno.setNota2(9.4);
        alumno.mostrar();
    }
}
