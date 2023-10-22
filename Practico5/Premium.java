public class Premium extends Etiqueta {
    private int colores;

    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    public int getColores() {
        return this.colores;
    }

    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    public double precio(int q) {
        return (this.getCosto() * q) + (q * this.adicional());
    }

    private double adicional() {
        double adicional = 0.0;
        if (this.getColores() == 2) {
            adicional = this.getCosto() * 0.05;
        } else if (this.getColores() == 3) {
            adicional = this.getCosto() * 0.07;
        } else if (this.getColores() > 3) {
            adicional = (this.getColores() * this.getCosto()) * 0.03;
        }
        return adicional;
    }

    protected String tipo() {
        return String.format("Premium");
    }

}
