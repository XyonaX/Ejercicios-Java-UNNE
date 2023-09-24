import java.util.*;

/**
 * Permite crear y manipular el objeto Pedido.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */

public class Pedido {
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList<Productos> productos;

    /**
     * Constructor que inicializa atributos por parametro.
     * 
     * @param p_fecha     Calendar;
     * @param p_cliente   Cliente;
     * @param p_productos Productos;
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, Productos p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<>());
        this.agregarProductos(p_productos);
    }

    /**
     * Constructor que inicializa atributos por parametro.
     * 
     * @param p_fecha     Calendar;
     * @param p_cliente   Cliente;
     * @param p_productos ArrayList<Productos>;
     */
    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Productos> p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }

    // Accessors
    private void setFecha(Calendar p_fecha) {
        this.fecha = p_fecha;
    }

    private void setCliente(Cliente p_cliente) {
        this.cliente = p_cliente;
    }

    private void setProductos(ArrayList<Productos> p_productos) {
        this.productos = p_productos;
    }

    public Calendar getFecha() {
        return this.fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ArrayList<Productos> getProductos() {
        return this.productos;
    }

    // Fin de Accessors

    /**
     * Agrega el producto recibido por parametro a la coleccion.
     * 
     * @param p_productos Productos;
     * @return true o false segun si el producto fue agregado a la coleccion o no.
     */
    public boolean agregarProductos(Productos p_productos) {
        return this.getProductos().add(p_productos);
    }

    /**
     * Quita el producto recibido por parametro de la coleccion.
     * 
     * @param p_productos Productos;
     * @return true o false segun si el producto fue removido de la coleccion o no.
     */
    public boolean quitarProductos(Productos p_productos) {
        if (this.getProductos().size() == 1) {
            System.out.println("\nNo se puede eliminar todos los productos!\n");
            return false;
        } else {
            return this.getProductos().remove(p_productos);
        }
    }

    /**
     * Calcula el totalAlContado de los productos.
     * 
     * @return el totalAlContado de los productos.
     */

    public double totalAlContado() {
        double totalAlContado = 0.0;

        for (Productos producto : this.getProductos()) {
            totalAlContado += producto.precioContado();
        }

        return totalAlContado;
    }

    /**
     * Calcula el totalFinanciado de los productos.
     * 
     * @return el totalFinanciado de los productos.
     */
    public double totalFinanciado() {
        double totalFinanciado = 0.0;
        for (int i = 0; i < this.getProductos().size(); i++) {
            Productos producto = this.getProductos().get(i);
            totalFinanciado += producto.precioLista();
        }
        return totalFinanciado;
    }

    /**
     * Muestra por pantalla los detalles del pedido.
     */
    public void mostrarPedido() {
        System.out.println(
                "****** Detalle del pedido ****** Fecha: " + this.getFecha().get(Calendar.DAY_OF_MONTH) + " de " +
                        this.obtenerNombreMes(this.getFecha().get(Calendar.MONTH)) + " de "
                        + this.getFecha().get(Calendar.YEAR) + ".");
        System.out.println("Producto\t\tPrecio Lista\t\tPrecio Contado");
        System.out.println("----------------------------------------------------------------------");
        for (Productos producto : productos) {
            System.out.printf("%-15s\t\t%.2f\t\t%.2f%n", producto.getDescripcion(), producto.precioLista(),
                    producto.precioContado());
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("*** Total ------\t%.2f\t%16.2f%n", this.totalAlContado(), this.totalFinanciado());

    }

    private String obtenerNombreMes(int mes) {
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
                "octubre", "noviembre", "diciembre" };
        return meses[mes];
    }
}