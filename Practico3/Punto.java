
public class Punto
{
    private double x;
    private double y;
    public Punto()
    {
     this.setX(0);
     this.setY(0);
    }
    public Punto(double p_x, double p_y){
     this.setX(p_x);
     this.setY(p_y);
    }
    
    private void setX(double p_x){
        this.x = p_x;
    }
    private void setY(double p_y){
        this.y = p_y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public void desplazar(double p_dx, double p_dy){
        this.x = this.getX() + p_dx;
        this.y = this.getY() + p_dy;
    }
    
    public String coordenadas(){
        return String.format("(%.1f , %.1f)", this.getX(),this.getY());
    }
    
    public void mostrar(){
        System.out.println("Punto: X: "+this.getX()+", Y: "+this.getY());
    }
    
    public double distanciaA(Punto p_ptoDistante){
        double diferenciaX = p_ptoDistante.getX() - this.getX();
        double diferenciaY = p_ptoDistante.getY() - this.getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }
}
