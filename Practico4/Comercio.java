import java.util.HashMap;
import java.util.Map;

/**
 * Permite administrar los empleados de un comercio.
 * 
 * @author Vargas Portillo,Jonatan Ezequiel.
 * @author X, Ingrid Noelí.
 */

public class Comercio {
    private String nombre;
    private HashMap<Long, Empleado> empleados;

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre String;
     */
    public Comercio(String p_nombre) {
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<Long, Empleado>());
    }

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre    String;
     * @param p_empleados HashMap<Long, Empleado>;
     */
    public Comercio(String p_nombre, HashMap<Long, Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setEmpleados(p_empleados);
    }

    // Accessors
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

    // Fin Accessors

    /**
     * Metodo para agregar Empleados
     * 
     * @param p_empleado Empleado;
     */
    public void altaEmpleado(Empleado p_empleado) {
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }

    /**
     * Metodo para quitar Empleados y Retorna el empleado eliminado
     * 
     * @param p_cuild long;
     * @return Empleado;
     */
    public Empleado bajaEmpleado(long p_cuil) {
        return this.getEmpleados().remove(p_cuil);
    }

    /**
     * Metodo que retorna la cantidad de empleados existentes
     */
    public int cantidadDeEmpleados() {
        return this.getEmpleados().size();
    }

    /**
     * Metodo para saber si es empleado del comercio
     * 
     * @param p_cuil long;
     * @return boolean;
     */
    public boolean esEmpleado(long p_cuil) {
        return this.getEmpleados().containsKey(p_cuil);
    }

    /**
     * Metodo para buscar un empleado y lo retorna
     * 
     * @param p_cuil long;
     * @return Empleado;
     */
    public Empleado buscarEmpleado(long p_cuil) {
        return this.getEmpleados().get(p_cuil);
    }

    /**
     * Metodo para saber el sueldo neto de un empleado
     * 
     * @param p_cuil long;
     */
    public void sueldoNeto(long p_cuil) {
        Empleado empleadoBuscado = this.buscarEmpleado(p_cuil);
        System.out.printf("Sueldo neto del empleado %s: %.2f\n", empleadoBuscado.nomYApe(),
                empleadoBuscado.sueldoNeto());
    }

    /**
     * Metodo que muestra la nomina de empleados
     */
    public void nomina() {
        System.out.printf("**** Nomina de empleados de %s **** \n", this.getNombre());
        for (Map.Entry<Long, Empleado> empleado : this.getEmpleados().entrySet()) {
            System.out.printf("%d\t%s-------$%.2f\n", empleado.getKey(), empleado.getValue().nomYApe(),
                    empleado.getValue().sueldoNeto());
        }
    }
}
