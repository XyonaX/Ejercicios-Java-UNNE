public class Hombre {
    private String nombre;  
    private String apellido;  
    private int edad;  
    private String estadoCivil;  
    private Mujer esposa;  // Esposa del hombre

    // Constructor para inicializar un hombre soltero
    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }

    // Constructor para inicializar un hombre casado con una mujer dada
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(p_esposa);
    }

    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    private void setApellido(String p_apellido) {
        this.apellido = p_apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    private void setEdad(int p_edad) {
        this.edad = p_edad;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    // Método para obtener la esposa del hombre (getter)
    public Mujer getEsposa() {
        return this.esposa;
    }

    // Método para asignar la esposa del hombre (setter)
    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    // Método para casar al hombre con una mujer dada
    public void casarseCon(Mujer p_mujer){
        this.setEstadoCivil("Casado");
        this.setEsposa(p_mujer);
    }

    // Método para divorciar al hombre
    public void divorcio(){
        this.setEstadoCivil("Divorciado");
        this.setEsposa(null);
    }

    // Método para obtener los datos del hombre (nombre, apellido y edad)
    public String datos(){
        String datos = String.format("%s %s de %d años",this.getNombre(),this.getApellido(),this.getEdad());
        return datos; 
    }

    // Método para mostrar el estado civil del hombre
    public void mostrarEstadoCivil(){
        String datos = String.format("%s %s de %d años - %s",this.getNombre(),this.getApellido(),this.getEdad(), this.getEstadoCivil());
        System.out.println(datos); 
    }

    // Método para mostrar que el hombre está casado con su esposa
    public void casadaCon(){
        System.out.println(this.esposa.datos() + " está casada con " + this.datos());
    }
}
