public class Rectangulo {
    private Punto origen;
    private double ancho;
    private double alto;

    public Rectangulo(Punto p_origen, double p_ancho, double p_alto){
        this.setOrigen(p_origen);
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }

    public Rectangulo(double p_ancho, double p_alto){
        this.setOrigen(new Punto(0, 0));
        this.setAncho(p_ancho);
        this.setAlto(p_alto);
    }
    
    private void setAncho(double p_ancho){
        this.ancho = p_ancho;
    }
    private void setAlto(double p_alto){
        this.alto = p_alto;
    }
    private void setOrigen(Punto p_origen){
        this.origen = p_origen;
    }

    public double getAncho(){
        return this.ancho;
    }
    public double getAlto(){
        return this.alto;
    }

    public Punto getOrigen(){
        return this.origen;
    }

    public void desplazar(double p_dx,double p_dy){
        this.origen.desplazar(p_dx, p_dy);
    }

    public double superficie(){
        return this.getAlto() * this.getAncho();
    }

    public double perimetro(){
        return 2 * (this.getAlto() + this.getAncho());
    }

    public void caracteristicas(){
        System.out.println("****** Rectangulo ******");
        System.out.println("Origen: "+this.getOrigen().coordenadas()+"\t-Alto: "+this.getAlto() +" \t-Ancho: " +this.getAncho());
        System.out.println("Superficie: "+this.superficie() + "\t-Perimetro: " +this.perimetro()+"\n") ;
    }

    public double distanciaA(Rectangulo otroRectangulo){
        double diferenciaX = otroRectangulo.getOrigen().getX() - this.origen.getX();
        double diferenciaY = otroRectangulo.getOrigen().getY() - this.origen.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY,2));
    }

    public Rectangulo elMayor(Rectangulo otroRectangulo){
        if(this.superficie() > otroRectangulo.superficie()){
            return this;
        }else if(otroRectangulo.superficie() > this.superficie()){
            return otroRectangulo;
        }else{
            return null;
        }
    }
}
