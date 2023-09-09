public class Secretaria{


    public static void main(String[] args) {
        Escuela escuela = new Escuela("Manuel Belgrano", "Irigoyen 1580", "Leopoldo Juez");
        Docente docente = new Docente("Elisa Sanchez","2º",1600,1290);
        
        escuela.imprimirRecibo(docente);
    }
}