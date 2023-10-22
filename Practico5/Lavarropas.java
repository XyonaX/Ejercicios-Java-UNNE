public class Lavarropas extends ArtefactoHogar {

    private int programas;
    private float kilos;
    private boolean automatico;

    public Lavarropas(String p_marca, float p_precio, int p_stock, int p_programas, float p_kilos,
            boolean p_automatico) {
        super(p_marca, p_precio, p_stock);
        this.setProgramas(p_programas);
        this.setKilos(p_kilos);
        this.setAutomatico(p_automatico);
    }

    public int getProgramas() {
        return this.programas;
    }

    private void setProgramas(int p_programas) {
        this.programas = p_programas;
    }

    public float getKilos() {
        return this.kilos;
    }

    private void setKilos(float p_kilos) {
        this.kilos = p_kilos;
    }

    public boolean getAutomatico() {
        return this.automatico;
    }

    private void setAutomatico(boolean p_automatico) {
        this.automatico = p_automatico;
    }

    public void imprimir() {
        System.out.println("\n**** Lavarropas ****");
        super.imprimir();
        System.out.printf("\nProgramas: %d\nKilos: %.2f\nAutomatico: %s\n", this.getProgramas(), this.getKilos(),
                this.getAutomatico() ? "Si" : "No");
    }

    public float creditoConAdicional(int p_cuotas, float p_interes) {
        float precioDescuento = 0.0f;
        if (!this.getAutomatico()) {
            float descontarACuota = this.cuotaCredito(p_cuotas, p_interes) * (2.0f / 100);
            precioDescuento = this.cuotaCredito(p_cuotas, p_interes) - descontarACuota;
        } else {
            precioDescuento = this.cuotaCredito(p_cuotas, p_interes);
        }
        return precioDescuento;
    }

}
