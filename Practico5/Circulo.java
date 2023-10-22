/**
 * Clase que representa un círculo, que es una forma geométrica bidimensional.
 * Un círculo es una instancia específica de una elipse donde ambos semiejes
 * tienen
 * la misma longitud, lo que lo convierte en una figura simétrica.
 * 
 * Esta clase hereda de la clase Elipse, y proporciona constructores específicos
 * para
 * crear círculos, así como un método para obtener el nombre de la figura.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Circulo extends Elipse {

    /**
     * Constructor para inicializar el círculo con un centro y radio dados.
     * 
     * @param p_centro Punto que representa el centro del círculo.
     * @param p_radio  Valor del radio del círculo.
     */
    public Circulo(Punto p_centro, double p_radio) {
        super(p_centro, p_radio, p_radio);
    }

    /**
     * Constructor predeterminado que inicializa el círculo con radio 0 y centro en
     * el origen.
     */
    public Circulo() {
        super(new Punto(0, 0), 0.0, 0.0);
    }

    /**
     * Retorna el nombre de la figura.
     * 
     * @return Una cadena que representa el nombre de la figura ("Círculo").
     */
    public String nombreFigura() {
        return "****** Círculo ******\n";
    }

}
