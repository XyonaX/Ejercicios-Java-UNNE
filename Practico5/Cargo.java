import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Clase que representa un cargo en una institución educativa. Contiene
 * información sobre el nombre del cargo,
 * su sueldo básico, el año de ingreso y las horas de docencia asociadas al
 * cargo.
 * Proporciona métodos para calcular la antigüedad, el adicional por antigüedad,
 * el sueldo total del cargo y
 * mostrar información detallada del cargo.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Cargo {
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    /**
     * Constructor para inicializar un objeto de tipo Cargo.
     * 
     * @param p_cargo         Nombre del cargo.
     * @param p_sueldo        Sueldo básico asociado al cargo.
     * @param p_anioIngreso   Año de ingreso al cargo.
     * @param p_horasDocencia Horas de docencia asociadas al cargo.
     */
    public Cargo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia) {
        this.setCargo(p_cargo);
        this.setSueldo(p_sueldo);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDocencia(p_horasDocencia);
    }

    // Accessors
    private void setCargo(String p_cargo) {
        this.nombreCargo = p_cargo;
    }

    private void setSueldo(double p_sueldo) {
        this.sueldoBasico = p_sueldo;
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.anioIngreso = p_anioIngreso;
    }

    private void setHorasDocencia(int p_horasDocencia) {
        this.horasDeDocencia = p_horasDocencia;
    }

    public String getCargo() {
        return this.nombreCargo;
    }

    public double getSueldo() {
        return this.sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.anioIngreso;
    }

    public int getHorasDocencia() {
        return this.horasDeDocencia;
    }

    // Fin Accessors
    /**
     * Calcula la antigüedad en años del empleado a partir del año de ingreso.
     * 
     * @return Antigüedad en años.
     */
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return anioActual - this.getAnioIngreso();
    }

    /**
     * Calcula el adicional por antigüedad basado en el sueldo básico y la
     * antigüedad.
     * 
     * @return Adicional por antigüedad.
     */
    private double adicionalXAntiguedad() {
        return this.getSueldo() * 0.01 * this.antiguedad();
    }

    /**
     * Calcula el sueldo total del cargo sumando el sueldo básico y el adicional por
     * antigüedad.
     * 
     * @return Sueldo total del cargo.
     */
    public double sueldoDelCargo() {
        return this.getSueldo() + this.adicionalXAntiguedad();
    }

    /**
     * Muestra información detallada del cargo, incluyendo nombre, sueldo básico,
     * sueldo total, antigüedad y horas de docencia.
     */
    public void mostrarCargo() {
        System.out.printf(
                "%s\t- Sueldo Basico: %.2f\t - Sueldo Cargo: %.2f\t - Antiguedad: %d años\nHoras Docencia: %d",
                this.getCargo(), this.getSueldo(), this.sueldoDelCargo(), this.antiguedad(), this.getHorasDocencia());
    }

}
