
public class UnCliente
{
  public static void main(String[] args){
      Cliente unCliente = new Cliente(41442040,"Vargas","Jonatan",0.0);
      unCliente.agregaSaldo(5000);
      unCliente.mostrar();
      unCliente.nuevoSaldo(0);
      unCliente.mostrar();
  }
}
