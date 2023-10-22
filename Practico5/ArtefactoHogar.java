/**
 * Clase abstracta que representa un artefacto para el hogar.
 * Define propiedades como marca, precio y stock, así como métodos para obtener
 * y modificar estos valores.
 * Además, proporciona funcionalidades para imprimir información sobre el
 * artefacto y calcular cuotas de crédito.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;

    /**
     * Constructor que inicializa las propiedades de un artefacto para el hogar.
     * 
     * @param p_marca  Marca del artefacto.
     * @param p_precio Precio del artefacto.
     * @param p_stock  Cantidad de unidades en stock.
     */
    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

    // Accessors
    public String getMarca() {
        return this.marca;
    }

    private void setMarca(String p_marca) {
        this.marca = p_marca;
    }

    public float getPrecio() {
        return this.precio;
    }

    private void setPrecio(float p_precio) {
        this.precio = p_precio;
    }

    public int getStock() {
        return this.stock;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }
    // Fin Accessors

    /**
     * Imprime la información del artefacto incluyendo marca, precio y stock.
     */
    public void imprimir() {
        System.out.printf("Marca: %s - Precio: %.2f - Stock: %d", this.getMarca(), this.getPrecio(), this.getStock());
    }

    /**
     * Calcula el monto de las cuotas de crédito.
     * 
     * @param p_cuotas  Número de cuotas deseadas.
     * @param p_interes Tasa de interés para el crédito.
     * @return El monto de cada cuota de crédito.
     */
    public float cuotaCredito(int p_cuotas, float p_interes) {
        float interesAgregado = (this.getPrecio() * (p_interes / 100));
        return (this.getPrecio() + interesAgregado) / p_cuotas;
    }

    /**
     * Método abstracto para calcular el crédito con un adicional específico para
     * cada tipo de artefacto.
     * 
     * @param p_cuotas  Número de cuotas deseadas.
     * @param p_interes Tasa de interés para el crédito.
     * @return El monto total del crédito con el adicional específico.
     */
    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}