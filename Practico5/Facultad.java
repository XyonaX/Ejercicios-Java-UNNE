import java.util.HashMap;
import java.util.Map;

public class Facultad {
    private String nombre;
    private HashMap<Integer, Profesor> profesores;

    public Facultad(String p_nombre, HashMap<Integer, Profesor> p_profesores) {
        this.setNombre(p_nombre);
        this.setProfesores(p_profesores);
    }

    public Facultad(String p_nombre) {
        this.setNombre(p_nombre);
        this.setProfesores(new HashMap<>());
    }

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

    public void altaProfesor(Profesor p_profesor) {
        this.getProfesores().put(p_profesor.getDNI(), p_profesor);
    }

    public void bajaProfesor(int p_dni) {
        if (this.getProfesores().size() > 1) {
            this.getProfesores().remove(p_dni);
        }
        System.out.println("No puede dar de baja todos los profesores!");
    }

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

    public double totalAPagar() {
        double totalAPagar = 0.0;
        for (Map.Entry<Integer, Profesor> profe : this.getProfesores().entrySet()) {
            totalAPagar += profe.getValue().sueldoTotal();
        }
        return totalAPagar;
    }

    public void listarProfesoresCargos() {
        System.out.printf("\n***** Detalle de Profesores y cargos de Facultad: %s *****\n", this.getNombre());
        for (Map.Entry<Integer, Profesor> profe : this.getProfesores().entrySet()) {
            profe.getValue().mostrar();
            System.out.println("\n---------------------------------------\n");
        }
        System.out.printf("Hay %d profesores\n\n", this.getProfesores().size());
    }

}
