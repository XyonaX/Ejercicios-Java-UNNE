import java.util.*;

public class Pedido {
    private Calendar fecha;
    private Cliente cliente;
    private ArrayList<Productos> productos;

    public Pedido(Calendar p_fecha, Cliente p_cliente, Productos p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(new ArrayList<>());
        this.agregarProductos(p_productos);
    }

    public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList<Productos> p_productos) {
        this.setFecha(p_fecha);
        this.setCliente(p_cliente);
        this.setProductos(p_productos);
    }

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

    public boolean agregarProductos(Productos p_productos) {
        return this.getProductos().add(p_productos);
    }

    public boolean quitarProductos(Productos p_productos) {
        return this.getProductos().remove(p_productos);
    }

    public double totalAlContado() {
        double totalAlContado = 0.0;

        for (Productos producto : this.getProductos()) {
            totalAlContado += producto.precioContado();
        }

        return totalAlContado;
    }

    public double totalFinanciado() {
        double totalFinanciado = 0.0;
        for (int i = 0; i < this.getProductos().size(); i++) {
            Productos producto = this.getProductos().get(i);
            totalFinanciado += producto.precioLista();
        }
        return totalFinanciado;
    }

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