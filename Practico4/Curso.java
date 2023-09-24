import java.util.HashMap;
import java.util.Map;

/**
 * Permite administrar Cursos con sus alumnos
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo,Jonatan Ezequiel.
 */

public class Curso {
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;

    /**
     * Constructor que inicializa los atributos por parametro.
     * Y inicializa una coleccion con el HashMap
     * 
     * @param p_nombre String;
     */
    public Curso(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }

    /**
     * Constructor que inicializa los atributos por parametro.
     * 
     * @param p_nombre String;
     * @param p_alumno HashMap<Integer, Alumno>;
     */
    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos) {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

    // Accessors
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public HashMap<Integer, Alumno> getAlumnos() {
        return this.alumnos;
    }

    public void setAlumnos(HashMap<Integer, Alumno> p_alumnos) {
        this.alumnos = p_alumnos;
    }

    // Fin Accessors

    /**
     * Agrega alumno recibido por parametro.
     * 
     * @param p_alumno Alumno;
     */
    public void inscribirAlumno(Alumno p_alumno) {
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }

    /**
     * Quita al alumno recibido por parametro.
     * 
     * @param p_empleados Empleado;
     * @return el alumno quitado de la coleccion;
     */

    public Alumno quitarAlumno(int p_lu) {
        return this.getAlumnos().remove(p_lu);
    }

    /**
     * Metodo que retorna la cantidad de alumnos inscriptos
     * 
     * @return int; la cantidad de alumnos
     */
    public int cantidadDeAlumnos() {
        return this.getAlumnos().size();
    }

    /**
     * Metodo para saber si un alumno esta inscripto
     * 
     * @param p_lu int;
     * @return boolean; retorna true o false
     */
    public boolean estaInscripto(int p_lu) {
        return this.getAlumnos().containsKey(p_lu);
    }

    /**
     * Metodo para saber si un alumno esta inscripto
     * 
     * @param p_alumno Alumno;
     * @return boolean; retorna true o false
     */
    public boolean estaInscripto(Alumno p_alumno) {
        return this.getAlumnos().containsValue(p_alumno);
    }

    /**
     * Metodo para buscar un alumno
     * 
     * @param p_lu int;
     * @return Alumno; retorna un alumno
     */
    public Alumno buscarAlumno(int p_lu) {
        return this.getAlumnos().get(p_lu);
    }

    /**
     * Metodo que imprime el promedio del alumno buscado
     * 
     * @param p_lu int;
     */
    public void imprimirPromedioDelAlumno(int p_lu) {
        if (this.estaInscripto(p_lu)) {
            Alumno alumno = buscarAlumno(p_lu);
            System.out.printf("****-- Mostrar promedio del alumno %d --****\n" + //
                    "Promedio: %.2d", p_lu, alumno.promedio());
        } else {
            System.out.println("El alumno no se encuentra inscripto");
        }
    }

    /**
     * Metodo que muestra informacion sobre los alumnos inscriptos
     * en el curso
     */
    public void mostrarInscriptos() {
        System.out.printf("****-- Cantidad de inscriptos: %d\n", this.cantidadDeAlumnos());
        for (Map.Entry<Integer, Alumno> alumno : this.getAlumnos().entrySet()) {
            System.out.printf("%d\t%s\n", alumno.getKey(), alumno.getValue().nomYApe());
        }
    }
}
