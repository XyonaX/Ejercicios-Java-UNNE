
/**
 * Permite crear y manupular un objeto Zoologico.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.util.ArrayList;
import java.util.Calendar;

public class Zoologico {
  private String nombre;
  private ArrayList<Visitante> visitantes;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nombre     String;
   * @param p_visitantes ArrayList<Visitante>;
   */
  public Zoologico(String p_nombre, ArrayList<Visitante> p_visitantes) {
    this.setNombre(p_nombre);
    this.setVisitantes(p_visitantes);
  }

  // Accesors.
  public String getNombre() {
    return this.nombre;
  }

  private void setNombre(String p_nombre) {
    this.nombre = p_nombre;
  }

  public ArrayList<Visitante> getVisitantes() {
    return this.visitantes;
  }

  private void setVisitantes(ArrayList<Visitante> p_visitantes) {
    this.visitantes = p_visitantes;
  }
  // Fin Accesors.

  /**
   * Agrega el visitante recibido por parametro a la coleccion.
   * 
   * @param p_visitante Visitante;
   */
  public void nuevoVisitante(Visitante p_visitante) {
    this.getVisitantes().add(p_visitante);
  }

  /**
   * Quita el visitante recibido por parametro de la coleccion.
   * 
   * @param p_visitante Visitante;
   */
  public void quitarVisitante(Visitante p_visitante) {
    this.getVisitantes().remove(p_visitante);
  }

  /**
   * Lista al tipo de visitante recibido por parametro segun la fecha recibida.
   * 
   * @param p_fechaVisita Calendar;
   * @param p_visitante   String;
   */
  public void listaTipoVisitantePorFecha(Calendar p_fechaVisita, String p_visitante) {
    for (Visitante visitante : this.getVisitantes()) {
      visitante.listarPorFecha(p_fechaVisita, p_visitante);
    }
  }

  /**
   * Lista a los visitantes por la fecha recibida como parametro.
   * 
   * @param p_fecha Calendar;
   */
  public void listaVisitantePorFecha(Calendar p_fecha) {
    for (Visitante visitante : this.getVisitantes()) {
      if (visitante.getFechaVisita().equals(p_fecha)) {
        visitante.mostrar();
      }
    }
  }

  /**
   * Calcula y retorna el total de recaudacion desde cierta fecha hasta cierta
   * fecha.
   * 
   * @param p_fechaDesde Calendar;
   * @param p_fechaHasta Calendar;
   * @return el total de la recaudacion.
   */
  public double recaudacion(Calendar p_fechaDesde, Calendar p_fechaHasta) {
    double totalRecaudacion = 0.0;
    for (Visitante visitante : this.getVisitantes()) {
      if (visitante.getFechaVisita().after(p_fechaDesde) && visitante.getFechaVisita().before(p_fechaHasta)) {
        totalRecaudacion += visitante.entrada();
      }
    }
    return totalRecaudacion;
  }

}