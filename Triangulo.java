package Practico1;
public class Triangulo {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
    
        double semiperimetro = (a+b+c)/2;
        double area = Math.sqrt(semiperimetro*(semiperimetro-a)*(semiperimetro-b)*(semiperimetro-c));
    
        System.out.println("El semiperimetro es: " +semiperimetro);
        System.out.println("El area es: " +area);
    }

}
