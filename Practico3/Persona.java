import java.util.*;

public class Persona {
    private int nroDni;                
    private String nombre;            
    private String apellido;          
    private Calendar fechaNacimiento; // Fecha de nacimiento de la persona

    // Constructor para inicializar los atributos de la persona con año de nacimiento
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    // Constructor para inicializar los atributos de la persona con fecha de nacimiento
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
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

    
    public int getDNI(){
        return this.nroDni;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    private void setAnioNacimiento(int p_anio){
        this.fechaNacimiento = new GregorianCalendar();
        this.fechaNacimiento.set(Calendar.YEAR, p_anio);
    }
    // Método para obtener el año de nacimiento de la persona (getter)
    public int getAnioNacimiento(){
        return this.fechaNacimiento.get(Calendar.YEAR);
    }

    // Método para obtener la fecha de nacimiento de la persona (getter)
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para asignar la fecha de nacimiento de la persona (setter)
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Método para calcular la edad de la persona
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }

    // Método para obtener el nombre y apellido de la persona
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }

    // Método para obtener el apellido y nombre de la persona
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }

    // Método para mostrar los datos de la persona en pantalla
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + " Edad: " + this.edad());
    }

    // Método para verificar si es el cumpleaños de la persona
    public boolean esCumpleanios() {
        Calendar fechaHoy = Calendar.getInstance();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = fechaHoy.get(Calendar.MONTH);

        int diaNacimiento = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mesNacimiento = this.fechaNacimiento.get(Calendar.MONTH);

        return diaHoy == diaNacimiento && mesHoy == mesNacimiento;
    }
}
