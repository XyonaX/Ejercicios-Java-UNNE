import java.util.ArrayList;

public class Banco {
    private String nombre;
    private int nroSucursal;
    private Localidad localidad;
    private ArrayList<Empleado> empleados; // usamos genericos
    private ArrayList cuentasBancarias; // sin genericos

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleado) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleado);
        this.setCuenta(new ArrayList<>());

    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuenta(new ArrayList<>());
    }

    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleados,
            ArrayList p_cuentas) {
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(p_empleados);
        this.setCuenta(p_cuentas);
    }

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

    /**
     * @param p_cuenta
     *                 recibe una lista y lo setea en el atributo cuentasBancarias
     */
    private void setCuenta(ArrayList p_cuenta) {
        this.cuentasBancarias = p_cuenta;
    }

    /**
     * @return devuelve una lista de cuentas
     */
    public ArrayList getCuenta() {
        return this.cuentasBancarias;
    }

    public boolean agregarEmpleado(Empleado p_empleado) {
        return this.getEmpleados().add(p_empleado);
    }

    public boolean quitarEmpleado(Empleado p_empleado) {
        if (this.getEmpleados().size() == 1) {
            System.out.println("\nNo se puede eliminar toda la lista!\n");
            return false;
        } else {
            return this.getEmpleados().remove(p_empleado);
        }
    }

    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuenta().add(p_cuenta);
    }

    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta) {
        return this.getCuenta().remove(p_cuenta);
    }

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

    private int cuentasSaldoActivo() {
        int cuentasActivas = 0;
        for (CuentaBancaria cuenta : (ArrayList<CuentaBancaria>) this.getCuenta()) {
            if (cuenta.getSaldo() > 0) {
                cuentasActivas++;
            }
        }
        return cuentasActivas;
    }

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

    public void listarSueldos() {
        for (Empleado empleado : this.getEmpleados()) {
            System.out.printf("%d\t%s -------------------------  $%.2f\n", empleado.getCuil(), empleado.apeYNom(),
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
        System.out.printf("\nTotal a Pagar----------------------------------------$%.2f\n",
                this.sueldosAPagar());
        this.mostrarSaldoCero();
    }
}
