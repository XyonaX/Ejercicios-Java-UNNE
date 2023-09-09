public class Banco {
    
    public static void main(String[] args) {
        Persona juan = new Persona(41442040, "Juan", "Perez", 1998);
        CuentaBancaria cuenta = new CuentaBancaria(1, juan, 0);

        cuenta.mostrar();
        cuenta.depositar(5000.5);
        cuenta.mostrar();
        cuenta.extraer(2500.5);
        cuenta.mostrar();
    }
}
