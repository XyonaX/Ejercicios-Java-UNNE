
/**
 * Permite crear y manipular un objeto de tipo Hotel.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.*;

public class Hotel extends Alojamiento {
  private String tipoHabitacion;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_tipoHab   String;
   * @param p_nombre    String;
   * @param p_precio    double;
   * @param p_dias      int;
   * @param p_servicios ArrayList<Servicio>;
   */
  public Hotel(String p_tipoHab, String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios) {
    super(p_nombre, p_precio, p_dias, p_servicios);
    this.setTipoHabitacion(p_tipoHab);
  }

  // Accesors.
  public String getTipoHabitacion() {
    return this.tipoHabitacion;
  }

  private void setTipoHabitacion(String p_tipoHabitacion) {
    this.tipoHabitacion = p_tipoHabitacion;
  }
  // Fin Accesors.

  /**
   * Calcula el costo segun el tipo de habitacion y lo retorna.
   */
  public double costo() {
    if (this.getTipoHabitacion() == "Single") {
      double adicional = 20 * super.getDiasAlquiler();
      return super.costo() + adicional;
    } else {
      double adicional = 35 * super.getDiasAlquiler();
      return super.costo() + adicional;
    }
  }

  /**
   * Cuenta el tipo de alojamiento recibido.
   */
  public int contar(String p_alojamiento) {
    int contar = 0;
    if (this.getClass().getName().equals(p_alojamiento)) {
      contar = 1;
    }
    return contar;
  }

  /**
   * Muestra los detalles de liquidacion de un hotel.
   */
  public void liquidar() {
    super.liquidar();
    System.out.println("Habitacion " + this.getTipoHabitacion());
    System.out.println("Total: -----> $" + (super.costoServicios() + this.costo()));
  }
}