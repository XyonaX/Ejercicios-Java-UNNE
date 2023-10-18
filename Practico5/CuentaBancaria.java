public abstract class CuentaBancaria {
    private Persona titular;
    private int nroCuenta;
    private double saldo;

    public CuentaBancaria(Persona p_titular, int p_nroCuenta) {
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
    }

    public Persona getTitular() {
        return this.titular;
    }

    public void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    public void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public abstract void extraer(double p_importe);

    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    public void mostrar() {
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }
}
