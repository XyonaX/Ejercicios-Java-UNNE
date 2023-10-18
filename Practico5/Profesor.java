import java.util.ArrayList;

public class Profesor extends Persona {
    private String titulo;
    private ArrayList<Cargo> cargos;

    public Profesor(int p_dni, String p_nombre, String p_apellido, int p_anio, String p_titulo,
            ArrayList<Cargo> p_cargos) {
        super(p_dni, p_nombre, p_apellido, p_anio);
        this.setTitulo(p_titulo);
        this.setCargos(p_cargos);
    }

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

    public boolean agregarCargo(Cargo p_cargo) {
        if (this.getCargos().size() < 3) {
            return this.getCargos().add(p_cargo);
        } else {
            System.out.println("Solo puede tener 3 cargos");
            return false;
        }
    }

    public boolean quitarCargo(Cargo p_cargo) {
        if (this.getCargos().size() > 1) {
            return this.getCargos().remove(p_cargo);
        } else {
            System.out.println("No se pueden eliminar todos los cargos");
            return false;
        }
    }

    public void mostrar() {
        super.mostrar();
        System.out.printf("\nTitulo:%s", this.getTitulo());
        this.listarCargos();
        System.out.printf("\n** Sueldo Total: %.2f  **", sueldoTotal());
    }

    public void listarCargos() {
        System.out.println("\n\n-***** Cargos Asignados *****-\n" + "---------------------------------------\n");
        for (Cargo cargo : (ArrayList<Cargo>) this.getCargos()) {
            cargo.mostrarCargo();
            System.out.println("");
        }
    }

    public double sueldoTotal() {
        double sueldoTotal = 0.0;
        for (Cargo cargo : (ArrayList<Cargo>) this.getCargos()) {
            sueldoTotal += cargo.sueldoDelCargo();
        }
        return sueldoTotal;
    }

    public String mostrarLinea() {
        return String.format("DNI: %d - Nombre: %s - Sueldo Total: %.2f", this.getDNI(), this.nomYApe(),
                this.sueldoTotal());
    }

}
