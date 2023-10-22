
/**
 * Clase abstracta de visitante.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.*;

public abstract class Visitante {
  private String nombre;
  private Calendar fechaVisita;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nombre;
   * @param p_fechaVisita;
   */
  public Visitante(String p_nombre, Calendar p_fechaVisita) {
    this.setNombre(p_nombre);
    this.setFechaVisita(p_fechaVisita);
  }

  // Accesors.
  public String getNombre() {
    return this.nombre;
  }

  private void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  public Calendar getFechaVisita() {
    return this.fechaVisita;
  }

  private void setFechaVisita(Calendar p_fechaVisita) {
    this.fechaVisita = p_fechaVisita;
  }
  // Fin Accesors.

  public abstract void mostrar();

  public abstract double entrada();

  public abstract void listarPorFecha(Calendar p_fecha, String p_visitante);

  public abstract String tipoVisitante();
}