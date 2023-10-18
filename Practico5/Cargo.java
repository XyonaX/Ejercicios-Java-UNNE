import java.util.*;

public class Cargo {
    private String nombreCargo;
    private double sueldoBasico;
    private int anioIngreso;
    private int horasDeDocencia;

    public Cargo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia) {
        this.setCargo(p_cargo);
        this.setSueldo(p_sueldo);
        this.setAnioIngreso(p_anioIngreso);
        this.setHorasDocencia(p_horasDocencia);
    }

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

    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioActual = fechaHoy.get(Calendar.YEAR);
        return anioActual - this.getAnioIngreso();
    }

    private double adicionalXAntiguedad() {
        return this.getSueldo() * 0.01 * this.antiguedad();
    }

    public double sueldoDelCargo() {
        return this.getSueldo() + this.adicionalXAntiguedad();
    }

    public void mostrarCargo() {
        System.out.printf(
                "%s\t- Sueldo Basico: %.2f\t - Sueldo Cargo: %.2f\t - Antiguedad: %d años\nHoras Docencia: %d",
                this.getCargo(), this.getSueldo(), this.sueldoDelCargo(), this.antiguedad(), this.getHorasDocencia());
    }

}