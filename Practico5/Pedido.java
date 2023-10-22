import java.util.ArrayList;

public class Pedido {
    private ArrayList<Renglon> renglones;

    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }

    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    public void mostrar() {
        double total = 0.0;
        int cantitadTotal = 0;
        System.out.println("Pedido: \n");
        System.out.println("Cantidad de items: " + this.getRenglones().size());

        for (Renglon renglon : (ArrayList<Renglon>) this.getRenglones()) {
            System.out.printf("Item %d: ", this.getRenglones().indexOf(renglon) + 1);
            renglon.mostrar();
            System.out.println("\nPrecio: $" + renglon.getItem().precio(renglon.getCantidad()));
            total += renglon.getItem().precio(renglon.getCantidad());
            cantitadTotal += renglon.getCantidad();
        }
        System.out.printf("\n--Total pedido: %d Etiquetas por un importe total de: $%.2f\n", cantitadTotal, total);
    }
}
