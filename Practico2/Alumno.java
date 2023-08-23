
public class Alumno
{
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;
    
    public Alumno(int p_lu, String p_nombre, String p_apellido)
    {
        this.lu = p_lu;
        this.nombre = p_nombre;
        this.apellido = p_apellido;
        this.nota1 = 0.0;
        this.nota2 = 0.0;
    }
    
    public void setNota1(double p_nota){
        this.nota1 = p_nota;
    }

    public void setNota2(double p_nota){
        this.nota2 = p_nota;
    }
    
    private boolean aprueba(){
        if(this.promedio() >= 6){
            return true;
        }else{
            return false;
        }
    }
    
    private String leyendaAprueba(){
        if(this.aprueba() == true){
            return "APROBADO";
        }else{
            return "DESAPROBADO";
        }
    }
    
    public double promedio(){
        return (this.nota1 + this.nota2)/2;
    }
    
    public String nomYApe(){
        return this.nombre + " " + this.apellido;
    }
    
    public String apeYNom(){
        return this.apellido + " " + this.nombre;
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: "+ this.nomYApe());
        System.out.println("LU: "+ this.lu + "\tNotas: " + this.nota1 +"-" +this.nota2 );
        System.out.println("Promedio: " +this.promedio() +"-" + this.leyendaAprueba());
    }
}
