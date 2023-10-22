/**
 * Clase que representa un artefacto de cocina, que es un tipo de artefacto
 * para uso en el hogar. Hereda de la clase ArtefactoHogar y agrega atributos
 * específicos como el número de hornallas, calorias y dimensiones.
 * 
 * La clase proporciona un constructor específico para crear cocinas, así como
 * métodos para obtener y establecer los atributos específicos de la cocina.
 * También hereda métodos de la clase ArtefactoHogar, como el método para
 * imprimir
 * la información del artefacto y calcular el crédito con adicional.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Cocina extends ArtefactoHogar {
    private int hornallas; // Número de hornallas de la cocina.
    private int calorias; // Cantidad de calorías de la cocina.
    private String dimensiones; // Dimensiones de la cocina en centímetros.

    /**
     * Constructor para inicializar una cocina con los atributos específicos y
     * los atributos heredados de ArtefactoHogar.
     * 
     * @param p_marca       String que representa la marca de la cocina.
     * @param p_precio      float que indica el precio de la cocina.
     * @param p_stock       int que representa el stock disponible de la cocina.
     * @param p_hornallas   int que indica el número de hornallas de la cocina.
     * @param p_calorias    int que representa la cantidad de calorías de la cocina.
     * @param p_dimensiones String que describe las dimensiones de la cocina.
     */
    public Cocina(String p_marca, float p_precio, int p_stock, int p_hornallas, int p_calorias, String p_dimensiones) {
        super(p_marca, p_precio, p_stock);
        this.setHornallas(p_hornallas);
        this.setCalorias(p_calorias);
        this.setDimensiones(p_dimensiones);
    }

    // Accessors
    public int getHornallas() {
        return this.hornallas;
    }

    private void setHornallas(int p_hornallas) {
        this.hornallas = p_hornallas;
    }

    public int getCalorias() {
        return this.calorias;
    }

    private void setCalorias(int p_calorias) {
        this.calorias = p_calorias;
    }

    public String getDimensiones() {
        return this.dimensiones;
    }

    private void setDimensiones(String p_dimensiones) {
        this.dimensiones = p_dimensiones;
    }

    // Fin Accessors
    /**
     * Imprime la información de la cocina, incluyendo los atributos específicos y
     * los heredados de ArtefactoHogar.
     */
    public void imprimir() {
        System.out.println("\n**** Cocina ****");
        super.imprimir();
        System.out.printf("\nHornallas: %d \nCalorias: %d\nDimensiones: %s cm\n", this.getHornallas(),
                this.getCalorias(),
                this.getDimensiones());
    }

    /**
     * Calcula el crédito con adicional para la cocina.
     * 
     * @param p_cuotas  int que representa el número de cuotas.
     * @param p_interes float que indica la tasa de interés.
     * @return float que representa el valor de la cuota con adicional.
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        return this.cuotaCredito(p_cuotas, p_interes);
    }

}
