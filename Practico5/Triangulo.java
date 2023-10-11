public class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;

    public Triangulo(Punto p_origen, double p_base, double p_altura) {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    public double getBase() {
        return this.base;
    }

    private void setBase(double p_base) {
        this.base = p_base;
    }

    public double getAltura() {
        return this.altura;
    }

    private void setAltura(double p_altura) {
        this.altura = p_altura;
    }

    public String nombreFigura() {
        String figura = "****** Triangulo ******\n";
        return figura;
    }

    public double superficie() {
        return (this.getBase() * this.getAltura()) / 2;
    }
}
