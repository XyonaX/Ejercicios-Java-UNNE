/**
 * Clase abstracta que representa una cuenta bancaria.
 * 
 * Esta clase proporciona un constructor para inicializar la cuenta con un
 * titular,
 * un número de cuenta y un saldo. Además, define métodos para obtener y
 * modificar
 * el titular, el número de cuenta y el saldo. También contiene un método
 * abstracto
 * para extraer dinero y métodos para depositar y mostrar la información de la
 * cuenta.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public abstract class CuentaBancaria {
    private Persona titular; // Titular de la cuenta
    private int nroCuenta; // Número de cuenta
    private double saldo; // Saldo disponible en la cuenta

    /**
     * Constructor para inicializar una cuenta bancaria.
     * 
     * @param p_titular   Persona que representa el titular de la cuenta.
     * @param p_nroCuenta int que indica el número de cuenta.
     */
    public CuentaBancaria(Persona p_titular, int p_nroCuenta) {
        this.setTitular(p_titular);
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0);
    }

    // Accessors
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

    // Fin Accessors
    /**
     * Método abstracto para extraer dinero de la cuenta.
     * 
     * @param p_importe double que indica el importe a extraer.
     */
    public abstract void extraer(double p_importe);

    /**
     * Deposita un monto en la cuenta, aumentando el saldo disponible.
     * 
     * @param p_importe double que indica el importe a depositar.
     */
    public void depositar(double p_importe) {
        this.setSaldo(this.getSaldo() + p_importe);
    }

    /**
     * Muestra la información de la cuenta, incluyendo el número de cuenta, el saldo
     * y el titular.
     */
    public void mostrar() {
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe());
    }
}