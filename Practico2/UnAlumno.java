
public class UnAlumno
{

    public static void main(String[] args)
    {
        Alumno alumno1 = new Alumno(1,"Jonatan","Vargas");
        Alumno alumno2 = new Alumno(2," Juan","Perez");
        alumno1.setNota1(10);
        alumno1.setNota2(9);
        alumno2.setNota1(3);
        alumno2.setNota2(5);
        
        alumno1.mostrar();
        alumno2.mostrar();
    }
}
