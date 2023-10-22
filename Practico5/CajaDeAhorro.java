/**
 * Clase que representa una cuenta de tipo Caja de Ahorro, que hereda de la
 * clase CuentaBancaria.
 * Define características específicas como la cantidad de extracciones posibles
 * y métodos para realizar y verificar extracciones.
 * Además, proporciona funcionalidades para mostrar información detallada de la
 * cuenta.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class CajaDeAhorro extends CuentaBancaria {
    // Atributos
    private int extraccionesPosibles; // Número de extracciones permitidas

    /**
     * Constructor para inicializar una cuenta de Caja de Ahorro con un número de
     * cuenta y titular.
     * Establece 10 extracciones posibles por defecto.
     * 
     * @param p_nroCuenta Número de la cuenta.
     * @param p_titular   Titular de la cuenta.
     */
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

    /**
     * Verifica si es posible realizar una extracción de la cuenta.
     * 
     * @param p_importe Importe a extraer.
     * @return true si la extracción es posible, false en caso contrario.
     */
    private boolean puedeExtraer(double p_importe) {
        if (p_importe <= this.getSaldo() && (this.getExtraccionesposibles() != 0)) {
            return true; // Se puede extraer
        }
        return false; // No se puede extraer
    }

    /**
     * Realiza una extracción de la cuenta.
     * 
     * @param p_importe Importe a extraer.
     */
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

    /**
     * Realiza una extracción de la cuenta y actualiza la cantidad de extracciones
     * posibles.
     * 
     * @param p_importe Importe a extraer.
     */
    public void extraer(double p_importe) {
        this.extraccion(p_importe);
    }

    /**
     * Muestra información detallada de la cuenta de Caja de Ahorro.
     */
    public void mostrar() {
        System.out.println("-Caja de Ahorro-");
        System.out.println("Nro. Cuenta: " + this.getNroCuenta() + "\tSaldo: " + this.getSaldo());
        System.out.println("Titular: " + this.getTitular().nomYApe() + "\nExtracciones posibles: "
                + this.getExtraccionesposibles());
    }
}
