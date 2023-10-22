/**
 * Clase que representa un rectángulo en un plano cartesiano.
 * 
 * Permite la manipulación y cálculos básicos de rectángulos.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Rectangulo extends FiguraGeometrica {
    private double ancho; // El ancho del rectángulo
    private double alto; // La altura del rectángulo

    /**
     * Constructor que permite especificar el punto de origen, ancho y alto del
     * rectángulo.
     * 
     * @param p_origen Punto de origen del rectángulo.
     * @param p_ancho  Ancho del rectángulo.
     * @param p_alto   Altura del rectángulo.
     */
    public Rectangulo(Punto p_origen, double p_ancho, double p_alto) {
        super(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    /**
     * Constructor que permite especificar solo el ancho y el alto, el punto de
     * origen se establece en el origen (0,0).
     * 
     * @param p_ancho Ancho del rectángulo.
     * @param p_alto  Altura del rectángulo.
     */
    public Rectangulo(double p_ancho, double p_alto) {
        super(new Punto(0, 0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    // Accessors
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

    // Fin Accessors
    /**
     * Obtiene el nombre de la figura.
     * 
     * @return Nombre del rectángulo.
     */
    public String nombreFigura() {
        String figura = "****** Rectangulo ******\n";
        return figura;
    }

    /**
     * Desplaza el punto de origen del rectángulo en el plano.
     * 
     * @param p_dx Valor a agregar a la coordenada x.
     * @param p_dy Valor a agregar a la coordenada y.
     */
    public void desplazar(double p_dx, double p_dy) {
        super.getOrigen().desplazar(p_dx, p_dy);
    }

    /**
     * Calcula la superficie del rectángulo.
     * 
     * @return Superficie del rectángulo.
     */
    public double superficie() {
        return this.getAlto() * this.getAncho();
    }

    /**
     * Calcula el perímetro del rectángulo.
     * 
     * @return Perímetro del rectángulo.
     */
    public double perimetro() {
        return 2 * (this.getAlto() + this.getAncho());
    }

    /**
     * Muestra las características del rectángulo en la consola.
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + "\t-Alto: " + this.getAlto() + " \t-Ancho: "
                + this.getAncho());
        System.out.println("Superficie: " + this.superficie() + "\t-Perímetro: " + this.perimetro() + "\n");
    }

    /**
     * Calcula la distancia entre este rectángulo y otro rectángulo dado.
     * 
     * @param otroRectangulo Otro rectángulo para calcular la distancia.
     * @return Distancia entre los rectángulos.
     */
    public double distanciaA(Rectangulo otroRectangulo) {

        double diferenciaX = otroRectangulo.getOrigen().getX() - super.getOrigen().getX();
        double diferenciaY = otroRectangulo.getOrigen().getY() - super.getOrigen().getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    /**
     * Determina el rectángulo de mayor superficie entre este y otro rectángulo
     * dado.
     * 
     * @param otroRectangulo Otro rectángulo para comparar superficies.
     * @return El rectángulo con mayor superficie o null si tienen la misma
     *         superficie.
     */
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
