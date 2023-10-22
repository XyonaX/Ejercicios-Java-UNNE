import java.util.*;

/**
 * Clase que representa a una persona con atributos como DNI, nombre, apellido y
 * fecha de nacimiento.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Persona {
    private int nroDni; // Número de Documento de Identidad de la persona
    private String nombre; // Nombre de la persona
    private String apellido; // Apellido de la persona
    private Calendar fechaNacimiento; // Fecha de nacimiento de la persona

    /**
     * Constructor para inicializar los atributos de la persona con año de
     * nacimiento.
     * 
     * @param p_dni      Número de Documento de Identidad.
     * @param p_nombre   Nombre de la persona.
     * @param p_apellido Apellido de la persona.
     * @param p_anio     Año de nacimiento.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }

    /**
     * Constructor para inicializar los atributos de la persona con fecha de
     * nacimiento.
     * 
     * @param p_dni      Número de Documento de Identidad.
     * @param p_nombre   Nombre de la persona.
     * @param p_apellido Apellido de la persona.
     * @param p_fecha    Fecha de nacimiento.
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha) {
        this.setDNI(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }

    // Accessors
    private void setDNI(int p_dni) {
        this.nroDni = p_dni;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public int getDNI() {
        return this.nroDni;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setAnioNacimiento(int p_anio) {
        this.fechaNacimiento = new GregorianCalendar();
        this.fechaNacimiento.set(Calendar.YEAR, p_anio);
    }

    // Método para obtener el año de nacimiento de la persona (getter)
    public int getAnioNacimiento() {
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

    // Fin Accessors
    /**
     * Calcula la edad de la persona.
     * 
     * @return Edad de la persona.
     */
    public int edad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }

    /**
     * Obtiene el nombre y apellido de la persona.
     * 
     * @return Nombre y apellido de la persona.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Obtiene el apellido y nombre de la persona.
     * 
     * @return Apellido y nombre de la persona.
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra los datos de la persona en pantalla.
     */
    public void mostrar() {

        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDNI() + " Edad: " + this.edad() + " años");
    }

    /**
     * Verifica si es el cumpleaños de la persona.
     * 
     * @return `true` si es el cumpleaños de la persona, de lo contrario `false`.
     */
    public boolean esCumpleanios() {
        Calendar fechaHoy = Calendar.getInstance();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = fechaHoy.get(Calendar.MONTH);

        int diaNacimiento = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);
        int mesNacimiento = this.fechaNacimiento.get(Calendar.MONTH);

        return diaHoy == diaNacimiento && mesHoy == mesNacimiento;
    }
}