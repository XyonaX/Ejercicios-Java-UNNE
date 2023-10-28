import java.util.ArrayList;

public class Pedido{
    private ArrayList<ReglonPedido> renglones ;

    public Pedido(ArrayList<ReglonPedido> p_renglones) {
        this.setRenglones(p_renglones);
    }

    public Pedido(ReglonPedido p_renglon){
        this.setRenglones(new ArrayList<>());
        this.agregarPedido(p_renglon);
    }


    public ArrayList<ReglonPedido> getRenglones() {
        return this.renglones;
    }

    private void setRenglones(ArrayList<ReglonPedido> p_renglones) {
        this.renglones = p_renglones;
    }

    public boolean agregarPedido(ReglonPedido p_reglonPedido){
        return this.getRenglones().add(p_reglonPedido);
    }

    public boolean quitarPedido(ReglonPedido p_reglonPedido){
        if(this.getRenglones().size() > 1){
            return this.getRenglones().remove(p_reglonPedido);
        }
        System.out.println("\nNo puedes eliminar todos los pedidos!");
        return false;
    }


    public void mostrar(){
        int count = 1;
        System.out.println("----------------------------------------- Detalle Pedido -----------------------------------------\r");
        for (ReglonPedido renglon : this.getRenglones()) {
            System.out.printf("\n%d.%s",count++,renglon.toString());
        }
        System.out.println("\n-----------------------------------------");
        System.out.printf("Sub-Total: %.2f",this.importe());
        System.out.println("\n-----------------------------------------");
        System.out.printf("Total: %.2f",this.importe());
    }

    public double importe(){
        double importe = 0.0;

        for (ReglonPedido renglon : this.getRenglones()) {
            importe += renglon.importe();
        }
        if(importe < 500){
            importe = (importe * 0.1) + importe;
        }
        return importe;
    }

}