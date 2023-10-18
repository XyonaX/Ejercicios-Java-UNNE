public class SemiExclusivo extends Cargo {
    private int horasDeInvestigacion;

    public SemiExclusivo(String p_cargo, double p_sueldo, int p_anioIngreso, int p_horasDocencia,
            int p_horasInvestigacion) {
        super(p_cargo, p_sueldo, p_anioIngreso, p_horasDocencia);
        this.setHorasInvestigacion(p_horasInvestigacion);
    }

    private void setHorasInvestigacion(int p_horasInvestigacion) {
        this.horasDeInvestigacion = p_horasInvestigacion;
    }

    public int getHorasInvestigacion() {
        return this.horasDeInvestigacion;
    }

    public void mostrarCargo() {
        super.mostrarCargo();
        System.out.println("\n----Cargo de caracter SemiExclusivo----");
        System.out.printf("Horas investigacion: %d", this.getHorasInvestigacion());
    }
}