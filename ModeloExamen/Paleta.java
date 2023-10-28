public class Paleta extends Congelado {
    private int tipo;

    public Paleta(double p_precio_unitario, String p_descripcion, int p_tipo) {
        super(p_precio_unitario, p_descripcion);
        this.setTipo(p_tipo);
    }

    public int getTipo() {
        return this.tipo;
    }

    private void setTipo(int p_tipo) {
        this.tipo = p_tipo;
    }

    public String toString(){
        if(this.getTipo() == 0){
            return String.format("%s (Agua)\tPU: %.2f", this.getDescripcion(),this.getPrecio_unitario());
        }else{
            return String.format("%s (Crema)\tPU: %.2f", this.getDescripcion(),this.getPrecio_unitario() * 2);
        }
    }

    public double precio(int p_cantidad){
        double precio = 10;
        if(this.getTipo() == 1 ){
            precio = precio * 2;
        }
        if(p_cantidad > 20){
                precio = precio * 0.8;
            }
        return precio;
    }
}
