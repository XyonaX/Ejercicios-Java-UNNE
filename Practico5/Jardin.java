import java.util.ArrayList;

public class Jardin {
    private String nombre;
    private ArrayList<FiguraGeometrica> figuras;

    public Jardin(String p_nombre, ArrayList<FiguraGeometrica> p_figuras) {
        this.setNombre(p_nombre);
        this.setFiguras(p_figuras);
    }

    public Jardin(String p_nombre) {
        this.setNombre(p_nombre);
        this.setFiguras(new ArrayList<FiguraGeometrica>());
    }

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

}
