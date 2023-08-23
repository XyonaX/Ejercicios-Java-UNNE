package Practico1;
public class Ecuacion {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        double discriminante = b * b - 4 * a * c;
        System.out.println("Discriminante: " +discriminante);

        if (discriminante > 0.0) {
            double raiz1 = (-b + Math.sqrt(discriminante))/(2*a);
            double raiz2 = (-b - Math.sqrt(discriminante))/(2*a);
            System.out.println("Las raices reales son: x1= "+ raiz1 + ", x2= " +raiz2);
        }else if(discriminante == 0.0){
            double raiz = -b / (2*a);
            System.out.println("Una sola raiz real: " +raiz);
        }else{
            System.out.println("Solucion compleja (numero imaginario)");
        }
    }
}
