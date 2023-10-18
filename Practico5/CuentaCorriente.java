public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto; // Límite de descubierto permitido

    // Constructor para inicializar la cuenta con número de cuenta y titular
    public CuentaCorriente(int p_nroCuenta, Persona p_titular) {
        super(p_titular, p_nroCuenta);
        this.setLimiteDescubierto(500); // Límite de descubierto predeterminado
    }

    // Método para asignar el límite de descubierto (setter)
    private void setLimiteDescubierto(double p_limite) {
        this.limiteDescubierto = p_limite;
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

    // Método para mostrar información sobre la cuenta
    public void mostrar() {
        System.out.println("-Cuenta Corriente-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe() + "\nDescubierto: " + this.getLimiteDescubierto());
    }
}
