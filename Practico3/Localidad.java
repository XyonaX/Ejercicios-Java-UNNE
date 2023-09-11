public class Localidad {
    private String nombre;      
    private String provincia;   

    // Constructor para inicializar los atributos de la localidad
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

    // Método para mostrar la información de la localidad
    public String mostrar(){
        return String.format("Localidad: %s \tProvincia: %s", this.getNombre(), this.getProvincia());
    }
}
