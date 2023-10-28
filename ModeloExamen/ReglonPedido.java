public class ReglonPedido {
    private Congelado item;
    private int catidad;

    public ReglonPedido(Congelado p_item, int p_catidad) {
        this.setItem(p_item);
        this.setCantidad(p_catidad);;
    }
    public Congelado getItem() {
        return this.item;
    }
    private void setItem(Congelado p_item) {
        this.item = p_item;
    }
    public int getCantidad() {
        return this.catidad;
    }
    private void setCantidad(int p_catidad) {
        this.catidad = p_catidad;
    }

    public double importe(){
        return this.getCantidad() * this.getItem().precio(this.getCantidad());
    }

    public String toString(){
        return String.format("%s\tCantidad: %d\tPrecio: %.2f\tSubtotal: %.2f",this.getItem().toString(),this.getCantidad(), this.getItem().precio(this.getCantidad()),this.importe());
    }
}
