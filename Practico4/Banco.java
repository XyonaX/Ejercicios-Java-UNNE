import java.util.ArrayList;

/**
 * Permite liquidar los sueldos de los empleados de un Banco.
 * 
 * @author Vargas Portillo,Jonatan Ezequiel.
 * @author X, Ingrid Noelí.
 */

public class Banco {
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados; // usamos genericos
    private ArrayList cuentasBancarias; // sin genericos

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   Empleado;
     */
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleado);
        this.setCuenta(new ArrayList<>());

    }

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   ArrayList<Empleado>;
     */

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuenta(new ArrayList<>());
    }

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre      String;
     * @param p_localidad   Localidad;
     * @param p_nroSucursal int;
     * @param p_empleados   ArrayList<Empleado>;
     * @param p_cuentas     ArrayList sin generico;
     */

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados,
            ArrayList p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuenta(p_cuentas);
    }

    // Accessors

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public int getNroSucursal() {
        return this.nroSucursal;
    }

    private void setNroSucursal(int p_nroSucursal) {
        this.nroSucursal = p_nroSucursal;
    }

    public Localidad getLocalidad() {
        return this.localidad;
    }

    private void setLocalidad(Localidad p_localidad) {
        this.localidad = p_localidad;
    }

    public ArrayList<Empleado> getEmpleados() {
        return this.empleados;
    }

    private void setEmpleados(ArrayList<Empleado> p_empleados) {
        this.empleados = p_empleados;
    }

    private void setCuenta(ArrayList p_cuenta) {
        this.cuentasBancarias = p_cuenta;
    }

    public ArrayList getCuenta() {
        return this.cuentasBancarias;
    }

    // Fin de Acessors

    /**
     * Agrega empleado recibido por parametro.
     * 
     * @param p_empleados Empleado;
     * @return true o false segun si el empleado fue agregado a la coleccion.
     */
    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    /**
     * Quita al empleado recibido por parametro.
     * 
     * @param p_empleados Empleado;
     * @return true o false segun si el empleado fue removido de la coleccion.
     */

    public boolean quitarEmpleado(Empleado p_empleado) {
        if (this.getEmpleados().size() == 1) {
            System.out.println("\nNo se puede eliminar toda la lista!\n");
            return false;
        } else {
            return this.getEmpleados().remove(p_empleado);
        }
    }

    /**
     * Agrega la cuenta recibida por parametro.
     * 
     * @param p_cuenta CuentaBancaria;
     * @return true o false segun si la cuenta fue agregada a la coleccion.
     */
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuenta().add(p_cuenta);
    }

    /**
     * Quita la cuenta recibida por parametro.
     * 
     * @param p_cuenta CuentaBancaria;
     * @return true o false segun si la cuenta fue removida de la coleccion.
     */
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuenta().remove(p_cuenta);
    }

    /**
     * Muestra por pantalla las cuentas cuyos saldos esten en 0.
     */
    private void mostrarSaldoCero() {
        System.out.println("\nTitulares con Cuenta en Saldo Cero\n");
        System.out.println("-------------------------------------------------------\n");
        for (CuentaBancaria cuenta : (ArrayList<CuentaBancaria>) this.getCuenta()) {
            if (cuenta.getSaldo() == 0) {
                System.out.printf("%d\t\t%s\n", cuenta.getTitular().getDNI(), cuenta.getTitular().apeYNom());
            }
        }
        System.out.println("-------------------------------------------------------\n");
    }

    /**
     * Permite conocer cuantas cuentas tienen un saldo mayor a 0, estan activas.
     */
    private int cuentasSaldoActivo() {
        int cuentasActivas = 0;
        for (CuentaBancaria cuenta : (ArrayList<CuentaBancaria>) this.getCuenta()) {
            if (cuenta.getSaldo() > 0) {
                cuentasActivas++;
            }
        }
        return cuentasActivas;
    }

    /**
     * Muestra los datos del banco y un resumen de las cuentas bancarias.
     */
    public void mostrarResumen() {
        System.out.printf("Banco: %s\tSucursal: %d\nLocalidad: %s\tProvincia: %s\n\n", this.getNombre(),
                this.getNroSucursal(), this.getLocalidad().getNombre(), this.getLocalidad().getProvincia());
        System.out.println("************************************************************\n" +
                "RESUMEN DE CUENTAS BANCARIAS\n" +
                "************************************************************\n");
        System.out.printf(
                "Número total de Cuentas Bancarias: %d\nCuentas Activas: %d\nCuentas Saldo Cero: %d\n-------------------------------------------------------",
                this.cuentasSaldoActivo() + this.cuentasSaldoCero(), this.cuentasSaldoActivo(),
                this.cuentasSaldoCero());
        this.mostrarSaldoCero();

    }

    private int cuentasSaldoCero() {
        int cuentasSaldoCero = 0;
        for (CuentaBancaria cuenta : (ArrayList<CuentaBancaria>) this.getCuenta()) {
            if (cuenta.getSaldo() == 0) {
                cuentasSaldoCero++;
            }
        }
        return cuentasSaldoCero;
    }

    /**
     * Lista por pantalla el sueldo de todos los empleados.
     */
    public void listarSueldos() {
        for (Empleado empleado : this.getEmpleados()) {
            System.out.printf("%d\t%s -------------------------  $%.2f\n", empleado.getCuil(), empleado.apeYNom(),
                    empleado.sueldoNeto());
        }
    }

    /**
     * Calcula el total a pagar de los sueldos de los empleados.
     * 
     * @return el total a pagar de sueldos.
     */
    public double sueldosAPagar() {
        double totalAPagar = 0.0;

        for (Empleado empleado : this.getEmpleados()) {
            totalAPagar += empleado.sueldoNeto();
        }
        return totalAPagar;
    }

    /**
     * Muestra por pantalla los datos del banco con sus empleados y el total a pagar
     * de sueldos.
     */
    public void mostrar() {
        System.out.printf("Banco: %s\tSucursal: %d\nLocalidad: %s\tProvincia: %s\n\n", this.getNombre(),
                this.getNroSucursal(), this.getLocalidad().getNombre(), this.getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.printf("\nTotal a Pagar----------------------------------------$%.2f\n",
                this.sueldosAPagar());
        this.mostrarSaldoCero();
    }
}
