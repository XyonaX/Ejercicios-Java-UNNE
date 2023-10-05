import java.util.*;

public class Empleado extends Persona {
    private long cuil;
    private double sueldoBasico;
    private Calendar fechaIngreso; // Fecha de ingreso del empleado

    // Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo
    // básico e año de ingreso
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio, int p_dni,
            int p_fecha) {
        super(p_dni, p_nombre, p_apellido, p_fecha);
        this.setCuil(p_cuil);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }

    // Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo
    // básico y fecha de ingreso
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha, int p_dni,
            int p_anio) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setCuil(p_cuil);
        this.setFechaIngreso(p_fecha);
    }

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

    // Metodo para calcular la antigüedad del empleado en años
    public int antiguedad() {
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    // Metodo para calcular el descuento del sueldo del empleado
    private double descuento() {
        return this.getSueldoBasico() * 0.02 + 1500;
    }

    // Metodo para calcular el adicional del sueldo del empleado según su antigüedad
    private double adicional() {
        if (this.antiguedad() < 2) {
            return this.getSueldoBasico() * 0.02;
        } else if (this.antiguedad() >= 2 && this.antiguedad() < 10) {
            return this.getSueldoBasico() * 0.04;
        } else {
            return this.getSueldoBasico() * 0.06;
        }
    }

    // Metodo para calcular el sueldo neto del empleado
    public double sueldoNeto() {
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }

    // Metodo para obtener el nombre y apellido del empleado
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    // Metodo para obtener el apellido y nombre del empleado
    public String apeYNom() {
        return this.getApellido() + " " + getNombre();
    }

    // Metodo para mostrar información sobre el empleado
    public void mostrar() {
        super.mostrar();
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
    }

    // Metodo para representar la información del empleado en una línea de texto
    public String mostrarLinea() {
        String resultado = String.format("%11d %-30s $%.2f", this.getCuil(), this.nomYApe(), this.sueldoNeto());
        return resultado;
    }

    // Metodo para verificar si es el aniversario de ingreso del empleado
    public boolean esAniversario() {
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_YEAR);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_YEAR);
        return diaHoy == diaIngreso;
    }
}
