/**
 * Clase abstracta que representa una etiqueta. Contiene un atributo costo y
 * proporciona métodos para obtener y establecer el costo, así como para
 * calcular
 * el precio y representar la información de la etiqueta en forma de texto.
 * Esta clase es heredada por las clases Premium y Comun.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public abstract class Etiqueta {
    private double costo;

    /**
     * Constructor para inicializar una etiqueta con un costo específico.
     * 
     * @param p_costo double que representa el costo de la etiqueta.
     */
    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    // Accessors
    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    // Fin Accessors
    /**
     * Calcula el precio de la etiqueta dado un número de unidades.
     * Este método debe ser implementado en las subclases.
     * 
     * @param q int que indica la cantidad de unidades.
     * @return double que representa el precio total de las etiquetas.
     */
    public abstract double precio(int q);

    /**
     * Representa la información de la etiqueta en forma de texto.
     * Si la etiqueta es de tipo Premium, muestra también la cantidad de colores.
     * Si la etiqueta es de tipo Comun, muestra el plus de diseño.
     * 
     * @return String que representa la información de la etiqueta.
     */
    public String toString() {
        if (this instanceof Premium) {
            return String.format("tipo %s - Costo: $%.2f - Colores: %d", this.tipo(), this.getCosto(),
                    ((Premium) this).getColores());
        } else if (this instanceof Comun) {
            return String.format("tipo %s - Costo: $%.2f - Diseño: %.2f", this.tipo(), this.getCosto(),
                    ((Comun) this).getPlus());
        }
        return "";
    }

    /**
     * Método abstracto para obtener el tipo de etiqueta.
     * Debe ser implementado en las subclases.
     * 
     * @return String que representa el tipo de etiqueta.
     */
    protected abstract String tipo();
}