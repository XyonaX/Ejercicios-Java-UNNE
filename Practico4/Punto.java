/**
 * Permite crear y manipular un objeto de tipo Punto.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */

public class Punto {
    private double x; // Coordenada x
    private double y; // Coordenada y

    /**
     * constructor que inicializa las coordenas X e Y en 0.
     */
    public Punto() {
        this.setX(0);
        this.setY(0);
    }

    /**
     * constructor que define la posicion del punto con atributos pasados por
     * parametro.
     * 
     * @param p_x double;
     * @param p_y double;
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
     * Desplaza al punto segun las coordenadas pasadas como argumentos.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.x = this.getX() + p_dx;
        this.y = this.getY() + p_dy;
    }

    /**
     * concatena las coordenadas del punto
     */
    public String coordenadas() {
        return String.format("(%.1f , %.1f)", this.getX(), this.getY());
    }

    /**
     * muestra por pantalla las coordenadas de los puntos X e Y.
     */
    public void mostrar() {
        System.out.println("Punto: X: " + this.getX() + ", Y: " + this.getY());
    }

    /**
     * calcula la distancia entre un punto y otro.
     * 
     * @return Devuelve la distancia entre dos puntos.
     */
    public double distanciaA(Punto p_ptoDistante) {
        double diferenciaX = p_ptoDistante.getX() - this.getX();
        double diferenciaY = p_ptoDistante.getY() - this.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}
