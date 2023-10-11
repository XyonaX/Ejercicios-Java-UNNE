public abstract class FiguraGeometrica {
    private Punto origen;

    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    public Punto getOrigen() {
        return this.origen;
    }

    abstract String nombreFigura();

    abstract double superficie();

    public void mostrarSuperficie() {
        System.out.printf("%s Superficie: %.2f\n", this.nombreFigura(), this.superficie());
    }

}
