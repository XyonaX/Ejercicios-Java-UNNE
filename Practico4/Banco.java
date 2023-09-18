import java.util.ArrayList;

public class Banco {
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados;

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleado);
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>(p_empleados));
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public int getNroSucursal() {
        return this.nroSucursal;
    }

    public void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }

    public Localidad getLocalidad() {
        return this.localidad;
    }

    public void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    private void setEmpleados(Empleado p_empleados) {
        this.empleados = new ArrayList<>();
        this.empleados.add(p_empleados);
    }

    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().remove(p_empleado);
    }

    public void listarSueldos() {
        for (Empleado empleado : this.getEmpleados()) {
            System.out.printf("%d\t%s -------------------------  $%.2f", empleado.getCuil(), empleado.apeYNom(),
                    empleado.sueldoNeto());
        }
    }

    public double sueldosAPagar() {
        double totalAPagar = 0.0;

        for (Empleado empleado : this.getEmpleados()) {
            totalAPagar += empleado.sueldoNeto();
        }
        return totalAPagar;
    }

    public void mostrar() {
        System.out.printf("Banco: %s\tSucursal: %d\nLocalidad: %s\tProvincia: %s\n\n", this.getNombre(),
                this.getNroSucursal(), this.getLocalidad().getNombre(), this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.printf("Total a Pagar-------------------------------------------------------------------$%.2f",
                this.sueldosAPagar());
    }
}
