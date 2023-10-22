/**
 * Clase que representa una etiqueta de tipo Premium con un costo y cantidad de
 * colores.
 * 
 * Extiende la clase abstracta Etiqueta.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Premium extends Etiqueta {
    private int colores; // Cantidad de colores de la etiqueta

    /**
     * Constructor para inicializar una etiqueta Premium con un costo y cantidad de
     * colores.
     * 
     * @param p_costo   Costo de la etiqueta.
     * @param p_colores Cantidad de colores de la etiqueta.
     */
    public Premium(double p_costo, int p_colores) {
        super(p_costo);
        this.setColores(p_colores);
    }

    // Accessors
    public int getColores() {
        return this.colores;
    }

    private void setColores(int p_colores) {
        this.colores = p_colores;
    }

    // Fin Accessors
    /**
     * Calcula el precio total de las etiquetas Premium en función de la cantidad
     * requerida.
     * 
     * @param q Cantidad de etiquetas.
     * @return Precio total de las etiquetas.
     */
    public double precio(int q) {
        return (this.getCosto() * q) + (q * this.adicional());
    }

    /**
     * Calcula el monto adicional según la cantidad de colores de la etiqueta.
     * 
     * @return Monto adicional.
     */
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

    /**
     * Retorna el tipo de etiqueta, que en este caso es "Premium".
     * 
     * @return Tipo de etiqueta.
     */
    protected String tipo() {
        return String.format("Premium");
    }
}