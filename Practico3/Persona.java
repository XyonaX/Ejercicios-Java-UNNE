import java.util.*;


public class Persona
{

    private int nroDni;
    private String nombre; 
    private String apellido;
    private Calendar fechaNacimiento;

    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_nombre);
        this.setAnioNacimiento(p_anio);
    }

    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha)
    {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_nombre);
        this.setFechaNacimiento(p_fecha);
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
        this.fechaNacimiento = new GregorianCalendar();
        this.fechaNacimiento.set(Calendar.YEAR,p_anio);
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
        return this.fechaNacimiento.get(Calendar.YEAR);
    }

    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public boolean esCumpleanios() {
        Calendar fechaHoy = Calendar.getInstance();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = fechaHoy.get(Calendar.MONTH);

        int diaNacimiento = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mesNacimiento = this.fechaNacimiento.get(Calendar.MONTH);

        return diaHoy == diaNacimiento && mesHoy == mesNacimiento;
    }
}
