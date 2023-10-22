/**
 * Clase que representa un triángulo en un plano cartesiano.
 * 
 * Contiene información sobre su base, altura y punto de origen.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Triangulo extends FiguraGeometrica {
    private double base; // La base del triángulo
    private double altura; // La altura del triángulo

    /**
     * Constructor que inicializa un triángulo con su punto de origen, base y
     * altura.
     * 
     * @param p_origen Punto de origen del triángulo.
     * @param p_base   Longitud de la base del triángulo.
     * @param p_altura Altura del triángulo.
     */
    public Triangulo(Punto p_origen, double p_base, double p_altura) {
        super(p_origen);
        this.setBase(p_base);
        this.setAltura(p_altura);
    }

    // Accessors
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

    // Fin Accessors
    /**
     * Obtiene el nombre de la figura (Triángulo).
     * 
     * @return Nombre de la figura.
     */
    public String nombreFigura() {
        String figura = "****** Triangulo ******\n";
        return figura;
    }

    /**
     * Calcula la superficie del triángulo.
     * 
     * @return Superficie del triángulo.
     */
    public double superficie() {
        return (this.getBase() * this.getAltura()) / 2;
    }
}