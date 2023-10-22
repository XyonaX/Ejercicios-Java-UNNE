/**
 * Clase que representa un cuadrado, la cual hereda de la clase Rectangulo.
 * 
 * Esta clase proporciona un constructor específico para crear cuadrados,
 * así como métodos para obtener el nombre de la figura y mostrar sus
 * características.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Cuadrado extends Rectangulo {

    /**
     * Constructor para inicializar un cuadrado con un punto de origen y un lado.
     * 
     * @param p_punto Punto que indica el origen del cuadrado.
     * @param p_lado  double que representa el lado del cuadrado.
     */
    public Cuadrado(Punto p_punto, double p_lado) {
        super(p_punto, p_lado, p_lado);
    }

    /**
     * Obtiene el nombre de la figura, que en este caso es "Cuadrado".
     * 
     * @return String que representa el nombre de la figura.
     */
    public String nombreFigura() {
        String figura = "****** Cuadrado ******\n";
        return figura;
    }

    /**
     * Muestra las características del cuadrado, incluyendo el origen,
     * el alto, el ancho, la superficie y el perímetro.
     */
    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + "\t-Alto: " + this.getAlto() + " \t-Ancho: "
                + this.getAncho());
        System.out.printf("Superficie: %.2f \t-Perímetro: %.2f", this.superficie(), this.perimetro());
    }
}
