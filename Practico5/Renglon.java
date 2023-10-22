public class Renglon {
    private int cantidad;
    private Etiqueta item;

    public Renglon(int p_cantidad, Etiqueta p_item) {
        this.setCantidad(p_cantidad);
        this.setItem(p_item);
    }

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

    public void mostrar() {
        System.out.printf("%d Etiquetas de %s", this.getCantidad(), this.getItem().toString());
    }

}
