/**
 * Clase que representa un punto en un plano cartesiano con coordenadas (x, y).
 * 
 * Permite la manipulación y cálculos básicos de puntos en el plano.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Punto {
    private double x; // Coordenada x
    private double y; // Coordenada y

    /**
     * Constructor por defecto que inicializa el punto en el origen (0,0).
     */
    public Punto() {
        this.setX(0);
        this.setY(0);
    }

    /**
     * Constructor que permite inicializar el punto con coordenadas específicas.
     * 
     * @param p_x Coordenada x del punto.
     * @param p_y Coordenada y del punto.
     */
    public Punto(double p_x, double p_y) {
        this.setX(p_x);
        this.setY(p_y);
    }

    // Accessors
    private void setX(double p_x) {
        this.x = p_x;
    }

    private void setY(double p_y) {
        this.y = p_y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    // Fin Accessors
    /**
     * Desplaza el punto en el plano agregando valores a las coordenadas actuales.
     * 
     * @param p_dx Valor a agregar a la coordenada x.
     * @param p_dy Valor a agregar a la coordenada y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }

    /**
     * Obtiene las coordenadas del punto en formato (x, y).
     * 
     * @return Coordenadas del punto en formato (x, y).
     */
    public String coordenadas() {
        return String.format("(%.1f , %.1f)", this.getX(), this.getY());
    }

    /**
     * Muestra las coordenadas del punto en la consola.
     */
    public void mostrar() {
        System.out.println("Punto: X: " + this.getX() + ", Y: " + this.getY());
    }

    /**
     * Calcula la distancia entre este punto y otro punto dado.
     * 
     * @param p_ptoDistante Punto al que se calcula la distancia.
     * @return Distancia entre los puntos.
     */
    public double distanciaA(Punto p_ptoDistante) {
        double diferenciaX = p_ptoDistante.getX() - this.getX();
        double diferenciaY = p_ptoDistante.getY() - this.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}