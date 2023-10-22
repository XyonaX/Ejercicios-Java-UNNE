/**
 * Clase Alumno que hereda de Persona e implementa métodos relacionados con el
 * cálculo de notas y promedios.
 * Además, provee funcionalidades para determinar si el alumno aprueba o
 * desaprueba.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Alumno extends Persona {
    private int lu;
    private double nota1;
    private double nota2;

    /**
     * Constructor que inicializa los atributos de un Alumno.
     * 
     * @param p_lu       Int Número de legajo del Alumno.
     * @param p_nombre   String Nombre del Alumno.
     * @param p_apellido String Apellido del Alumno.
     * @param p_dni      Int DNI del Alumno.
     * @param p_anio     Int Año de nacimiento del Alumno.
     */
    public Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    // Accesors
    public int getLu() {
        return this.lu;
    }

    private void setLu(int lu) {
        this.lu = lu;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    public void setNota1(double p_nota) {
        this.nota1 = p_nota;
    }

    public void setNota2(double p_nota) {
        this.nota2 = p_nota;
    }

    // Fin Accessors
    /**
     * Determina si el Alumno aprueba.
     * 
     * @return true si el Alumno aprueba, false en caso contrario.
     */
    private boolean aprueba() {
        return this.promedio() >= 6;
    }

    /**
     * Obtiene la leyenda correspondiente a la aprobación del Alumno.
     * 
     * @return "APROBADO" si el Alumno aprueba, "DESAPROBADO" en caso contrario.
     */
    private String leyendaAprueba() {
        return this.aprueba() ? "APROBADO" : "DESAPROBADO";
    }

    /**
     * Calcula el promedio de notas del Alumno.
     * 
     * @return El promedio de notas.
     */
    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    /**
     * Obtiene el nombre y apellido del Alumno.
     * 
     * @return Nombre y apellido del Alumno.
     */
    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    /**
     * Obtiene el apellido y nombre del Alumno.
     * 
     * @return Apellido y nombre del Alumno.
     */
    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    /**
     * Muestra por pantalla la información del Alumno.
     */
    public void mostrar() {
        super.mostrar();
        System.out.println("LU: " + this.lu + "\tNotas: " + this.nota1 + "-" + this.nota2);
        System.out.println("Promedio: " + this.promedio() + "-" + this.leyendaAprueba());
    }
}