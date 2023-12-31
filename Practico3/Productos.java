public class Productos {
    private int codigo;           
    private String rubro;         
    private String descripcion;   
    private double costo;         
    private int stock;            
    private double porcPtoRepo;   
    private int existMinima;      
    private Laboratorio laboratorio; // Laboratorio del producto

    // Constructor para inicializar los atributos del producto con punto de reposición
    public Productos(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setStock(0);
        this.setLaboratorio(p_lab);
    }

    // Constructor para inicializar los atributos del producto sin punto de reposición
    public Productos(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(0);
        this.setExistMinima(0);
        this.setStock(0);
        this.setLaboratorio(p_lab);
    }

    // Metodos setter para asignar valores a los atributos
    private void setCodigo(int p_codigo) {
        this.codigo = p_codigo;
    }

    private void setRubro(String p_rubro) {
        this.rubro = p_rubro;
    }

    private void setDescripcion(String p_desc) {
        this.descripcion = p_desc;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    private void setPorcPtoRepo(double p_porcPtoRepo) {
        this.porcPtoRepo = p_porcPtoRepo;
    }

    private void setExistMinima(int p_existMinima) {
        this.existMinima = p_existMinima;
    }

    private void setStock(int p_stock) {
        this.stock = p_stock;
    }

    private void setLaboratorio(Laboratorio p_lab) {
        this.laboratorio = p_lab;
    }

    // Metodos getter para obtener valores de los atributos
    public int getCodigo() {
        return this.codigo;
    }

    public String getRubro() {
        return this.rubro;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getCosto() {
        return this.costo;
    }

    public double getPorcPtoRepo() {
        return this.porcPtoRepo;
    }

    public int getExistMinima() {
        return this.existMinima;
    }

    public int getStock() {
        return this.stock;
    }

    public Laboratorio getLaboratorio() {
        return this.laboratorio;
    }

    // Método para mostrar los detalles del producto en la consola
    public void mostrar() {
        String lab = getLaboratorio().mostrar();
        System.out.print(lab + " \n Rubro: " + getRubro() + " \n Descripcion: " + getDescripcion() 
        + " \n Precio Costo: $" + getCosto() + " \n Stock: " + getStock() + " \t Stock valorizado: $" + stockValorizado() +"\n");
    }

    // Método para calcular el valor del stock del producto
    public double stockValorizado() {
        double adicional = (this.getCosto() * this.getStock()) * 0.12;
        return (this.getCosto() * this.getStock()) + adicional;
    }

    // Método para ajustar el stock del producto
    public void ajuste(int p_cantidad) {
        this.setStock(getStock() + p_cantidad);
    }

    // Método para calcular el precio de lista del producto
    public double precioLista() {
        return getCosto() * 0.12 + getCosto();
    }

    // Método para calcular el precio de contado del producto
    public double precioContado() {
        return precioLista() - precioLista() * 0.05;
    }

    // Método para obtener una representación en forma de cadena de caracteres del producto
    public String mostrarLinea() {
        return String.format("%s %.2f %.2f" ,getDescripcion() , precioLista(), precioContado());
    }

    // Método para ajustar el punto de reposición del producto
    public void ajustarPtoRepo(double p_porce) {
        this.setPorcPtoRepo(p_porce);
    }

    // Método para ajustar la existencia mínima requerida del producto
    public void ajustarExistMinima(int p_cantidad) {
        this.setExistMinima(p_cantidad);
    }
}
