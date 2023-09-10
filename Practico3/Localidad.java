
public class Localidad {
    private String nombre;
    private String provincia;

    public Localidad(String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    private void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String mostrar(){
        return String.format("Localidad: %s \tProvincia: %s", this.getNombre(),this.getProvincia());
    }
    
}
