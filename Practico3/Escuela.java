public class Escuela {
    private String nombre;
    private String domicilio;
    private String director;

    public Escuela(String p_nombre, String p_domicilio, String p_director){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setDirector(p_director);
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }

    private void setDirector(String p_director){
        this.director = p_director;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getDomicilio(){
        return this.domicilio;
    }

    public String getDirector(){
        return this.director;
    }

    public void imprimirRecibo(Docente p_docente){
        String titulo = String.format("Escuela: %s\tDomicilio: %s\tDirector: %s",this.getNombre(),this.getDomicilio(),this.getDirector());
        System.out.println(titulo);
        System.out.println("--------------------------------------------------------------------------------------------------------------");
        System.out.print("Docente: "+p_docente.getNombre()+"\nSueldo: \t\t$" +p_docente.calcularSueldo()+"\nSueldo Básico: \t\t$" +p_docente.getSueldoBasico()+"\nAsignación familiar: \t\t$" +p_docente.getAsigFamiliar());
    }
}
