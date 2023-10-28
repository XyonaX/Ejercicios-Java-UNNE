public class Postre extends Congelado {
    private boolean enCaja;

    public Postre(double p_precio_unitario, String p_descripcion, boolean p_enCaja) {
        super(p_precio_unitario, p_descripcion);
        this.setEnCaja(p_enCaja);
    }

    public boolean isEnCaja() {
        return this.enCaja;
    }

    private void setEnCaja(boolean p_enCaja) {
        this.enCaja = p_enCaja;
    }

    public String toString(){
        if(this.isEnCaja()){
            return String.format("%s (EnCaja)\tPU: %.2f",this.getDescripcion() , this.getPrecio_unitario()+(this.getPrecio_unitario()*0.05) );
        }else{
            return String.format("%s \tPU: %.2f", this.getDescripcion(), this.getPrecio_unitario());
        }
    }

    public double precio(int p_cantidad){
        double precio = 15;
        if(isEnCaja()){
            precio = precio * 0.05 + precio;
        }
        if(p_cantidad >= 12){
                double descuento = Math.floor(p_cantidad/12)/10;
                precio = precio - (precio * descuento);
            }
        return precio;
    }
}
