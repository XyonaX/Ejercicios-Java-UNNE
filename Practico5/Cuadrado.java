public class Cuadrado extends Rectangulo {

    public Cuadrado(Punto p_punto, double p_lado) {
        super(p_punto, p_lado, p_lado);
    }

    public String nombreFigura() {
        String figura = "****** Cuadrado ******\n";
        return figura;
    }

    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.println("Origen: " + this.getOrigen().coordenadas() + "\t-Alto: " + this.getAlto() + " \t-Ancho: "
                + this.getAncho());
        System.out.printf("Superficie: %.2f \t-Perímetro: %.2f", this.superficie(), this.perimetro());
    }
}
