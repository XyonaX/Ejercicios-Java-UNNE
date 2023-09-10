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
        return historiaClinica;
    }


    private void setHistoriaClinica(int historiaClinica) {
        this.historiaClinica = historiaClinica;
    }


    public String getNombre() {
        return nombre;
    }


    private void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDomicilio() {
        return domicilio;
    }


    private void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public Localidad getLocalidadNacido() {
        return localidadNacido;
    }


    private void setLocalidadNacido(Localidad localidadNacido) {
        this.localidadNacido = localidadNacido;
    }


    public Localidad getLocalidadVive() {
        return localidadVive;
    }


    private void setLocalidadVive(Localidad localidadVive) {
        this.localidadVive = localidadVive;
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
