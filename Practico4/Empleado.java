import java.util.*;

/**
 * Crea y permite manipular un objeto de tipo Empleado.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */

public class Empleado {

    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso; // Fecha de ingreso del empleado

    /**
     * Constructor que inicializa atributos por parametro.
     * 
     * @param p_cuil     long;
     * @param p_apellido String;
     * @param p_nombre   String;
     * @param p_importe  double;
     * @param p_anio     int;
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    /**
     * Constructor sobrecargado que inicializa atributos por parametro.
     * 
     * @param p_cuil     long;
     * @param p_apellido String;
     * @param p_nombre   String;
     * @param p_importe  double;
     * @param p_fecha    Calendar;
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }

    // Accessors
    public long getCuil() {
        return this.cuil;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getSueldoBasico() {
        return this.sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    // Metodo para obtener el año de ingreso del empleado (getter)
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }

    // Metodo para asignar el año de ingreso del empleado (setter)
    private void setAnioIngreso(int p_anioIngreso) {
        this.fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(Calendar.YEAR, p_anioIngreso);
    }

    // Metodo para obtener la fecha de ingreso del empleado (getter)
    public Calendar getFechaIngreso() {
        return this.fechaIngreso;
    }

    // Metodo para asignar la fecha de ingreso del empleado (setter)
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    // Fin de Accessors

    /**
     * Calcula la antiguedad del empleado, en funcion de su fecha de ingreso.
     * 
     * @return la antiguedad del empleado.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    /**
     * Calcula el descuento.
     * 
     * @return el descuento a realizar.
     */
    private double descuento() {
        return this.getSueldoBasico() * 0.02 + 1500;
    }

    /**
     * Calcula el adicional.
     * 
     * @return el adicional.
     */
    private double adicional() {
        if (this.antiguedad() < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (this.antiguedad() >= 2 && this.antiguedad() < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    /**
     * Calcula el sueldo neto.
     * 
     * @return el sueldo neto.
     */
    public double sueldoNeto() {
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }

    /**
     * Concatena el nombre y apellido.
     * 
     * @return Retorna el nombre y apellido concatenados.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + " " + getNombre();
    }

    /**
     * Muestra por pantalla los datos del empleado.
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " anios de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    /**
     * Concatena el cuil, apellido y nombre y sueldo.
     * 
     * @return el cuil, apellido y nombre, y sueldo neto del empleado.
     */
    public String mostrarLinea() {
        String resultado = String.format("%11d %-30s $%.2f", this.getCuil(), this.nomYApe(), this.sueldoNeto());
        return resultado;
    }

    /**
     * Verifica si es el aniversario del empleado.
     * 
     * @return true o false segun la verificacion.
     */
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_YEAR);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_YEAR);
        return diaHoy == diaIngreso;
    }
}
