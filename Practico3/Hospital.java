public class Hospital{
    private String nombreHospital;
    private String nombreDirector;



    public Hospital(String p_nombreHospital, String p_nombreDirector) {
        this.setNombreHospital(p_nombreHospital);
        this.setNombreDirector(p_nombreDirector);
    }


    public String getNombreHospital() {
        return nombreHospital;
    }
    private void setNombreHospital(String nombreHospital) {
        this.nombreHospital = nombreHospital;
    }
    public String getNombreDirector() {
        return nombreDirector;
    }
    private void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    public void consultaDatosFiliatorios(Paciente p_paciente){
        System.out.println("Hospital: "+this.getNombreHospital()+"\tDirector: "+this.getNombreDirector());
        System.out.println("----------------------------------------------------------------------");
        p_paciente.mostrarDatosPantalla();
    }


}