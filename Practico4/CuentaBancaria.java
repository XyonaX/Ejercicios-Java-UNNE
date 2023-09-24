/**
 * Crea y permite manipular un objeto de tipo CuentaBancaria.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */

public class CuentaBancaria {
    private int nroCuenta;
    private double saldo;
    private Persona titular; // Titular de la cuenta

    /**
     * Constructor que inicializa el saldo en 0, y los demas atributos por
     * parametro.
     * 
     * @param p_nroCuenta int;
     * @param p_titular   int;
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular) {
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setTitular(p_titular);
    }

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nroCuenta int;
     * @param p_titular   Persona;
     * @param p_saldo     double;
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo) {
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }

    // Accessors
    private void setNroCuenta(int p_nroCuenta) {
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular) {
        this.titular = p_titular;
    }

    private void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    public int getNroCuenta() {
        return this.nroCuenta;
    }

    // Método para obtener el titular de la cuenta (getter)
    public Persona getTitular() {
        return this.titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    // Fin de Accessors

    /**
     * Agrega el importe ingresado por parametro al saldo actual.
     * 
     * @param p_importe double;
     * @return el nuevo saldo.
     */
    public double depositar(double p_importe) {
        this.saldo = getSaldo() + p_importe;
        return getSaldo();
    }

    /**
     * Resta al saldo actual el importe que es ingresado por parametro.
     * 
     * @param p_importe double;
     * @return el nuevo saldo.
     */
    public double extraer(double p_importe) {
        this.saldo = getSaldo() - p_importe;
        return getSaldo();
    }

    /**
     * Muestra por pantalla los datos de la cuenta bancaria.
     */
    public void mostrar() {
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: " + this.getTitular().nomYApe() + " (" + this.getTitular().edad() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }

    /**
     * Concatena el nro de cuenta, nombre y apellido del titular y saldo.
     * 
     * @return el numero de cuenta, nombre y apellido, y saldo en un String.
     */
    public String toString() {
        return String.format("%d\t%s\t%.2f", this.getNroCuenta(), this.getTitular().nomYApe(), this.getSaldo());
    }
}
