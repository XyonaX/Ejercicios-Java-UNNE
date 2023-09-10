public class Mujer {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Hombre esposo;

    public Mujer(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
    }
    public Mujer(String p_nombre, String p_apellido, int p_edad, Hombre p_esposo) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltera");
        this.setEsposo(p_esposo);
    }

    public String getNombre() {
        return nombre;
    }
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    private void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    private void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    private void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Hombre getEsposo() {
        return esposo;
    }
    private void setEsposo(Hombre esposo) {
        this.esposo = esposo;
    }

    public void casarseCon(Hombre p_hombre){
        this.setEstadoCivil("Casada");
        this.setEsposo(p_hombre);
    }

    public void divorcio(){
        this.setEstadoCivil("Divorciada");
        this.setEsposo(null);
    }

    public String datos(){
        String datos = String.format("%s %s de %d anios",this.getNombre(),this.getApellido(),this.getEdad());
        return datos; 
    }

    public void mostrarEstadoCivil(){
        String datos = String.format("%s %s de %d anios - %s",this.getNombre(),this.getApellido(),this.getEdad(), this.getEstadoCivil());
        System.out.println(datos); 
    }

    public void casadaCon(){
        System.out.println(this.esposo.datos() + " esta casado con " + this.datos());
    }
}
