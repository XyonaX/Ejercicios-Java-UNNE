import java.util.*;


public class Persona
{

    private int nroDni;
    private String nombre; 
    private String apellido;
    private int anioNacimiento;
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_nombre);
        this.setAnioNacimiento(p_anio);
    }

    
    private void setDNI(int p_dni){
        this.nroDni = p_dni;
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        this.anioNacimiento = p_anio;
    }
    
    public int getDNI(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
        
    }
    
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + " Edad: " + this.edad());
    }
}
