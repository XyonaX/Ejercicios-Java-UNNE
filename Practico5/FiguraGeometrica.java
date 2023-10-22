/**
 * Clase abstracta que representa una figura geométrica. Contiene un punto de
 * origen. Proporciona métodos abstractos para obtener el nombre de la figura y
 * calcular su superficie. Además, ofrece un método para mostrar la superficie
 * de
 * la figura.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public abstract class FiguraGeometrica {
    private Punto origen; // Punto de origen de la figura

    /**
     * Constructor para inicializar una figura geométrica con un punto de origen.
     * 
     * @param p_origen Punto que representa el origen de la figura.
     */
    public FiguraGeometrica(Punto p_origen) {
        this.setOrigen(p_origen);
    }

    // Accessors
    private void setOrigen(Punto p_origen) {
        this.origen = p_origen;
    }

    public Punto getOrigen() {
        return this.origen;
    }

    // Fin Accessors
    /**
     * Método abstracto para obtener el nombre de la figura.
     * 
     * @return String que representa el nombre de la figura.
     */
    abstract String nombreFigura();

    /**
     * Método abstracto para calcular la superficie de la figura.
     * 
     * @return double que representa la superficie de la figura.
     */
    abstract double superficie();

    /**
     * Muestra la superficie de la figura en la consola.
     */
    public void mostrarSuperficie() {
        System.out.printf("%s Superficie: %.2f\n", this.nombreFigura(), this.superficie());
    }
}