public abstract class Congelado{
    private double precio_unitario;
    private String descripcion;
    
    public Congelado(double p_precio_unitario, String p_descripcion) {
        this.setDescripcion(p_descripcion);
        this.setPrecioUnitario(p_precio_unitario);
    }

    public double getPrecio_unitario() {
        return this.precio_unitario;
    }
    private void setPrecioUnitario(double p_precio_unitario) {
        this.precio_unitario = p_precio_unitario;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    private void setDescripcion(String p_descripcion) {
        this.descripcion = p_descripcion;
    }
    
    public abstract double precio(int p_cantidad);
}