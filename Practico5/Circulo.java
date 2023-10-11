public class Circulo extends Elipse {

    // Constructor para inicializar el círculo con radio y centro dados
    public Circulo(Punto p_centro, double p_radio) {
        super(p_centro, p_radio, p_radio);
    }

    // Constructor predeterminado que inicializa el círculo con radio 0 y centro en
    // el origen
    public Circulo() {
        super(new Punto(0, 0), 0.0, 0.0);
    }

    public String nombreFigura() {
        String figura = "****** Circulo ******\n";
        return figura;
    }

}
