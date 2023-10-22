
/**
 * Clase abstracta Alojamiento.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.*;

public abstract class Alojamiento {
  private String nombre;
  private double precioBase;
  private int diasAlquiler;
  private ArrayList<Servicio> servicios;

  /**
   * Constructor que inicializa todos los atributos por parametro.
   * 
   * @param p_nombre    String;
   * @param p_precio    double;
   * @param p_dias      int;
   * @param p_servicios ArrayList<Servicio>;
   */
  public Alojamiento(String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios) {
    this.setNombre(p_nombre);
    this.setPrecioBase(p_precio);
    this.setDiasAlquiler(p_dias);
    this.setServicios(p_servicios);
  }

  // Accesors.
  public String getNombre() {
    return this.nombre;
  }

  private void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  public double getPrecioBase() {
    return this.precioBase;
  }

  private void setPrecioBase(double p_precioBase) {
    this.precioBase = p_precioBase;
  }

  public int getDiasAlquiler() {
    return this.diasAlquiler;
  }

  private void setDiasAlquiler(int p_diasAlquiler) {
    this.diasAlquiler = p_diasAlquiler;
  }

  public ArrayList<Servicio> getServicios() {
    return this.servicios;
  }

  private void setServicios(ArrayList<Servicio> p_servicios) {
    this.servicios = p_servicios;
  }
  // Fin Accesors.

  /**
   * Agrega el servicio recibido por parametro a la coleccion.
   * 
   * @param p_servicio Servicio;
   * @return true o false segun si el Servicio fue agregado la coleccion.
   */
  public boolean agregarServicio(Servicio p_servicio) {
    return this.getServicios().add(p_servicio);
  }

  /**
   * Quita el servicio recibido por parametro de la coleccion.
   * 
   * @param p_servicio Servicio;
   * @return true o false segun si el Servicio fue removido de la coleccion.
   */
  public boolean quitarServicio(Servicio p_servicio) {
    return this.getServicios().remove(p_servicio);
  }

  public abstract int contar(String p_alojamiento);

  /**
   * Calcula el costo segun el precio base y los dias de alquiler
   * 
   * @return el costo.
   */
  public double costo() {
    return this.getPrecioBase() * this.getDiasAlquiler();
  }

  /**
   * Lista por pantalla los servicios y su precio.
   */
  public void listarServicios() {
    for (Servicio s : this.getServicios()) {
      System.out.println(s.getDescripcion() + ": $" + s.getPrecio());
    }
  }

  /**
   * Calcula el costo total de los servicios.
   * 
   * @return el costo total de los servicios.
   */
  public double costoServicios() {
    double totalCosto = 0;
    for (Servicio s : this.getServicios()) {
      totalCosto += s.getPrecio();
    }
    return totalCosto;
  }

  /**
   * Muestra por pantalla las caracteristicas del alojamiento y los servicios.
   */
  public void liquidar() {
    System.out.println("Alojamiento: " + this.getNombre());
    System.out.println("Costo por " + this.getDiasAlquiler() + " dias: $" + this.costo());
    this.listarServicios();
  }
}