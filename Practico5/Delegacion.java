
/**
 * Permite crear y manipular un objeto Delegacion.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Delegacion extends Visitante {
  private ArrayList<Individuo> integrantes;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nombre      String;
   * @param p_fechaVisita Calendar;
   * @param p_integrantes ArrayList<Visitante>;
   */
  public Delegacion(String p_nombre, Calendar p_fechaVisita, ArrayList<Individuo> p_integrantes) {
    super(p_nombre, p_fechaVisita);
    this.setIntegrantes(p_integrantes);
  }

  // Accesors.
  public ArrayList<Individuo> getIntegrantes() {
    return this.integrantes;
  }

  private void setIntegrantes(ArrayList<Individuo> p_integrantes) {
    this.integrantes = p_integrantes;
  }
  // Fin Accesors.

  /**
   * Agrega al visitante a la coleccion.
   * 
   * @param p_integrante Visitante;
   */
  public void agregaIntegrante(Individuo p_integrante) {
    this.getIntegrantes().add(p_integrante);
  }

  /**
   * Quita al visitante de la coleccion.
   * 
   * @param p_integrante Visitante;
   */
  public void quitaIntegrante(Individuo p_integrante) {
    if (this.getIntegrantes().size() > 1) {
      this.getIntegrantes().remove(p_integrante);
    } else {
      System.out.println("No es posible quitar integrantes");
    }
  }

  /**
   * Muestra por pantalla a la delegacion, sus integrantes y la cantidad de los
   * mismos.
   */
  public void mostrar() {
    System.out.println("----------------------------------");
    System.out.println("Delegacion: " + super.getNombre());
    System.out.println("Integrantes");
    for (Visitante visitante : this.getIntegrantes()) {
      visitante.mostrar();
    }
    System.out.println("Cantidad de integrantes: " + this.getIntegrantes().size());
    System.out.println("----------------------------------");
  }

  /**
   * Devuelve el valor de la entrada de una delegacion.
   */
  public double entrada() {
    double totalEntradas = 0.0;
    for (Individuo visitante : this.getIntegrantes()) {
      totalEntradas += visitante.entrada();
    }
    return totalEntradas - (0.10 * totalEntradas);
  }

  /**
   * Lista por fecha al tipo de visitante que asistio en X fecha.
   */
  public void listarPorFecha(Calendar p_fecha, String p_visitante) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Define el formato de fecha que prefieras
    String fechaFormateada = sdf.format(super.getFechaVisita().getTime());

    if (fechaFormateada.equals(sdf.format(p_fecha.getTime()))
        && this.tipoVisitante().toLowerCase().equals(p_visitante.toLowerCase())) {
      System.out.println("Lista de las personas que asistieron el " + fechaFormateada);
      this.mostrar();
    }
  }

  /**
   * Retorna el tipo de visitante en formato String.
   */
  public String tipoVisitante() {
    return "Delegacion";
  }

}