public class Empresa {
    public static void main(String[] args) {
        Persona persona = new Persona(12345678, "Juan", "Perez", 1990);
        Empleado empleado = new Empleado(98765432, "Maria", "Lopez", 2500, 2010, 23456789, 1988);

        System.out.println("Datos de la persona:");
        persona.mostrar();
        System.out.println("\nDatos del empleado:");
        empleado.mostrar();
    }
}
