import java.util.ArrayList;

public class ArmadoPedido {
    public static void main(String[] args) {
        ArrayList<Renglon> etiquetas = new ArrayList<>();
        Renglon renglon1 = new Renglon(7, new Premium(200, 10));
        Renglon renglon2 = new Renglon(57, new Comun(100, 100));
        Renglon renglon3 = new Renglon(94, new Premium(200, 2));
        etiquetas.add(0, renglon1);
        etiquetas.add(1, renglon2);
        etiquetas.add(2, renglon3);
        Pedido pedidos = new Pedido(etiquetas);

        pedidos.mostrar();
    }
}