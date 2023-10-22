public class Comun extends Etiqueta {
    private double plus;

    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }

    public double getPlus() {
        return this.plus;
    }

    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    public double precio(int q) {
        return ((100 * q) + this.getPlus()) - this.descuento(q);
    }

    private double descuento(int q) {
        double descuento = 0.0;

        if (q > 10 && q <= 50) {
            descuento = (this.getCosto() * q + this.getPlus()) * 0.02;
        } else if (q > 50 && q <= 100) {
            descuento = (this.getCosto() * q + this.getPlus()) * 0.05;
        } else if (q > 100) {
            double decenaExtra = ((q - 100) / 10);
            descuento = (this.getCosto() * q + this.getPlus()) * (0.1 + decenaExtra / 100);
        }

        return descuento;
    }

    protected String tipo() {
        return String.format("Común");
    }

}
