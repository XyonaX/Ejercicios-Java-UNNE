import java.util.HashMap;
import java.util.Map;

public class Comercio {
    private String nombre;
    private HashMap<Long, Empleado> empleados;

    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }

    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public HashMap<Long, Empleado> getEmpleados() {
        return this.empleados;
    }

    public void setEmpleados(HashMap<Long, Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    public Empleado bajaEmpleado(long p_cuil) {
        return this.getEmpleados().remove(p_cuil);
    }

    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleados().get(p_cuil);
    }

    public void sueldoNeto(long p_cuil) {
        Empleado empleadoBuscado = this.buscarEmpleado(p_cuil);
        System.out.printf("Sueldo neto del empleado %s: %.2f\n", empleadoBuscado.nomYApe(),
                empleadoBuscado.sueldoNeto());
    }

    public void nomina() {
        System.out.printf("**** Nomina de empleados de %s **** \n", this.getNombre());
        for (Map.Entry<Long, Empleado> empleado : this.getEmpleados().entrySet()) {
            System.out.printf("%d\t%s-------$%.2f\n", empleado.getKey(), empleado.getValue().nomYApe(),
                    empleado.getValue().sueldoNeto());
        }
    }
}
