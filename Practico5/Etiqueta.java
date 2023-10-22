public abstract class Etiqueta {
    private double costo;

    public Etiqueta(double p_costo) {
        this.setCosto(p_costo);
    }

    public double getCosto() {
        return this.costo;
    }

    private void setCosto(double p_costo) {
        this.costo = p_costo;
    }

    public abstract double precio(int q);

    public String toString() {
        if (this instanceof Premium) {
            return String.format("tipo %s - Costo: $%.2f - Colores: %d", this.tipo(), this.getCosto(),
                    ((Premium) this).getColores());
        } else if (this instanceof Comun) {
            return String.format("tipo %s - Costo: $%.2f - Diseño: %.2f", this.tipo(), this.getCosto(),
                    ((Comun) this).getPlus());
        }
        return "";
    }

    protected abstract String tipo();
}
