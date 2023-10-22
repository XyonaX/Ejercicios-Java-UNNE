
/**
 * Permite crear y manipular un objeto de tipo Cabania.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.*;

public class Cabania extends Alojamiento {
  private int nroHabitaciones;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nroHab    int;
   * @param p_nombre    String;
   * @param p_precio    double;
   * @param p_dias      int;
   * @param p_servicios ArrayList<Servicio>;
   */
  public Cabania(int p_nroHab, String p_nombre, double p_precio, int p_dias, ArrayList<Servicio> p_servicios) {
    super(p_nombre, p_precio, p_dias, p_servicios);
    this.setNroHabitaciones(p_nroHab);
  }

  // Accesors.
  public int getNroHabitaciones() {
    return this.nroHabitaciones;
  }

  private void setNroHabitaciones(int p_nroHabitaciones) {
    this.nroHabitaciones = p_nroHabitaciones;
  }
  // Fin Accesors.

  /**
   * Calcula y retorna el costo segun el nro de habitaciones y dias de alquiler.
   */
  public double costo() {
    double adicional = (30 * this.getNroHabitaciones()) * super.getDiasAlquiler();
    return super.costo() + adicional;
  }

  /**
   * Cuenta la cantidad de alojamientos de tipo "Cabania".
   * 
   * @return la cantidad de alojamientos.
   */
  public int contar(String p_alojamiento) {
    int contar = 0;
    if (this.getClass().getName().equals(p_alojamiento)) {
      contar = 1;
    }
    return contar;
  }

  /**
   * Muestra por pantalla los datos del alojamiento, el numero de habitaciones de
   * la cabaña y el costo final.
   */
  public void liquidar() {
    super.liquidar();
    System.out.println("Cabaña con " + this.getNroHabitaciones() + " habitaciones");
    System.out.println("Total: -----> $" + (super.costoServicios() + this.costo()));
  }
}