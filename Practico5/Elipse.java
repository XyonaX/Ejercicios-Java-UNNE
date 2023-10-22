/**
 * Clase que representa una elipse en un plano bidimensional.
 * 
 * Esta clase hereda de la clase abstracta FiguraGeometrica y proporciona un
 * constructor para inicializar la elipse con un centro, semieje mayor y semieje
 * menor.
 * Además, define métodos para obtener el semieje mayor, el semieje menor, el
 * nombre
 * de la figura, calcular la superficie, mostrar características, desplazar el
 * centro,
 * calcular distancia a otra elipse y determinar la elipse con mayor superficie.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Elipse extends FiguraGeometrica {
    private double sEjeMayor;
    private double sEjeMenor;

    /**
     * Constructor para inicializar una elipse.
     * 
     * @param p_centro   Punto que representa el centro de la elipse.
     * @param p_ejeMayor double que indica el semieje mayor de la elipse.
     * @param p_ejeMenor double que indica el semieje menor de la elipse.
     */
    public Elipse(Punto p_centro, double p_ejeMayor, double p_ejeMenor) {
        super(p_centro);
        this.setsEjeMayor(p_ejeMayor);
        this.setsEjeMenor(p_ejeMenor);
    }

    // Accessors
    public double getsEjeMayor() {
        return this.sEjeMayor;
    }

    private void setsEjeMayor(double sEjeMayor) {
        this.sEjeMayor = sEjeMayor;
    }

    public double getsEjeMenor() {
        return this.sEjeMenor;
    }

    private void setsEjeMenor(double sEjeMenor) {
        this.sEjeMenor = sEjeMenor;
    }

    // Fin Accessors

    /**
     * Obtiene el nombre de la figura.
     * 
     * @return String que representa el nombre de la elipse.
     */
    public String nombreFigura() {
        String figura = "****** Elipse ******\n";
        return figura;
    }

    /**
     * Calcula la superficie de la elipse.
     * 
     * @return double que indica la superficie de la elipse.
     */
    public double superficie() {
        return Math.PI * sEjeMayor * sEjeMenor;
    }

    /**
     * Muestra las características de la elipse, incluyendo el centro, semieje
     * mayor,
     * semieje menor y superficie.
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.printf("Centro: %s - Semieje Mayor: %.2f - Semieje Menor: %.2f\nSuperficie: %.2f\n",
                this.getOrigen().coordenadas(), this.getsEjeMayor(), this.getsEjeMenor(), this.superficie());
    }

    /**
     * Desplaza el centro de la elipse por las coordenadas dadas.
     * 
     * @param p_dx double que indica el desplazamiento en el eje x.
     * @param p_dy double que indica el desplazamiento en el eje y.
     */
    public void desplazar(double p_dx, double p_dy) {
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    /**
     * Calcula la distancia entre el centro de esta elipse y el centro de otra
     * elipse dada.
     * 
     * @param otraElipse Elipse que representa la otra elipse.
     * @return double que indica la distancia entre los centros de las elipses.
     */
    public double distanciaA(Elipse otraElipse) {
        double diferenciaX = otraElipse.getOrigen().getX() - this.getOrigen().getX();
        double diferenciaY = otraElipse.getOrigen().getY() - this.getOrigen().getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    /**
     * Determina cuál de las dos elipses tiene una superficie mayor.
     * 
     * @param otraElipse Elipse que representa la otra elipse.
     * @return Elipse que tiene la mayor superficie, o null si ambas tienen la misma
     *         superficie.
     */
    public Elipse elMayor(Elipse otraElipse) {
        if (this.superficie() > otraElipse.superficie()) {
            return this;
        } else if (otraElipse.superficie() > this.superficie()) {
            return otraElipse;
        } else {
            return null; // Si tienen la misma superficie, retorna null
        }
    }
}