

public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(1);
        this.setDiaEntrega(3);
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

    public void nuevaCompraMinima(int p_compraMin)
    {
        this.setCompraMinima(p_compraMin);
    }
    
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    
    public String mostrar(){
        return "Laboratorio: " + this.getNombre() +"\n" +"Domicilio: " + this.getDomicilio() + " Telefono: " +this.getTelefono();
    }
}
