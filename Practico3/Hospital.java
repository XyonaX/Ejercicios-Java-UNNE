public class Hospital {
    private String nombreHospital;
    private String nombreDirector;

    // Constructor para inicializar el nombre del hospital y el nombre del director
    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }

    public String getNombreHospital() {
        return this.nombreHospital;
    }

    private void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }

    public String getNombreDirector() {
        return this.nombreDirector;
    }

    private void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    // Método para consultar los datos filiatorios de un paciente en el hospital
    public void consultaDatosFiliatorios(Paciente p_paciente) {
        // Imprime el nombre del hospital y del director
        System.out.println("Hospital: " + this.getNombreHospital() + "\tDirector: " + this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------");

        // Llama al método mostrarDatosPantalla del paciente
        p_paciente.mostrarDatosPantalla();
    }
}
