import java.util.Calendar;
import java.util.GregorianCalendar;

public class EmpleadoConJefe {
    private long cuil;  
    private String apellido;  
    private String nombre;  
    private double sueldoBasico;  
    private Calendar fechaIngreso;  // Fecha de ingreso del empleado
    private EmpleadoConJefe jefe;  // Jefe del empleado

    // Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo básico, fecha de ingreso y jefe
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fecha,
            EmpleadoConJefe p_jefe) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fecha);
        this.setJefe(p_jefe);
    }

    // Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo básico y fecha de ingreso
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_sueldoBasico, Calendar p_fecha) {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_sueldoBasico);
        this.setFechaIngreso(p_fecha);
        this.setJefe(null);
    }

    // Constructor para inicializar un empleado con CUIL, apellido, nombre, sueldo básico e año de ingreso
    public EmpleadoConJefe(long p_cuil, String p_apellido, String p_nombre, double p_importe, int p_anio)
    {
        this.setCuil(p_cuil);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSueldoBasico(p_anio);
        this.setAnioIngreso(p_anio);
        this.setJefe(null);
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

    // Método para obtener la fecha de ingreso del empleado (getter)
    public Calendar getFechaIngreso() {
        return fechaIngreso;
    }

    // Método para asignar la fecha de ingreso del empleado (setter)
    private void setFechaIngreso(Calendar p_fecha) {
        this.fechaIngreso = p_fecha;
    }

    // Método para obtener el jefe del empleado (getter)
    public EmpleadoConJefe getJefe() {
        return jefe;
    }

    // Método para asignar el jefe del empleado (setter)
    private void setJefe(EmpleadoConJefe p_jefe) {
        this.jefe = p_jefe;
    }

    // Método para asignar el año de ingreso del empleado (setter)
    private void setAnioIngreso(int p_anioIngreso) {
        this.fechaIngreso = Calendar.getInstance();
        this.fechaIngreso.set(Calendar.YEAR, p_anioIngreso);
    }

    // Método para obtener el año de ingreso del empleado (getter)
    public int getAnioIngreso() {
        return this.fechaIngreso.get(Calendar.YEAR);
    }

    // Método para calcular la antigüedad del empleado en años
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getFechaIngreso().get(Calendar.YEAR);
    }

    // Método para calcular el descuento del sueldo del empleado
    private double descuento(){
        return this.getSueldoBasico() * 0.02 + 1500;
    }

    // Método para calcular el adicional del sueldo del empleado según su antigüedad
    private double adicional(){
        if (this.antiguedad() < 2) {
            return this.getSueldoBasico() * 0.02;
        }else if (this.antiguedad() >= 2 &&  this.antiguedad() < 10) {
            return this.getSueldoBasico() * 0.04;
        }else{
            return this.getSueldoBasico() * 0.06;
        }
    }

    // Método para calcular el sueldo neto del empleado
    public double sueldoNeto(){
        return (this.getSueldoBasico() + this.adicional()) - this.descuento();
    }

    // Método para obtener el nombre y apellido del empleado
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }

    // Método para obtener el apellido y nombre del empleado
    public String apeYNom(){
        return this.getApellido() + " " +getNombre() ;
    }

    // Método para mostrar información sobre el empleado
    public void mostrar(){
        System.out.println("Nombre y Apellido: " +this.nomYApe());
        System.out.println("CUIL: " + this.getCuil() + " Antiguedad: " + this.antiguedad() + " años de servicio");
        System.out.println("Sueldo Neto: $" + this.sueldoNeto());
        if(this.getJefe() != null){
            System.out.println("Responde a: " +this.getJefe().apeYNom());
        }else{
            System.out.println("Responde a: GERENTE GENERAL");
        }
    }

    // Método para representar la información del empleado en una línea de texto
    public String mostrarLinea(){
        String resultado = String.format("%11d %-30s $%.2f", this.getCuil(), this.nomYApe(), this.sueldoNeto());
        return resultado;
    }

    // Método para verificar si es el aniversario de ingreso del empleado
    public boolean esAniversario(){
        Calendar fechaHoy = new GregorianCalendar();
        int diaHoy = fechaHoy.get(Calendar.DAY_OF_YEAR);
        int diaIngreso = this.getFechaIngreso().get(Calendar.DAY_OF_YEAR);
        return diaHoy == diaIngreso;
    }
}
