import java.util.ArrayList;

/**
 * Clase que representa a un profesor con título, cargos y atributos heredados
 * de
 * Persona.
 * 
 * Extiende la clase abstracta Persona.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Profesor extends Persona {
    private String titulo; // Título del profesor
    private ArrayList<Cargo> cargos; // Lista de cargos asignados al profesor

    /**
     * Constructor para inicializar un profesor con DNI, nombre, apellido, año de
     * nacimiento, título y lista de cargos.
     * 
     * @param p_dni      Número de DNI del profesor.
     * @param p_nombre   Nombre del profesor.
     * @param p_apellido Apellido del profesor.
     * @param p_anio     Año de nacimiento del profesor.
     * @param p_titulo   Título del profesor.
     * @param p_cargos   Lista de cargos asignados al profesor.
     */
    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo,
            ArrayList<Cargo> p_cargos) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }

    // Accessors
    public ArrayList<Cargo> getCargos() {
        return this.cargos;
    }

    private void setCargos(ArrayList<Cargo> p_cargos) {
        this.cargos = p_cargos;
    }

    public String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String p_titulo) {
        this.titulo = p_titulo;
    }

    // Fin Accessors
    /**
     * Agrega un cargo a la lista de cargos del profesor, si el límite de 3 cargos
     * no
     * se ha alcanzado.
     * 
     * @param p_cargo Cargo a agregar.
     * @return true si se pudo agregar, false si se alcanzó el límite de 3 cargos.
     */
    public boolean agregarCargo(Cargo p_cargo) {
        if (this.getCargos().size() < 3) {
            return this.getCargos().add(p_cargo);
        } else {
            System.out.println("Solo puede tener 3 cargos");
            return false;
        }
    }

    /**
     * Quita un cargo de la lista de cargos del profesor, siempre y cuando queden al
     * menos 2 cargos.
     * 
     * @param p_cargo Cargo a quitar.
     * @return true si se pudo quitar, false si no se pueden eliminar todos los
     *         cargos.
     */
    public boolean quitarCargo(Cargo p_cargo) {
        if (this.getCargos().size() > 1) {
            return this.getCargos().remove(p_cargo);
        } else {
            System.out.println("No se pueden eliminar todos los cargos");
            return false;
        }
    }

    /**
     * Muestra los detalles del profesor, incluyendo nombre, DNI, título, cargos
     * asignados y sueldo total.
     */
    public void mostrar() {
        super.mostrar();
        System.out.printf("\nTitulo:%s", this.getTitulo());
        this.listarCargos();
        System.out.printf("\n** Sueldo Total: %.2f  **", sueldoTotal());
    }

    /**
     * Lista los cargos asignados al profesor.
     */
    public void listarCargos() {
        System.out.println("\n\n-***** Cargos Asignados *****-\n" + "---------------------------------------\n");
        for (Cargo cargo : (ArrayList<Cargo>) this.getCargos()) {
            cargo.mostrarCargo();
            System.out.println("");
        }
    }

    /**
     * Calcula el sueldo total del profesor, sumando los sueldos de todos los cargos
     * asignados.
     * 
     * @return Sueldo total del profesor.
     */
    public double sueldoTotal() {
        double sueldoTotal = 0.0;
        for (Cargo cargo : (ArrayList<Cargo>) this.getCargos()) {
            sueldoTotal += cargo.sueldoDelCargo();
        }
        return sueldoTotal;
    }

    /**
     * Retorna una cadena con la información del profesor en un formato específico.
     * 
     * @return Cadena con la información del profesor.
     */
    public String mostrarLinea() {
        return String.format("DNI: %d - Nombre: %s - Sueldo Total: %.2f", this.getDNI(), this.nomYApe(),
                this.sueldoTotal());
    }
}