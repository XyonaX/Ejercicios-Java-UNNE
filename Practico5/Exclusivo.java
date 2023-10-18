public class Exclusivo extends Cargo {
    private int horasDeInvestigacion;
    private int horasDeExtension;

    public Exclusivo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia, int p_horasInvestigacion,
            int p_horasExtension) {
        super(p_cargo, p_sueldo, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasInvestigacion);
        this.setHorasExtension(p_horasExtension);
    }

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

    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("\n----Cargo de caracter Exclusivo----");
        System.out.printf("Horas investigacion: %d\nHoras Extension: %d", this.getHorasInvestigacion(),
                this.getHorasExtension());
    }

}