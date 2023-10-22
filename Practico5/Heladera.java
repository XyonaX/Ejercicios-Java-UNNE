/**
 * Clase que representa una heladera como un tipo de artefacto del hogar. Hereda
 * atributos y métodos de la clase ArtefactoHogar e incluye características
 * específicas de una heladera, como la cantidad de pies, puertas y si tiene un
 * compresor.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Heladera extends ArtefactoHogar {
    private int pies; // Cantidad de pies de la heladera
    private int puertas; // Cantidad de puertas de la heladera
    private boolean compresor; // Indica si la heladera tiene un compresor

    /**
     * Constructor para inicializar una heladera con marca, precio, stock, cantidad
     * de pies, cantidad de puertas y si tiene compresor.
     * 
     * @param p_marca     Marca de la heladera.
     * @param p_precio    Precio de la heladera.
     * @param p_stock     Stock disponible de la heladera.
     * @param p_pies      Cantidad de pies de la heladera.
     * @param p_puertas   Cantidad de puertas de la heladera.
     * @param p_compresor Indica si la heladera tiene un compresor.
     */
    public Heladera(String p_marca, float p_precio, int p_stock, int p_pies, int p_puertas, boolean p_compresor) {
        super(p_marca, p_precio, p_stock);
        this.setPies(p_pies);
        this.setPuertas(p_puertas);
        this.setCompresor(p_compresor);
    }

    // Accessors
    public int getPies() {
        return this.pies;
    }

    private void setPies(int p_pies) {
        this.pies = p_pies;
    }

    public int getPuertas() {
        return this.puertas;
    }

    private void setPuertas(int p_puertas) {
        this.puertas = p_puertas;
    }

    public boolean getCompresor() {
        return this.compresor;
    }

    private void setCompresor(boolean p_compresor) {
        this.compresor = p_compresor;
    }

    // Fin Accessors
    /**
     * Imprime información detallada sobre la heladera, incluyendo marca, precio,
     * stock, cantidad de pies, cantidad de puertas y si tiene un compresor.
     */
    public void imprimir() {
        System.out.println("\n**** Heladera ****");
        super.imprimir();
        System.out.printf("\nPies: %d\nPuertas: %d\nCompresor: %s", this.getPies(), this.getPuertas(),
                this.getCompresor() ? "Si" : "No");
    }

    /**
     * Calcula la cuota de crédito considerando un posible adicional si la heladera
     * tiene un compresor.
     * 
     * @param p_cuotas  Número de cuotas para el crédito.
     * @param p_interes Tasa de interés para el crédito.
     * @return Cuota de crédito calculada.
     */
    public float creditoConAdicional(int p_cuotas, float p_interes) {
        if (this.getCompresor()) {
            return this.cuotaCredito(p_cuotas, p_interes) + 50;
        } else {
            return this.cuotaCredito(p_cuotas, p_interes);
        }
    }
}