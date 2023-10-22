public abstract class ArtefactoHogar {
    private String marca;
    private float precio;
    private int stock;

    public ArtefactoHogar(String p_marca, float p_precio, int p_stock) {
        this.setMarca(p_marca);
        this.setPrecio(p_precio);
        this.setStock(p_stock);
    }

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

    public void imprimir() {
        System.out.printf("Marca: %s - Precio: %.2f - Stock: %d", this.getMarca(), this.getPrecio(), this.getStock());
    }

    public float cuotaCredito(int p_cuotas, float p_interes) {
        float interesAgregado = (this.getPrecio() * (p_interes / 100));
        return (this.getPrecio() + interesAgregado) / p_cuotas;
    }

    public abstract float creditoConAdicional(int p_cuotas, float p_interes);
}
