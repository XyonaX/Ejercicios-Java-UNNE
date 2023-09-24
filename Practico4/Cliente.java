/**
 * Permite controlar los saldos de los clientes
 * 
 * @author Vargas Portillo,Jonatan Ezequiel.
 * @author X, Ingrid Noelí.
 */
public class Cliente {
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    /**
     * Constructor que inicializa atributos por parametro.
     * 
     * @param p_dni      int;
     * @param p_apellido String;
     * @param p_nombre   String;
     * @param p_importe  double;
     */

    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe) {
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }

    // Accessors
    public int getNroDNI() {
        return this.nroDNI;
    }

    public void setNroDNI(int p_dni) {
        this.nroDNI = p_dni;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double p_saldo) {
        this.saldo = p_saldo;
    }

    // Fin de Accessors
    /**
     * muestra por pantalla el nombre, apellido y saldo del cliente
     * 
     */
    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYape() + "(" + this.getNroDNI() + ")");
        System.out.println("Saldo: $" + this.getSaldo());
    }

    /**
     * concatena el nombre y apellido del empleado separado por un espacio
     * 
     */
    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * concatena el apellido y nombre del empleado separado por un espacio
     * 
     */
    public String apeYnom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * reemplaza el saldo actual y retorna el nuevo
     * 
     * @param p_importe double;
     * @return p_importe;
     */
    public double nuevoSaldo(double p_importe) {
        this.setSaldo(p_importe);
        return p_importe;
    }

    /**
     * suma el saldo actual y retorna el nuevo saldo sumado
     * 
     * @param p_importe double;
     * @retun this.getSaldo();
     */
    public double agregaSaldo(double p_importe) {
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
    }

}
