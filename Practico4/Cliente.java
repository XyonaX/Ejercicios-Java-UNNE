
public class Cliente {
    private int nroDNI;
    private String apellido;
    private String nombre;
    private double saldo;

    public Cliente(int p_dni, String p_apellido, String p_nombre, double p_importe) {
        this.setNroDNI(p_dni);
        this.setApellido(p_apellido);
        this.setNombre(p_nombre);
        this.setSaldo(p_importe);
    }

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

    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYape() + "(" + this.getNroDNI() + ")");
        System.out.println("Saldo: $" + this.getSaldo());
    }

    public String nomYape() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYnom() {
        return this.getApellido() + " " + this.getNombre();
    }

    public double nuevoSaldo(double p_importe) {
        this.setSaldo(p_importe);
        return p_importe;
    }

    public double agregaSaldo(double p_importe) {
        this.setSaldo(p_importe + this.getSaldo());
        return this.getSaldo();
    }

}
