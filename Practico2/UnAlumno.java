
public class UnAlumno
{

    public static void main(String[] args)
    {
        int id = Integer.parseInt(args[0]);
        String nombre = args[1];
        String apellido = args[2];

        
        Alumno alumno1 = new Alumno(id, nombre, apellido);
        alumno1.setNota1(10);
        alumno1.setNota2(9);
        
        alumno1.mostrar();
    }
}
