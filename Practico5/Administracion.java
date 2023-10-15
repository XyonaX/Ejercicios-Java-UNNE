import java.util.ArrayList;

public class Administracion {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        Punto centro = new Punto(2.5, 4.5);
        figuras.add(0, new Cuadrado(centro, 2.4));
        figuras.add(0, new Triangulo(centro, 2.57, 2.3));
        figuras.add(0, new Circulo(centro, 3.41));
        figuras.add(0, new Elipse(centro, 6.2, 1.00));
        Jardin rayitoLuz = new Jardin("Rayito de Luz", figuras);

        rayitoLuz.detalleFiguras();

    }
}
