import java.util.HashMap;
import java.util.Map;

/**
 * Clase que representa una facultad. Contiene un nombre y un mapa de profesores
 * identificados por su DNI. Proporciona métodos para realizar operaciones sobre
 * los profesores, como dar de alta o baja, calcular la nómina y listar
 * profesores.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Facultad {
    private String nombre; // Nombre de la facultad
    private HashMap<Integer, Profesor> profesores; // Mapa de profesores identificados por DNI

    /**
     * Constructor para inicializar una facultad con nombre y un mapa de profesores.
     * 
     * @param p_nombre     String que representa el nombre de la facultad.
     * @param p_profesores HashMap de profesores identificados por DNI.
     */
    public Facultad(String p_nombre, HashMap<Integer, Profesor> p_profesores) {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }

    /**
     * Constructor para inicializar una facultad con solo el nombre.
     * 
     * @param p_nombre String que representa el nombre de la facultad.
     */
    public Facultad(String p_nombre) {
        this.setNombre(p_nombre);
        this.setProfesores(new HashMap<>());
    }

    // Accessors
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public HashMap<Integer, Profesor> getProfesores() {
        return this.profesores;
    }

    private void setProfesores(HashMap<Integer, Profesor> p_profesores) {
        this.profesores = p_profesores;
    }

    // Fin Accessors
    /**
     * Da de alta un profesor en la facultad.
     * 
     * @param p_profesor Profesor a dar de alta.
     */
    public void altaProfesor(Profesor p_profesor) {
        this.getProfesores().put(p_profesor.getDNI(), p_profesor);
    }

    /**
     * Da de baja un profesor en la facultad.
     * 
     * @param p_dni DNI del profesor a dar de baja.
     */
    public void bajaProfesor(int p_dni) {
        if (this.getProfesores().size() > 1) {
            this.getProfesores().remove(p_dni);
        }
        System.out.println("No puede dar de baja todos los profesores!");
    }

    /**
     * Calcula la nómina de todos los profesores en la facultad.
     */
    public void nominaProfesores() {
        System.out.printf(
                "*************** Nómina Facultad: %s\n ------------------------------------------------------------------\n",
                this.getNombre());
        for (Map.Entry<Integer, Profesor> profe : this.getProfesores().entrySet()) {
            System.out.println(profe.getValue().mostrarLinea());
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.printf("\nTotal a pagar: $%.2f\n", totalAPagar());
    }

    /**
     * Calcula el total a pagar de todos los profesores en la facultad.
     * 
     * @return double que representa el total a pagar.
     */
    public double totalAPagar() {
        double totalAPagar = 0.0;
        for (Map.Entry<Integer, Profesor> profe : this.getProfesores().entrySet()) {
            totalAPagar += profe.getValue().sueldoTotal();
        }
        return totalAPagar;
    }

    /**
     * Lista los profesores y sus cargos en la facultad.
     */
    public void listarProfesoresCargos() {
        System.out.printf("\n***** Detalle de Profesores y cargos de Facultad: %s *****\n", this.getNombre());
        for (Map.Entry<Integer, Profesor> profe : this.getProfesores().entrySet()) {
            profe.getValue().mostrar();
            System.out.println("\n---------------------------------------\n");
        }
        System.out.printf("Hay %d profesores\n\n", this.getProfesores().size());
    }
}