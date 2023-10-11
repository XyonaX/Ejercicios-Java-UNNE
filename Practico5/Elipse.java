public class Elipse extends FiguraGeometrica {
    private double sEjeMayor;
    private double sEjeMenor;

    public Elipse(Punto p_centro, double p_ejeMayor, double p_ejeMenor) {
        super(p_centro);
        this.setsEjeMayor(p_ejeMayor);
        this.setsEjeMenor(p_ejeMenor);
    }

    public double getsEjeMayor() {
        return this.sEjeMayor;
    }

    private void setsEjeMayor(double sEjeMayor) {
        this.sEjeMayor = sEjeMayor;
    }

    public double getsEjeMenor() {
        return this.sEjeMenor;
    }

    private void setsEjeMenor(double sEjeMenor) {
        this.sEjeMenor = sEjeMenor;
    }

    public String nombreFigura() {
        String figura = "****** Elipse ******\n";
        return figura;
    }

    public double superficie() {
        return Math.PI * sEjeMayor * sEjeMenor;
    }

    public void caracteristicas() {
        System.out.println(this.nombreFigura());
        System.out.printf("Centro: %s - Semieje Mayor: %.2f - Semieje Menor: %.2f\nSuperficie: %.2f\n",
                this.getOrigen().coordenadas(), this.getsEjeMayor(), this.getsEjeMenor(), this.superficie());
    }

    public void desplazar(double p_dx, double p_dy) {
        this.getOrigen().desplazar(p_dx, p_dy);
    }

    public double distanciaA(Elipse otraElipse) {
        double diferenciaX = otraElipse.getOrigen().getX() - this.getOrigen().getX();
        double diferenciaY = otraElipse.getOrigen().getY() - this.getOrigen().getY();
        return Math.sqrt(Math.pow(diferenciaX, 2) + Math.pow(diferenciaY, 2));
    }

    public Elipse elMayor(Elipse otraElipse) {
        if (this.superficie() > otraElipse.superficie()) {
            return this;
        } else if (otraElipse.superficie() > this.superficie()) {
            return otraElipse;
        } else {
            return null; // Si tienen la misma superficie, retorna null
        }
    }

}
