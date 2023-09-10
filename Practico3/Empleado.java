import java.util.*;

public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;

   
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_anio);
        this.setAnioIngreso(p_anio);
    }
    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, Calendar p_fecha)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setFechaIngreso(p_fecha);
    }

    public long getCuil() {
        return cuil;
    }

    private void setCuil(long p_cuil) {
        this.cuil = p_cuil;
    }

    public String getApellido() {
        return apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    private void setSueldoBasico(double p_sueldoBasico) {
        this.sueldoBasico = p_sueldoBasico;
    }

    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }

    private void setAnioIngreso(int p_anioIngreso) {
        this.fechaIngreso = new GregorianCalendar();
        this.fechaIngreso.set(Calendar.YEAR,p_anioIngreso);
    }

    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }
    private void setFechaIngreso(Calendar p_fechaIngreso) {
        this.fechaIngreso = p_fechaIngreso;
    }

    

    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    private double descuento(){
        return this.sueldoBasico * 0.02 + 1500;
    }

    private double adicional(){
        if (this.antiguedad() < 2) {
            return this.sueldoBasico * 0.02;
        }else if (this.antiguedad() >= 2 &&  this.antiguedad() < 10) {
            return this.sueldoBasico * 0.04;
        }else{
            return this.sueldoBasico * 0.06;
        }
    }

    public double sueldoNeto(){
        return (this.sueldoBasico + this.adicional()) - this.descuento();
    }

    public String nomYApe(){
        return this.nombre + " " + this.apellido;
    }

    public void mostrar(){
        System.out.println("Nombre y Apellido: " +this.nomYApe());
        System.out.println("CUIL: " + this.cuil + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $"+this.sueldoNeto());
    }

    public String mostrarLinea(){
        String resultado = String.format("%11d %-30s $%.2f", this.cuil, this.nomYApe(), this.sueldoNeto());
        return resultado;
    }

    public boolean esAniversario(){
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_YEAR);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_YEAR);

        return diaHoy == diaIngreso;
    }
}
