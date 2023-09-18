import java.util.ArrayList;
import java.util.Calendar;

public class TomaPedido {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(41442040, "Vargas", "Jonatan", 0);
        ArrayList<Productos> productos = new ArrayList<>();
        productos.add(new Productos(1, "Tecnologia", "Pendrive", 9554.16, null));
        productos.add(new Productos(1, "Libros", "Libro-POO", 9196.00, null));
        productos.add(new Productos(1, "Revistas", "Revista-user", 5130.4, null));

        Calendar fechaPedido = Calendar.getInstance();
        fechaPedido.set(2023, 7, 14);

        Pedido pedido = new Pedido(fechaPedido, cliente, productos);

        pedido.mostrarPedido();
    }
}
