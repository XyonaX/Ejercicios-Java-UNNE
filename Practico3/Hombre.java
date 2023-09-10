
public class Hombre {
    private String nombre;
    private String apellido;
    private int edad;
    private String estadoCivil;
    private Mujer esposa;

    public Hombre(String p_nombre, String p_apellido, int p_edad) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
    }
    public Hombre(String p_nombre, String p_apellido, int p_edad, Mujer p_esposa) {
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setEdad(p_edad);
        this.setEstadoCivil("Soltero");
        this.setEsposa(p_esposa);
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
    public Mujer getEsposa() {
        return esposa;
    }
    private void setEsposa(Mujer p_esposa) {
        this.esposa = p_esposa;
    }

    public void casarseCon(Mujer p_mujer){
        this.setEstadoCivil("Casado");
        this.setEsposa(p_mujer);
    }

    public void divorcio(){
        this.setEstadoCivil("Divorciada");
        this.setEsposa(null);
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
        System.out.println(this.esposa.datos() + " esta casada con " + this.datos());
    }
}
