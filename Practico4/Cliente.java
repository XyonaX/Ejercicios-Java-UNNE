
public class Cliente
{
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;
    
    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe)
    {
       this.nroDNI = p_dni;
       this.apellido = p_apellido;
       this.nombre = p_nombre;
       this.saldo = p_importe;
    }
    
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + this.nomYape()+ "(" + this.nroDNI +")");
        System.out.println("Saldo: $" + this.saldo);  
    }

    public String nomYape(){
        return this.nombre +" " +this.apellido;
    }
    
    public String apeYnom(){
        return this.apellido + " " + this.nombre;
    }
    
    public double nuevoSaldo(double p_importe){
        this.saldo = p_importe;
        return p_importe;
    }
    
    public double agregaSaldo(double p_importe){
        this.saldo = this.saldo + p_importe;
        return this.saldo;
    }

}
