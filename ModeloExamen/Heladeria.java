import java.util.ArrayList;

public class Heladeria {
    public static void main(String[] args) {
        Congelado agua = new Paleta(10, "Paleta", 0);
        Congelado crema = new Paleta(10, "Paleta", 1);
        Congelado postre = new Postre(15, "Postre", false);
        Congelado postreEnCaja = new Postre(15, "Postre", true);


        ReglonPedido pedido1 = new ReglonPedido(postreEnCaja, 85);
        ReglonPedido pedido2 = new ReglonPedido(postre, 65);
        ReglonPedido pedido3 = new ReglonPedido(crema, 68);
        ReglonPedido pedido4 = new ReglonPedido(agua, 25);
    
        ArrayList<ReglonPedido> pedidos = new ArrayList<>();
        pedidos.add(0, pedido1);
        pedidos.add(1, pedido2);
        pedidos.add(2, pedido3);
        pedidos.add(3, pedido4);

        Pedido pedido = new Pedido(pedidos);
        pedido.agregarPedido(pedido1);
        pedido.mostrar();

    }
}
