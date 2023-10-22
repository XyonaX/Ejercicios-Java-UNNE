import java.util.*;

/**
 * Clase que representa a un empleado, hereda de la clase Persona e incluye
 * atributos específicos como CUIL, sueldo básico y fecha de ingreso.
 * Proporciona
 * métodos para obtener y establecer el CUIL, sueldo básico, año de ingreso,
 * fecha de ingreso, antigüedad, descuento, adicional, sueldo neto, nombre y
 * apellido,
 * apellido y nombre, así como para mostrar la información del empleado y
 * verificar
 * si es su aniversario de ingreso.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */

public class Empleado extends Persona {
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso; // Fecha de ingreso del empleado

    /**
     * Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo
     * básico e año de ingreso.
     * 
     * @param p_cuil     long que representa el CUIL del empleado.
     * @param p_apellido String que indica el apellido del empleado.
     * @param p_nombre   String que indica el nombre del empleado.
     * @param p_importe  double que indica el sueldo básico del empleado.
     * @param p_anio     int que indica el año de ingreso del empleado.
     * @param p_dni      int que indica el DNI del empleado.
     * @param p_fecha    int que indica la fecha de nacimiento del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio, int p_dni,
            int p_fecha) {
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    /**
     * Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo
     * básico y fecha de ingreso.
     * 
     * @param p_cuil     long que representa el CUIL del empleado.
     * @param p_apellido String que indica el apellido del empleado.
     * @param p_nombre   String que indica el nombre del empleado.
     * @param p_importe  double que indica el sueldo básico del empleado.
     * @param p_fecha    Calendar que indica la fecha de ingreso del empleado.
     * @param p_dni      int que indica el DNI del empleado.
     * @param p_anio     int que indica el año de ingreso del empleado.
     */
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, int p_dni,
            int p_anio) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setCuil(p_cuil);
        this.setFechaIngreso(p_fecha);
    }

    // Accessors
    public long getCuil() {
        return this.cuil;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
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

    // Fin Accessors
    /**
     * Calcula la antigüedad del empleado en años.
     * 
     * @return int que indica la antigüedad del empleado en años.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    /**
     * Calcula el descuento del sueldo del empleado.
     * 
     * @return double que indica el descuento del sueldo.
     */
    private double descuento() {
        return this.getSueldoBasico() * 0.02 + 1500;
    }

    /**
     * Calcula el adicional del sueldo del empleado según su antigüedad.
     * 
     * @return double que indica el adicional del sueldo.
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
     * Calcula el sueldo neto del empleado.
     * 
     * @return double que indica el sueldo neto del empleado.
     */
    public double sueldoNeto() {
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }

    /**
     * Obtiene el nombre y apellido del empleado.
     * 
     * @return String que representa el nombre y apellido del empleado.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Obtiene el apellido y nombre del empleado.
     * 
     * @return String que representa el apellido y nombre del empleado.
     */
    public String apeYNom() {
        return this.getApellido() + " " + getNombre();
    }

    /**
     * Muestra información sobre el empleado, incluyendo el DNI, CUIL, nombre,
     * apellido, antigüedad, sueldo neto.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    /**
     * Representa la información del empleado en una línea de texto formateada.
     * 
     * @return String que representa la información del empleado en una línea de
     *         texto.
     */
    public String mostrarLinea() {
        String resultado = String.format("%11d %-30s $%.2f", this.getCuil(), this.nomYApe(), this.sueldoNeto());
        return resultado;
    }

    /**
     * Verifica si es el aniversario de ingreso del empleado.
     * 
     * @return booleano que indica si es el aniversario de ingreso.
     */
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_YEAR);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_YEAR);
        return diaHoy == diaIngreso;
    }
}