import java.util.ArrayList;

/**
 * Clase que representa un pedido que contiene una lista de renglones, cada uno
 * con un item y una cantidad asociada.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Pedido {
    private ArrayList<Renglon> renglones; // Lista de renglones en el pedido

    /**
     * Constructor para inicializar un pedido con una lista de renglones.
     * 
     * @param p_renglones Lista de renglones en el pedido.
     */
    public Pedido(ArrayList<Renglon> p_renglones) {
        this.setRenglones(p_renglones);
    }

    // Accessors
    public ArrayList<Renglon> getRenglones() {
        return this.renglones;
    }

    private void setRenglones(ArrayList<Renglon> p_renglones) {
        this.renglones = p_renglones;
    }

    // Fin Accessors
    /**
     * Muestra la información detallada del pedido, incluyendo cantidad de items,
     * detalles de cada renglón, precio de cada item y el total del pedido.
     */
    public void mostrar() {
        double total = 0.0;
        int cantidadTotal = 0;
        System.out.println("Pedido: \n");
        System.out.println("Cantidad de items: " + this.getRenglones().size());

        for (Renglon renglon : this.getRenglones()) {
            System.out.printf("Item %d: ", this.getRenglones().indexOf(renglon) + 1);
            renglon.mostrar();
            System.out.println("\nPrecio: $" + renglon.getItem().precio(renglon.getCantidad()));
            total += renglon.getItem().precio(renglon.getCantidad());
            cantidadTotal += renglon.getCantidad();
        }

        System.out.printf("\n--Total pedido: %d Etiquetas por un importe total de: $%.2f\n", cantidadTotal, total);
    }
}