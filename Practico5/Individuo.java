
/**
 * Permite crear y manipular un objeto Individuo.
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
import java.text.SimpleDateFormat;
import java.util.*;

public class Individuo extends Visitante {
  private Persona persona;

  /**
   * Constructor que inicializa los atributos por parametro.
   * 
   * @param p_nombre      String;
   * @param p_fechaVisita Calendar;
   * @param p_persona     Persona;
   */
  public Individuo(String p_nombre, Calendar p_fechaVisita, Persona p_persona) {
    super(p_nombre, p_fechaVisita);
    this.setPersona(p_persona);
  }

  // Accesors.
  public Persona getPersona() {
    return this.persona;
  }

  private void setPersona(Persona p_persona) {
    this.persona = p_persona;
  }
  // Fin Accesors.

  /**
   * Muestra por pantalla los datos del individuo.
   */
  public void mostrar() {
    this.getPersona().mostrar();
  }

  /**
   * Retorna el valor de la entrada del individuo.
   */
  public double entrada() {
    return 10.0;
  }

  /**
   * Lista por fecha recibida y tipo de visitante, y muestra sus datos.
   */
  public void listarPorFecha(Calendar p_fecha, String p_visitante) {
    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy"); // Define el formato de fecha que prefieras
    String fechaFormateada = sdf.format(super.getFechaVisita().getTime());

    if (fechaFormateada.equals(sdf.format(p_fecha.getTime()))) {
      System.out.println("Fecha: " + fechaFormateada);
      System.out.println("Visitante: ");
      this.mostrar();
    }
  }

  /**
   * Retorna el tipo de visitante en formato String.
   */
  public String tipoVisitante() {
    return "Individuo";
  }
}