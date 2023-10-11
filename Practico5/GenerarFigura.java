public class GenerarFigura {
    public static void main(String[] args) {
        FiguraGeometrica triangulo = new Triangulo(new Punto(2.5, 3.4), 2.5, 5.0);
        triangulo.mostrarSuperficie();
    }
}
