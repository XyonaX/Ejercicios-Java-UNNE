import java.util.*;

public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private int anioIngreso;

    public Empleado(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.cuil = p_cuil;
        this.apellido = p_apellido;
        this.nombre = p_nombre;
        this.sueldoBasico = p_importe;
        this.anioIngreso = p_anio;
    }

    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.anioIngreso;
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
        return String.format("%11d %-30s $%,.2f", this.cuil, this.nomYApe(), this.sueldoNeto());
    }
}
