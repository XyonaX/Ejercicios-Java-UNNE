import java.util.Calendar;
import java.util.GregorianCalendar;

public class Banco {

    public static void main(String[] args) {
        // utilizamos el nuevo argumento del calendario para el constructor de persona
        Calendar fechaNacimiento = new GregorianCalendar(1998, 7, 8);

        Persona juan = new Persona(41442040, "Juan", "Perez", fechaNacimiento);

        // Ejemplo con cuenta Bancaria
        CuentaBancaria cajaAhorro = new CajaDeAhorro(1, juan);
        CuentaBancaria cuenta = new CuentaCorriente(1, juan);

        // Ejemplo con Cuenta Corriente
        cuenta.depositar(20000);
        cuenta.mostrar();
        cuenta.extraer(15000);
        cuenta.mostrar();
        // Hacemos que nos salte que no se puede extraer mas del saldo + limite
        // descubierto
        cuenta.extraer(10000);

        // Ejemplo con Caja de Ahorro

        cajaAhorro.depositar(20000);
        cajaAhorro.mostrar();
        cajaAhorro.extraer(15000);
        cajaAhorro.mostrar();
        // Volvemos a realizar la comprovacion de que no te deja sacar mas saldo del
        // que tiene la cuenta
        cajaAhorro.extraer(15000);

        // Probamos el nuevo metodo esCumpleaños

        // if(juan.esCumpleanios()){
        // System.out.println("Feliz Cumple");
        // }else{
        // System.out.println("No es su cumple");
        // }
    }

}
