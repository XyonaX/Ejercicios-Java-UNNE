

public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt)
    {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
        this.compraMinima = p_compraMin;
        this.diaEntrega = p_diaEnt;
    }
    
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono)
    {
        this.nombre = p_nombre;
        this.domicilio = p_domicilio;
        this.telefono = p_telefono;
        this.compraMinima = 1;
        this.diaEntrega = 3;
    }

    public void nuevaCompraMinima(int p_compraMin)
    {
        this.compraMinima = p_compraMin;
    }
    
    public void nuevoDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    public String mostrar(){
        return "Laboratorio: " + this.nombre +"\n" +"Domicilio: " + this.domicilio + " Telefono: " +this.telefono;
    }
}
