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

    public boolean agregarFigura(FiguraGeometrica p_figura) {
        return this.getFiguras().add(p_figura);
    }

    public boolean quitarFigura(FiguraGeometrica p_figura) {
        return this.getFiguras().remove(p_figura);
    }

    private double cuantosLitros() {
        double totalLitros = 0.0;
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) this.getFiguras()) {
            totalLitros += figura.superficie();
        }
        return totalLitros / 20;
    }

    public int cuantasLatas() {
        return (int) Math.ceil(this.cuantosLitros());
    }

    public double cuantosMetros() {
        double totalMetros = 0.0;
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) this.getFiguras()) {
            totalMetros += figura.superficie();
        }
        return totalMetros;
    }

    public void detalleFiguras() {
        System.out.println("Presupuesto: " + this.getNombre());
        for (FiguraGeometrica figura : (ArrayList<FiguraGeometrica>) figuras) {
            figura.mostrarSuperficie();
        }
        System.out.println("--------------------------");
        System.out.printf("Total a cubrir: %.2f\nComprar %d latas", this.cuantosMetros(), this.cuantasLatas());
    }
}
