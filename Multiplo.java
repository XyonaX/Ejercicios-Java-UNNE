public class Multiplo {
    

    public static void main(String[] args) {
        int i = 42;

        // for (int i = 42; i <= 150; i++) {
        //     if (i%4 == 0 ) {
        //         System.out.println("El " + i +" es multiplo de 4");
        //     }
        // }

        while(i <= 150){
            if (i%4 == 0 ) {
                System.out.println("El " + i +" es multiplo de 4");
            }
            i++;
        }
    }
}
