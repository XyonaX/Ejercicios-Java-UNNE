public class CajaDeAhorro extends CuentaBancaria {
    // Atributos
    private int extraccionesPosibles; // Número de extracciones permitidas

    // Constructor para inicializar la cuenta con saldo cero y 10 extracciones
    // posibles
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular) {
        super(p_titular, p_nroCuenta);
        this.setExtraccionesPosibles(10);
    }

    private void setExtraccionesPosibles(int p_extracciones) {
        this.extraccionesPosibles = p_extracciones;
    }

    public int getExtraccionesposibles() {
        return this.extraccionesPosibles;
    }

    // Método para verificar si se puede realizar una extracción
    private boolean puedeExtraer(double p_importe) {
        if (p_importe <= this.getSaldo() && (this.getExtraccionesposibles() != 0)) {
            return true; // Se puede extraer
        }
        return false; // No se puede extraer
    }

    // Método para realizar una extracción
    private void extraccion(double p_importe) {
        if (this.puedeExtraer(p_importe)) {
            this.setExtraccionesPosibles(this.getExtraccionesposibles() - 1);
            this.setSaldo(this.getSaldo() - p_importe);
            System.out.println("Extracción Exitosa!");
        } else {
            if (this.getExtraccionesposibles() == 0) {
                System.out.println("No tiene habilitadas más extracciones!");
            } else {
                System.out.println("No puede extraer más que el saldo!");
            }
        }
    }

    // Método para realizar una extracción
    public void extraer(double p_importe) {
        this.extraccion(p_importe);
    }

    // Método para mostrar información de la cuenta
    public void mostrar() {
        System.out.println("-Caja de Ahorro-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe() + "\nExtracciones posibles: "
                + this.getExtraccionesposibles());
    }
}
