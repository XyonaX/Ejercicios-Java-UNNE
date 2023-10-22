
/**
 * Permite crear y manipular un objeto de tipo Jardin.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.*;

public class Gerencia {
  private String nombre;
  private ArrayList<Alojamiento> alojamientosAlquilados;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nombre       String;
   * @param p_alojamientos ArrayList<Alojamiento>;
   */
  public Gerencia(String p_nombre, ArrayList<Alojamiento> p_alojamientos) {
    this.setNombre(p_nombre);
    this.setAlojamientosAlquilados(p_alojamientos);
  }

  // Accesors.
  public String getNombre() {
    return this.nombre;
  }

  private void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  public ArrayList<Alojamiento> getAlojamientosAlquilados() {
    return this.alojamientosAlquilados;
  }

  private void setAlojamientosAlquilados(ArrayList<Alojamiento> p_alojamientosAlquilados) {
    this.alojamientosAlquilados = p_alojamientosAlquilados;
  }
  // Fin Accesors.

  /**
   * Agrega el alojamiento recibido por parametro a la coleccion de Alojamientos.
   * 
   * @param p_alojamiento Alojamiento;
   * @return true o false segun si el alojamiento fue agregado a la coleccion.
   */
  public boolean agregarAlojamiento(Alojamiento p_alojamiento) {
    return this.getAlojamientosAlquilados().add(p_alojamiento);
  }

  /**
   * Quita el alojamiento recibido por parametro de la coleccion de Alojamientos.
   * 
   * @param p_alojamiento Alojamiento;
   * @return true o false segun si el alojamiento fue removido de la coleccion.
   */
  public boolean quitarAlojamiento(Alojamiento p_alojamiento) {
    return this.getAlojamientosAlquilados().remove(p_alojamiento);
  }

  /**
   * Cuenta la cantidad de alojamientos del tipo recibido por parametro.
   * 
   * @param p_tipoAlojamiento String;
   * @return la cantidad de alojamientos del tipo especificado.
   */
  public int contarAlojamiento(String p_tipoAlojamiento) {
    int cantidadAlojamientos = 0;
    for (Alojamiento a : this.getAlojamientosAlquilados()) {
      cantidadAlojamientos += a.contar(p_tipoAlojamiento);
    }
    return cantidadAlojamientos;
  }

  /**
   * Muestra la liquidacion de los alojamientos alquilados.
   */
  public void liquidar() {
    System.out.println("Liquidacion--------------------------------\n");
    for (Alojamiento a : this.getAlojamientosAlquilados()) {
      a.liquidar();
    }
    System.out.println();
  }

  /**
   * Muestra la liquidacion y la cantidad de alojamientos de cada tipo.
   */
  public void mostrarLiquidacion() {
    System.out.println("Gerencia " + this.getNombre());
    this.liquidar();
    System.out.println("Alojamiento tipo Cabaña ----> " + this.contarAlojamiento("Cabania"));
    System.out.println("Alojamiento tipo Hotel -----> " + this.contarAlojamiento("Hotel"));
  }
}