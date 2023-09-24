/**
 * Una clase para simular las informacion sobre localidades.
 * 
 * @author Vargas Portillo,Jonatan Ezequiel.
 * @author X, Ingrid Noelí.
 */

public class Localidad {
    private String nombre;
    private String provincia;

    // Constructor para inicializar los atributos de la localidad
    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre    String;
     * @param p_provincia String;
     */
    public Localidad(String p_nombre, String p_provincia) {
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }

    // Accessors
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProvincia() {
        return this.provincia;
    }

    private void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    // Fin De Accessors

    /**
     * Concatena el nombre y la provincia de la localidad.
     * 
     * @return Retorna el nombre y provincia de la localidad.
     */
    public String mostrar() {
        return String.format("Localidad: %s \tProvincia: %s", this.getNombre(), this.getProvincia());
    }
}
