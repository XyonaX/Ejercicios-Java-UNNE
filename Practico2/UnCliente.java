
public class UnCliente
{
  public static void main(String[] args){
     int dni = Integer.parseInt(args[0]);
     String apellido = args[1];
     String nombre = args[2];
     double saldoInicial = Double.parseDouble(args[3]);


     Cliente unCliente = new Cliente(dni, apellido, nombre, saldoInicial);


     unCliente.agregaSaldo(5000);
     unCliente.mostrar();
     unCliente.nuevoSaldo(0);
     unCliente.mostrar();
  }
}
