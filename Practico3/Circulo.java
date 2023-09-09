
public class Circulo {
    private double radio;
    private Punto centro;

    public Circulo(double p_radio, Punto p_centro) {
        this.setRadio(p_radio);
        this.setCentro(p_centro);
    }

    public Circulo(){
        this.setRadio(0);
        this.setCentro(new Punto(0, 0));
    }

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
    
    public void desplazar(double p_dx,double p_dy){
        this.centro.desplazar(p_dx, p_dy);
    }

    public double superficie(){
        return Math.PI* Math.pow(getRadio(), 2);
    }

    public double perimetro(){
        return 2 * Math.PI * getRadio();
    }

    public void caracteristicas(){
        System.out.println("****** Circulo ******");
        System.out.println("Centro: "+this.getCentro().coordenadas()+"\t-Radio: "+this.getRadio());
        System.out.println("Superficie: "+this.superficie() + "\t-Perimetro: " +this.perimetro()+"\n") ;
    }

    public double distanciaA(Circulo otroCirculo){
        double diferenciaX = otroCirculo.getCentro().getX() - this.centro.getX();
        double diferenciaY = otroCirculo.getCentro().getY() - this.centro.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY,2));
    }

    public Circulo elMayor(Circulo otroCirculo){
        if(this.superficie() > otroCirculo.superficie()){
            return this;
        }else if(otroCirculo.superficie() > this.superficie()){
            return otroCirculo;
        }else{
            return null;
        }
    }
}
