
public class Alumno extends Persona {
    private int lu;
    private double nota1;
    private double nota2;

    public Alumno(int p_lu, String p_nombre, String p_apellido, int p_dni, int p_anio) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setLu(p_lu);
        this.setNota1(0.0);
        this.setNota2(0.0);
    }

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
        super.mostrar();
        System.out.println("LU: " + this.lu + "\tNotas: " + this.nota1 + "-" + this.nota2);
        System.out.println("Promedio: " + this.promedio() + "-" + this.leyendaAprueba());
    }
}
