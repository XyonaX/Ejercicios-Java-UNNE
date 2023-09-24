/**
 * Implementacion de la clase Laboratorio.
 * 
 * @author Vargas Portillo,Jonatan Ezequiel.
 * @author X, Ingrid Noelí.
 */

public class Laboratorio {
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;

    /**
     * Inicializa atributos por parametros.
     * 
     * @param p_nombre    String;
     * @param p_domicilio String;
     * @param p_telefono  String;
     * @param p_compraMin int;
     * @param p_diaEnt    int;
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }

    /**
     * Inicializa atributos por parametro y por valor.
     * 
     * @param p_nombre    String;
     * @param p_domicilio String;
     * @param p_telefono  String;
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(1); // Valor por defecto para la compra mínima
        this.setDiaEntrega(3); // Valor por defecto para el día de entrega
    }

    // Accessors
    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }

    private void setTelefono(String p_telefono) {
        this.telefono = p_telefono;
    }

    private void setCompraMinima(int p_compraMin) {
        this.compraMinima = p_compraMin;
    }

    private void setDiaEntrega(int p_diaEnt) {
        this.diaEntrega = p_diaEnt;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public int getCompraMinima() {
        return this.compraMinima;
    }

    public int getDiaEntrega() {
        return this.diaEntrega;
    }

    // Fin de Accessors

    /**
     * Asigna p_compraMin al valor previo del atributo compraMinima.
     * 
     * @param p_compraMin int;
     */
    public void nuevaCompraMinima(int p_compraMin) {
        this.setCompraMinima(p_compraMin);
    }

    /**
     * Asigna p_diaEnt al valor previo del atributo diaEntrega.
     * 
     * @param p_diaEnt int;
     */
    public void nuevoDiaEntrega(int p_diaEnt) {
        this.setDiaEntrega(p_diaEnt);
    }

    /**
     * Muestra en pantalla el nombre del laboratorio, domicilio y telefono
     * 
     */
    public String mostrar() {
        return "Laboratorio: " + this.getNombre() + "\n" + "Domicilio: " + this.getDomicilio() + " Telefono: "
                + this.getTelefono();
    }
}
