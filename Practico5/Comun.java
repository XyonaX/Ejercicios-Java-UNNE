/**
 * Clase que representa una etiqueta de tipo Común, la cual hereda de la clase
 * Etiqueta.
 * Agrega un atributo adicional llamado "plus".
 * 
 * La clase proporciona un constructor específico para crear etiquetas Comunes,
 * así como métodos para obtener y establecer el atributo "plus". También hereda
 * métodos de la clase Etiqueta, como el método para calcular el precio y
 * determinar
 * el tipo de etiqueta.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Comun extends Etiqueta {
    private double plus; // Valor adicional agregado a la etiqueta Común.

    /**
     * Constructor para inicializar una etiqueta Común con un costo base y un valor
     * adicional.
     * 
     * @param p_costo double que indica el costo base de la etiqueta Común.
     * @param p_plus  double que representa el valor adicional de la etiqueta Común.
     */
    public Comun(double p_costo, double p_plus) {
        super(p_costo);
        this.setPlus(p_plus);
    }

    // Accessors
    public double getPlus() {
        return this.plus;
    }

    private void setPlus(double p_plus) {
        this.plus = p_plus;
    }

    // Fin Accessors
    /**
     * Calcula el precio total de la etiqueta Común considerando la cantidad
     * comprada.
     * Incluye el costo base y el valor adicional, restando cualquier descuento
     * aplicable.
     * 
     * @param q int que representa la cantidad comprada.
     * @return double que indica el precio total.
     */
    public double precio(int q) {
        return ((100 * q) + this.getPlus()) - this.descuento(q);
    }

    /**
     * Calcula el descuento aplicable a la etiqueta Común en función de la cantidad
     * comprada.
     * 
     * @param q int que representa la cantidad comprada.
     * @return double que indica el valor del descuento.
     */
    private double descuento(int q) {
        double descuento = 0.0;

        if (q > 10 && q <= 50) {
            descuento = (this.getCosto() * q + this.getPlus()) * 0.02;
        } else if (q > 50 && q <= 100) {
            descuento = (this.getCosto() * q + this.getPlus()) * 0.05;
        } else if (q > 100) {
            double decenaExtra = ((q - 100) / 10);
            descuento = (this.getCosto() * q + this.getPlus()) * (0.1 + decenaExtra / 100);
        }

        return descuento;
    }

    /**
     * Obtiene el tipo de etiqueta, que en este caso es "Común".
     * 
     * @return String que representa el tipo de etiqueta.
     */
    protected String tipo() {
        return String.format("Común");
    }

}