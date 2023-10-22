/**
 * Clase que representa una cuenta corriente bancaria.
 * 
 * Esta clase hereda de la clase abstracta CuentaBancaria y proporciona un
 * constructor para inicializar la cuenta con un número de cuenta y un titular.
 * Además, define métodos para establecer y obtener el límite de descubierto,
 * realizar extracciones, verificar si es posible realizar una extracción y
 * mostrar
 * información detallada sobre la cuenta.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto; // Límite de descubierto permitido

    /**
     * Constructor para inicializar una cuenta corriente.
     * 
     * @param p_nroCuenta int que indica el número de cuenta.
     * @param p_titular   Persona que representa el titular de la cuenta.
     */
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_titular, p_nroCuenta);
        this.setLimiteDescubierto(500); // Límite de descubierto predeterminado
    }

    // Accessors
    // Método para asignar el límite de descubierto (setter)
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
    }

    // Método para obtener el límite de descubierto (getter)
    public double getLimiteDescubierto() {
        return this.limiteDescubierto;
    }

    // Fin Accessors
    /**
     * Método para realizar una extracción de la cuenta corriente.
     * 
     * @param p_importe double que indica el importe a extraer.
     */
    public void extraer(double p_importe) {
        extraccion(p_importe);
    }

    /**
     * Verifica si es posible realizar una extracción en la cuenta corriente.
     * 
     * @param p_importe double que indica el importe a extraer.
     * @return true si la extracción es posible, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe) {
        if (p_importe <= (this.getSaldo() + this.getLimiteDescubierto())) {
            return true; // Se puede extraer
        } else {
            return false; // No se puede extraer
        }
    }

    /**
     * Realiza una extracción de la cuenta corriente si es posible.
     * 
     * @param p_importe double que indica el importe a extraer.
     */
    private void extraccion(double p_importe) {
        if (puedeExtraer(p_importe)) {
            this.setSaldo(this.getSaldo() - p_importe);
            System.out.println("Extracción completada");
        } else {
            System.out.println("El importe de extracción sobrepasa el límite de descubierto!");
        }
    }

    /**
     * Muestra información detallada sobre la cuenta corriente, incluyendo el número
     * de cuenta, el saldo, el titular y el límite de descubierto.
     */
    public void mostrar() {
        System.out.println("-Cuenta Corriente-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe() + "\nDescubierto: " + this.getLimiteDescubierto());
    }
}