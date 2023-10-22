/**
 * Clase que representa un cargo semi-exclusivo de un profesor.
 * 
 * Contiene información sobre las horas de docencia e investigación del cargo.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class SemiExclusivo extends Cargo {
    private int horasDeInvestigacion; // Horas dedicadas a la investigación

    /**
     * Constructor que inicializa un cargo semi-exclusivo con sueldo, año de
     * ingreso, horas de docencia e horas de investigación.
     * 
     * @param p_cargo              Nombre del cargo.
     * @param p_sueldo             Sueldo del cargo.
     * @param p_anioIngreso        Año de ingreso al cargo.
     * @param p_horasDocencia      Horas dedicadas a la docencia.
     * @param p_horasInvestigacion Horas dedicadas a la investigación.
     */
    public SemiExclusivo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia,
            int p_horasInvestigacion) {
        super(p_cargo, p_sueldo, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasInvestigacion);
    }

    // Accessors
    private void setHorasInvestigacion(int p_horasInvestigacion) {
        this.horasDeInvestigacion = p_horasInvestigacion;
    }

    public int getHorasInvestigacion() {
        return this.horasDeInvestigacion;
    }

    // Fin Accessors
    /**
     * Muestra la información del cargo semi-exclusivo en la consola.
     */
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("\n----Cargo de caracter SemiExclusivo----");
        System.out.printf("Horas investigacion: %d", this.getHorasInvestigacion());
    }
}