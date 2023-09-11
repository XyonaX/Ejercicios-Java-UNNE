public class Paciente {
    private int historiaClinica;
    private String nombre;
    private String domicilio;
    private Localidad localidadNacido;
    private Localidad localidadVive;
    
    public Paciente(int p_historia, String p_nombre, String p_domicilio, Localidad p_localidadNacido,Localidad p_localidadVive) {
        this.setHistoriaClinica(p_historia);
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setLocalidadNacido(p_localidadNacido);
        this.setLocalidadVive(p_localidadVive);
    }

    public int getHistoriaClinica() {
        return this.historiaClinica;
    }


    private void setHistoriaClinica(int p_historiaClinica) {
        this.historiaClinica = p_historiaClinica;
    }


    public String getNombre() {
        return this.nombre;
    }


    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }


    public String getDomicilio() {
        return this.domicilio;
    }


    private void setDomicilio(String p_domicilio) {
        this.domicilio = p_domicilio;
    }


    public Localidad getLocalidadNacido() {
        return this.localidadNacido;
    }


    private void setLocalidadNacido(Localidad p_localidadNacido) {
        this.localidadNacido = p_localidadNacido;
    }


    public Localidad getLocalidadVive() {
        return this.localidadVive;
    }


    private void setLocalidadVive(Localidad p_localidadVive) {
        this.localidadVive = p_localidadVive;
    }


    public void mostrarDatosPantalla(){
        System.out.println("Paciente: "+this.getNombre()+"\tHistoria CLinica: "+this.getHistoriaClinica()+"\tDomicilio: "+this.getDomicilio());
        System.out.println(this.getLocalidadVive().mostrar());
    }

    public String cadenaDeDatos(){
        String cadena = String.format("%s....%d....%s - %s - %s",this.getNombre(),this.getHistoriaClinica(),this.getDomicilio(),this.getLocalidadVive().getNombre(),this.getLocalidadVive().getProvincia());
        return cadena;
    }


}
