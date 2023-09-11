public class Mujer {
    private String nombre;      
    private String apellido;    
    private int edad;           
    private String estadoCivil; 
    private Hombre esposo;      // Objeto Hombre que representa al esposo

    // Constructor para inicializar los atributos de la mujer
    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }

    // Constructor para inicializar los atributos de la mujer y su esposo
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(p_esposo);
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

    private void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    private void setEstadoCivil(String p_estadoCivil) {
        this.estadoCivil = p_estadoCivil;
    }

    // Método para obtener el esposo de la mujer (getter)
    public Hombre getEsposo() {
        return this.esposo;
    }

    // Método para asignar el esposo de la mujer (setter)
    private void setEsposo(Hombre p_esposo) {
        this.esposo = p_esposo;
    }

    // Método para casarse con un hombre
    public void casarseCon(Hombre p_hombre){
        this.setEstadoCivil("Casada");
        this.setEsposo(p_hombre);
    }

    // Método para divorciarse
    public void divorcio(){
        this.setEstadoCivil("Divorciada");
        this.setEsposo(null);
    }

    // Método para obtener los datos de la mujer
    public String datos(){
        String datos = String.format("%s %s de %d anios",this.getNombre(),this.getApellido(),this.getEdad());
        return datos; 
    }

    // Método para mostrar el estado civil de la mujer
    public void mostrarEstadoCivil(){
        String datos = String.format("%s %s de %d anios - %s",this.getNombre(),this.getApellido(),this.getEdad(), this.getEstadoCivil());
        System.out.println(datos); 
    }

    // Método para mostrar que está casada con su esposo
    public void casadaCon(){
        System.out.println(this.esposo.datos() + " esta casado con " + this.datos());
    }
}
