/**
 * Clase que representa un cargo exclusivo. Hereda de la clase Cargo e incluye
 * atributos adicionales para las horas de investigación y extensión.
 * Proporciona métodos para obtener y establecer las horas de investigación y
 * extensión, así como para mostrar la información del cargo.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Exclusivo extends Cargo {
    private int horasDeInvestigacion; // Número de horas de investigación
    private int horasDeExtension; // Número de horas de extensión

    /**
     * Constructor para inicializar un cargo exclusivo con información específica.
     * 
     * @param p_cargo              String que representa el nombre del cargo.
     * @param p_sueldo             double que indica el sueldo básico.
     * @param p_anioIngreso        int que representa el año de ingreso.
     * @param p_horasDocencia      int que indica el número de horas de docencia.
     * @param p_horasInvestigacion int que representa el número de horas de
     *                             investigación.
     * @param p_horasExtension     int que representa el número de horas de
     *                             extensión.
     */
    public Exclusivo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia,
            int p_horasInvestigacion, int p_horasExtension) {
        super(p_cargo, p_sueldo, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasInvestigacion);
        this.setHorasExtension(p_horasExtension);
    }

    // Accessors
    private void setHorasInvestigacion(int p_horasInvestigacion) {
        this.horasDeInvestigacion = p_horasInvestigacion;
    }

    private void setHorasExtension(int p_horasExtension) {
        this.horasDeExtension = p_horasExtension;
    }

    public int getHorasInvestigacion() {
        return this.horasDeInvestigacion;
    }

    public int getHorasExtension() {
        return this.horasDeExtension;
    }

    // Fin Accessors
    /**
     * Muestra la información del cargo exclusivo, incluyendo las horas de
     * investigación y extensión.
     */
    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("\n----Cargo de caracter Exclusivo----");
        System.out.printf("Horas investigación: %d\nHoras Extensión: %d", this.getHorasInvestigacion(),
                this.getHorasExtension());
    }
}