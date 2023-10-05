public class GenerarFigura {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(new Punto(2, 3), 5, 7);
        System.out.println("Características del Rectángulo:");
        rectangulo.caracteristicas();

        // Crear un cuadrado con origen en (1, 1) y lado 5
        Cuadrado cuadrado = new Cuadrado(new Punto(5.0, 3.0), 72.99);
        System.out.println("Características del Cuadrado:");
        cuadrado.caracteristicas();

        // Calcular la distancia entre el cuadrado y el rectángulo
        double distancia = cuadrado.distanciaA(rectangulo);
        System.out.println("Distancia entre el Cuadrado y el Rectángulo: " + distancia);
    }
}
