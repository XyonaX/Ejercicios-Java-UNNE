public class Docente {
    private String nombre;  
    private String grado;   
    private double sueldoBasico;  
    private double asignacionFamiliar;  

    // Constructor para inicializar un docente con sus datos
    public Docente(String p_nombre, String p_grado, double p_sueldoBasico, double p_asigFamiliar){
        this.setNombre(p_nombre);
        this.setGrado(p_grado);
        this.setSueldoBasico(p_sueldoBasico);
        this.setAsigFamiliar(p_asigFamiliar);
    }

    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }

    private void setGrado(String p_grado){
        this.grado = p_grado;
    }

    private void setSueldoBasico(double p_sueldoBasico){
        this.sueldoBasico = p_sueldoBasico;
    }

    private void setAsigFamiliar(double p_asigFamiliar){
        this.asignacionFamiliar = p_asigFamiliar;
    }

    public String getNombre(){
        return this.nombre;
    }

    public String getGrado(){
        return this.grado;
    }

    public double getSueldoBasico(){
        return this.sueldoBasico;
    }

    public double getAsigFamiliar(){
        return this.asignacionFamiliar;
    }

    // Método para calcular el sueldo total del docente
    public double calcularSueldo(){
        return this.getAsigFamiliar() + this.getSueldoBasico();
    }
}
