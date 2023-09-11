public class Circulo {
    private double radio;  
    private Punto centro;  // Centro del círculo (un objeto de tipo Punto)

    // Constructor para inicializar el círculo con radio y centro dados
    public Circulo(double p_radio, Punto p_centro) {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    // Constructor predeterminado que inicializa el círculo con radio 0 y centro en el origen
    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0, 0));
    }

    // Método para asignar el centro del círculo (setter)
    private void setCentro(Punto p_centro){
        this.centro = p_centro;
    }

    private void setRadio(double p_radio){
        this.radio = p_radio;
    }

    public Punto getCentro(){
        return this.centro;
    }

    public double getRadio(){
        return this.radio;
    }
    
    // Método para desplazar el centro del círculo
    public void desplazar(double p_dx, double p_dy){
        this.centro.desplazar(p_dx, p_dy);
    }

    // Método para calcular el área del círculo
    public double superficie(){
        return Math.PI * Math.pow(getRadio(), 2);
    }

    // Método para calcular el perímetro del círculo
    public double perimetro(){
        return 2 * Math.PI * getRadio();
    }

    // Método para imprimir características del círculo
    public void caracteristicas(){
        System.out.println("****** Circulo ******");
        System.out.println("Centro: "+this.getCentro().coordenadas()+"\t-Radio: "+this.getRadio());
        System.out.println("Superficie: "+this.superficie() + "\t-Perímetro: " +this.perimetro()+"\n") ;
    }

    // Método para calcular la distancia entre el centro de este círculo y otro círculo
    public double distanciaA(Circulo otroCirculo){
        double diferenciaX = otroCirculo.getCentro().getX() - this.centro.getX();
        double diferenciaY = otroCirculo.getCentro().getY() - this.centro.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY,2));
    }

    // Método para determinar el círculo de mayor superficie entre este y otro círculo
    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else if(otroCirculo.superficie() > this.superficie()){
            return otroCirculo;
        }else{
            return null;  // Ambos tienen la misma superficie
        }
    }
}
