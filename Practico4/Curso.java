import java.util.HashMap;
import java.util.Map;

public class Curso {
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;

    public Curso(String p_nombre) {
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<Integer, Alumno>());
    }

    public Curso(String p_nombre, HashMap<Integer, Alumno> p_alumnos) {
        this.setNombre(p_nombre);
        this.setAlumnos(p_alumnos);
    }

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

    public void inscribirAlumno(Alumno p_alumno) {
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }

    public Alumno quitarAlumno(int p_lu) {
        return this.getAlumnos().remove(p_lu);
    }

    public int cantidadDeAlumnos() {
        return this.getAlumnos().size();
    }

    // public boolean estaInscripto(int p_lu) {
    // boolean flag = false;

    // for (Map.Entry<Integer, Alumno> e : this.getAlumnos().entrySet()) {
    // if (e.getKey() == p_lu) {
    // flag = true;
    // }
    // }
    // return flag;
    // }

    public boolean estaInscripto(int p_lu) {
        return this.getAlumnos().containsKey(p_lu);
    }

    public boolean estaInscripto(Alumno p_alumno) {
        return this.getAlumnos().containsValue(p_alumno);
    }

    public Alumno buscarAlumno(int p_lu) {
        return this.getAlumnos().get(p_lu);
    }

    public void imprimirPromedioDelAlumno(int p_lu) {
        if (this.estaInscripto(p_lu)) {
            Alumno alumno = buscarAlumno(p_lu);
            System.out.printf("****-- Mostrar promedio del alumno %d --****\n" + //
                    "Promedio: %.2d", p_lu, alumno.promedio());
        } else {
            System.out.println("El alumno no se encuentra inscripto");
        }
    }

    public void mostrarInscriptos() {
        System.out.printf("****-- Cantidad de inscriptos: %d\n", this.cantidadDeAlumnos());
        for (Map.Entry<Integer, Alumno> alumno : this.getAlumnos().entrySet()) {
            System.out.printf("%d\t%s\n", alumno.getKey(), alumno.getValue().nomYApe());
        }
    }
}
