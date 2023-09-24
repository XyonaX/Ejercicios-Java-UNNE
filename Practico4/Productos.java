public class Productos {
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio; // Laboratorio del producto

    /**
     * inicializa el stock en 0 e inicializa los demás atributos por parametro
     * 
     * @param p_codigo      int
     * @param p_rubro       String
     * @param p_desc        String
     * @param p_costo       double
     * @param p_porcPtoRepo double
     * @param p_existMinima int
     * @param p_lab         Laboratorio
     */
    public Productos(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo,
            int p_existMinima, Laboratorio p_lab) {
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setStock(0);
        this.setLaboratorio(p_lab);
    }

    /**
     * Inicializa al stock, porcPtoRepo y ExistMinima en 0, y inicializa por
     * parametro a los demas atributos.
     * 
     * @param p_codigo int
     * @param p_rubro  String
     * @param p_desc   String
     * @param p_costo  double
     * @param p_lab    Laboratorio
     */
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

    // Accessors
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

    // Fin Accessors
    /**
     * Muestra por pantalla los datos de laboratorio, rubro y detalles del producto.
     * 
     */
    public void mostrar() {
        String lab = getLaboratorio().mostrar();
        System.out.print(lab + " \n Rubro: " + getRubro() + " \n Descripcion: " + getDescripcion()
                + " \n Precio Costo: $" + getCosto() + " \n Stock: " + getStock() + " \t Stock valorizado: $"
                + stockValorizado() + "\n");
    }

    /**
     * Multiplica el stock valorizado por el 12% de rentabilidad.
     * 
     * @return Devuelve el resultado de la multiplicación más el adicional.
     */
    public double stockValorizado() {
        double adicional = (this.getCosto() * this.getStock()) * 0.12;
        return (this.getCosto() * this.getStock()) + adicional;
    }

    /**
     * Modifica el stock agregando o quitando.
     * 
     * @param p_cantidad int;
     */
    public void ajuste(int p_cantidad) {
        this.setStock(getStock() + p_cantidad);
    }

    /**
     * Calcula el precio de lista.
     * 
     * @return el precio de lista.
     */
    public double precioLista() {
        return getCosto() * 0.12 + getCosto();
    }

    /**
     * Calcula el descuento del precio contado de un producto.
     * 
     * @return el precio al contado.
     */
    public double precioContado() {
        return precioLista() - precioLista() * 0.05;
    }

    /**
     * Concatena la descripción del producto, su precio de lista y su precio al
     * contado.
     * 
     */
    public String mostrarLinea() {
        return String.format("%s %.2f %.2f", getDescripcion(), precioLista(), precioContado());
    }

    /**
     * Ajusta el valor de ptoRepo.
     * 
     * @param p_porce double;
     */
    public void ajustarPtoRepo(double p_porce) {
        this.setPorcPtoRepo(p_porce);
    }

    /**
     * Ajusta la existMinima.
     * 
     * @param p_cantidad int;
     */
    public void ajustarExistMinima(int p_cantidad) {
        this.setExistMinima(p_cantidad);
    }
}
