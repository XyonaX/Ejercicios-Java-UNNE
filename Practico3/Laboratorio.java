public class Laboratorio {
    private String nombre;       
    private String domicilio;    
    private String telefono;     
    private int compraMinima;    
    private int diaEntrega;      

    // Constructor para inicializar los atributos del laboratorio
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }

    // Constructor para inicializar solo el nombre, domicilio y teléfono del laboratorio
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono) {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(1);  // Valor por defecto para la compra mínima
        this.setDiaEntrega(3);   // Valor por defecto para el día de entrega
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }

    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }

    private void setDiaEntrega(int p_diaEnt){
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

    // Método para modificar la compra mínima requerida por el laboratorio
    public void nuevaCompraMinima(int p_compraMin) {
        this.setCompraMinima(p_compraMin);
    }

    // Método para modificar el día de entrega establecido por el laboratorio
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }

    // Método para mostrar la información del laboratorio
    public String mostrar(){
        return "Laboratorio: " + this.getNombre() +"\n" +"Domicilio: " + this.getDomicilio() + " Telefono: " +this.getTelefono();
    }
}
