/**
 * Permite crear y manipular un objeto de tipo Servicio
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Servicio {
  private String descripcion;
  private double precio;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_descripcion String;
   * @param p_precio      double;
   */
  public Servicio(String p_descripcion, double p_precio) {
    this.setDescripcion(p_descripcion);
    this.setPrecio(p_precio);
  }

  // Accesors.
  public String getDescripcion() {
    return this.descripcion;
  }

  private void setDescripcion(String p_descripcion) {
    this.descripcion = p_descripcion;
  }

  public double getPrecio() {
    return this.precio;
  }

  private void setPrecio(double p_precio) {
    this.precio = p_precio;
  }
  // Fin Accesors.
}