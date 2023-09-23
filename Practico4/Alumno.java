
public class Alumno {
    private int lu;
    private String nombre;
    private String apellido;
    private double nota1;
    private double nota2;

    public Alumno(int p_lu, String p_nombre, String p_apellido) {
        this.setLu(p_lu);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

    public int getLu() {
        return this.lu;
    }

    public void setLu(int p_lu) {
        this.lu = p_lu;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public void setNota1(double p_nota) {
        this.nota1 = p_nota;
    }

    public void setNota2(double p_nota) {
        this.nota2 = p_nota;
    }

    public double getNota1() {
        return this.nota1;
    }

    public double getNota2() {
        return this.nota2;
    }

    private boolean aprueba() {
        if (this.promedio() >= 6) {
            return true;
        } else {
            return false;
        }
    }

    private String leyendaAprueba() {
        if (this.aprueba() == true) {
            return "APROBADO";
        } else {
            return "DESAPROBADO";
        }
    }

    public double promedio() {
        return (this.getNota1() + this.getNota2()) / 2;
    }

    public String nomYApe() {
        return this.getNombre() + " " + this.getApellido();
    }

    public String apeYNom() {
        return this.getApellido() + " " + this.getNombre();
    }

    public void mostrar() {
        System.out.println("Nombre y Apellido: " + this.nomYApe());
        System.out.println("LU: " + this.lu + "\tNotas: " + this.nota1 + "-" + this.nota2);
        System.out.println("Promedio: " + this.promedio() + "-" + this.leyendaAprueba());
    }
}
