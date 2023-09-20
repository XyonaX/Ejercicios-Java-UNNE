public class CuentaCorriente {
    private int nroCuenta;
    private double saldo;
    private double limiteDescubierto; // Límite de descubierto permitido
    private Persona titular; // Titular de la cuenta

    // Constructor para inicializar la cuenta con número de cuenta y titular
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setLimiteDescubierto(500); // Límite de descubierto predeterminado
    }

    // Constructor para inicializar la cuenta con número de cuenta, titular y saldo
    // inicial
    public CuentaCorriente(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setLimiteDescubierto(500); // Límite de descubierto predeterminado
    }

    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    // Método para asignar el límite de descubierto (setter)
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Persona getTitular() {
        return this.titular;
    }

    // Método para obtener el límite de descubierto (getter)
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    // Método para realizar una extracción de la cuenta
    public void extraer(double p_importe) {
        extraccion(p_importe);
    }

    // Método para verificar si es posible realizar una extracción
    private boolean puedeExtraer(double p_importe) {
        if (p_importe <= (this.getSaldo() + this.getLimiteDescubierto())) {
            return true; // Se puede extraer
        } else {
            return false; // No se puede extraer
        }
    }

    // Método para realizar una extracción
    private void extraccion(double p_importe) {
        if (puedeExtraer(p_importe)) {
            this.setSaldo(this.getSaldo() - p_importe);
            System.out.println("Extracción completada");
        } else {
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
        }
    }

    // Método para realizar un depósito en la cuenta
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    // Método para mostrar información sobre la cuenta
    public void mostrar() {
        System.out.println("-Cuenta Corriente-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe() + "\nDescubierto: " + this.getLimiteDescubierto());
    }
}
