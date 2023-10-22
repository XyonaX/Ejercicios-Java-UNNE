/**
 * Clase que representa un lavarropas como un tipo de artefacto para el hogar.
 * Extiende de la clase `ArtefactoHogar` e incluye características específicas
 * como cantidad de programas, capacidad en kilos y si es automático o no.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Lavarropas extends ArtefactoHogar {
    private int programas; // Cantidad de programas de lavado
    private float kilos; // Capacidad en kilos del lavarropas
    private boolean automatico; // Indica si es automático o no

    /**
     * Constructor para inicializar un lavarropas con marca, precio, stock,
     * cantidad de programas, capacidad en kilos y si es automático o no.
     * 
     * @param p_marca      Marca del lavarropas.
     * @param p_precio     Precio del lavarropas.
     * @param p_stock      Cantidad disponible en stock del lavarropas.
     * @param p_programas  Cantidad de programas de lavado.
     * @param p_kilos      Capacidad en kilos del lavarropas.
     * @param p_automatico Indica si el lavarropas es automático o no.
     */
    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos,
            boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    // Accessors
    public int getProgramas() {
        return this.programas;
    }

    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    public boolean getAutomatico() {
        return this.automatico;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    // Fin Accessors

    /**
     * Imprime los detalles del lavarropas, incluyendo marca, precio, stock,
     * cantidad de programas, capacidad en kilos y si es automático o no.
     */
    public void imprimir() {
        System.out.println("\n**** Lavarropas ****");
        super.imprimir();
        System.out.printf("\nProgramas: %d\nKilos: %.2f\nAutomatico: %s\n", this.getProgramas(), this.getKilos(),
                this.getAutomatico() ? "Si" : "No");
    }

    /**
     * Calcula el precio del lavarropas para la compra a crédito con un posible
     * descuento en el caso de que no sea automático.
     * 
     * @param p_cuotas  Cantidad de cuotas para la compra a crédito.
     * @param p_interes Tasa de interés para la compra a crédito.
     * @return Precio del lavarropas con posible descuento aplicado.
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float precioDescuento = 0.0f;
        if (!this.getAutomatico()) {
            float descontarACuota = this.cuotaCredito(p_cuotas, p_interes) * (2.0f / 100);
            precioDescuento = this.cuotaCredito(p_cuotas, p_interes) - descontarACuota;
        } else {
            precioDescuento = this.cuotaCredito(p_cuotas, p_interes);
        }
        return precioDescuento;
    }
}