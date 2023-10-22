/**
 * Clase que representa un renglón de un pedido, que contiene una cantidad de
 * etiquetas de un determinado tipo.
 * 
 * Permite la manipulación y visualización de los renglones.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Renglon {
    private int cantidad; // La cantidad de etiquetas en el renglón
    private Etiqueta item; // El tipo de etiqueta en el renglón

    /**
     * Constructor que inicializa un renglón con una cantidad y un tipo de etiqueta.
     * 
     * @param p_cantidad Cantidad de etiquetas en el renglón.
     * @param p_item     Tipo de etiqueta en el renglón.
     */
    public Renglon(int p_cantidad, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
    }

    // Accessors
    public int getCantidad() {
        return this.cantidad;
    }

    private void setCantidad(int p_cantidad) {
        this.cantidad = p_cantidad;
    }

    public Etiqueta getItem() {
        return this.item;
    }

    private void setItem(Etiqueta p_item) {
        this.item = p_item;
    }

    // Fin Accessors
    /**
     * Muestra la información del renglón en la consola.
     */
    public void mostrar() {
        System.out.printf("%d Etiquetas de %s", this.getCantidad(), this.getItem().toString());
    }
}