public class TrinaguloRectangulo {
    public static void main(String[] args) {
        double hipotenusa = Double.parseDouble(args[0]);
        double cateto1 = Double.parseDouble(args[1]);
        double cateto2 = Double.parseDouble(args[2]);

        double sumaCuadradosCatetos = Math.pow(cateto1, 2) + Math.pow(cateto2, 2) ;
        double cuadradoHipotenusa = Math.pow(hipotenusa, 2);

        if (cuadradoHipotenusa == sumaCuadradosCatetos) {
            System.out.println("El triangulo es rectangulo");
        }else{

            System.out.println("El triangulo no es rectangulo");
        }
    }
}
