public class Rectangulo extends FiguraGeometrica {
    private double ancho; // El ancho del rectángulo
    private double alto; // La altura del rectángulo

    // Constructor que permite especificar el punto de origen, ancho y alto del
    // rectángulo
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    // Constructor que permite especificar solo el ancho y el alto, el punto de
    // origen se establece en el origen (0,0)
    public Rectangulo(double p_ancho, double p_alto) {
        super(new Punto(0, 0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    private void setAncho(double p_ancho) {
        this.ancho = p_ancho;
    }

    private void setAlto(double p_alto) {
        this.alto = p_alto;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getAlto() {
        return this.alto;
    }

    public String nombreFigura() {
        String figura = "****** Rectangulo ******\n";
        return figura;
    }

    // Método para desplazar el punto de origen del rectángulo en el plano
    public void desplazar(double p_dx, double p_dy) {
        super.getOrigen().desplazar(p_dx, p_dy);
    }

    // Método para calcular la superficie del rectángulo
    public double superficie() {
        return this.getAlto() * this.getAncho();
    }

    // Método para calcular el perímetro del rectángulo
    public double perimetro() {
        return 2 * (this.getAlto() + this.getAncho());
    }

    // Método para mostrar las características del rectángulo en la consola
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + "\t-Alto: " + this.getAlto() + " \t-Ancho: "
                + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + "\t-Perímetro: " + this.perimetro() + "\n");
    }

    // Método para calcular la distancia entre este rectángulo y otro rectángulo
    // dado
    public double distanciaA(Rectangulo otroRectangulo) {

        double diferenciaX = otroRectangulo.getOrigen().getX() - super.getOrigen().getX();
        double diferenciaY = otroRectangulo.getOrigen().getY() - super.getOrigen().getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    // Método para determinar el rectángulo de mayor superficie entre este y otro
    // rectángulo dado
    public Rectangulo elMayor(Rectangulo otroRectangulo) {
        if (this.superficie() > otroRectangulo.superficie()) {
            return this;
        } else if (otroRectangulo.superficie() > this.superficie()) {
            return otroRectangulo;
        } else {
            return null; // Si tienen la misma superficie, retorna null
        }
    }
}
