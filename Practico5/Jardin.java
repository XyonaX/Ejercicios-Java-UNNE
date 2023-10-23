import java.util.ArrayList;

/**
 * Clase que representa un jardín y contiene una lista de figuras geométricas
 * que serán utilizadas para calcular la cantidad de pintura necesaria para
 * cubrir el jardín.
 * 
 * @author X, Ingrid Noelí.
 * @author Vargas Portillo, Jonatan Ezequiel.
 */
public class Jardin {
    private String nombre; // Nombre del jardín
    private ArrayList<FiguraGeometrica> figuras; // Lista de figuras geométricas

    /**
     * Constructor para inicializar un jardín con un nombre y una lista de figuras.
     * 
     * @param p_nombre  Nombre del jardín.
     * @param p_figuras Lista de figuras geométricas del jardín.
     */
    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras) {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    /**
     * Constructor para inicializar un jardín con un nombre y una lista de figuras
     * vacía.
     * 
     * @param p_nombre Nombre del jardín.
     */
    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }

    // Accessors
    public String getNombre() {
        return this.nombre;
    }

    private void setNombre(String p_nombre) {
        this.nombre = p_nombre;
    }

    public ArrayList<FiguraGeometrica> getFiguras() {
        return this.figuras;
    }

    private void setFiguras(ArrayList<FiguraGeometrica> p_figuras) {
        this.figuras = p_figuras;
    }
    // Fin Accessors

    /**
     * Agrega una figura geométrica a la lista de figuras del jardín.
     * 
     * @param p_figura Figura geométrica a agregar.
     * @return `true` si la figura se agregó correctamente, `false` en caso
     *         contrario.
     */
    public boolean agregarFigura(FiguraGeometrica p_figura) {
        return this.getFiguras().add(p_figura);
    }

    /**
     * Quita una figura geométrica de la lista de figuras del jardín.
     * 
     * @param p_figura Figura geométrica a quitar.
     * @return `true` si la figura se quitó correctamente, `false` en caso
     *         contrario.
     */
    public boolean quitarFigura(FiguraGeometrica p_figura) {
        return this.getFiguras().remove(p_figura);
    }

    /**
     * Calcula cuántos litros de pintura se necesitan para cubrir las figuras
     * geométricas del jardín.
     * 
     * @return Cantidad de litros de pintura necesarios.
     */
    private double cuantosLitros() {
        double totalLitros = 0.0;
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) this.getFiguras()) {
            totalLitros += figura.superficie();
        }
        return totalLitros / 20; // Se asume que 1 litro de pintura cubre 20 metros cuadrados
    }

    /**
     * Calcula cuántas latas de pintura se necesitan para cubrir las figuras
     * geométricas del jardín.
     * 
     * @return Cantidad de latas de pintura necesarias (redondeada hacia arriba).
     */
    public int cuantasLatas() {
        return (int) Math.ceil(this.cuantosLitros());
    }

    /**
     * Calcula cuántos metros cuadrados tiene en total el jardín sumando las
     * superficies de todas las figuras geométricas.
     * 
     * @return Total de metros cuadrados del jardín.
     */
    public double cuantosMetros() {
        double totalMetros = 0.0;
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) this.getFiguras()) {
            totalMetros += figura.superficie();
        }
        return totalMetros;
    }

    /**
     * Muestra un detalle de las figuras geométricas en el jardín, incluyendo la
     * superficie de cada una y el total a cubrir en metros cuadrados, así como la
     * cantidad de latas de pintura necesarias.
     */
    public void detalleFiguras() {
        System.out.println("\n\nPresupuesto: " + this.getNombre());
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) figuras) {
            figura.mostrarSuperficie();
        }
        System.out.println("--------------------------");
        System.out.printf("Total a cubrir: %.2f\nComprar %d latas", this.cuantosMetros(), this.cuantasLatas());
    }
}