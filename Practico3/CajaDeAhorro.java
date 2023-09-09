public class CajaDeAhorro {
    private int nroCuenta;
    private double saldo;
    private int extraccionesPosibles;
    private Persona titular;

    public CajaDeAhorro(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0);
        this.setExtraccionesPosibles(10);

    }
    public CajaDeAhorro(int p_nroCuenta, Persona p_titular,double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
        this.setExtraccionesPosibles(10);
    }

    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }

    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }

    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }

    public int getNroCuenta(){
        return this.nroCuenta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public Persona getTitular(){
        return this.titular;
    }

    private void setExtraccionesPosibles(int p_extracciones){
        this.extraccionesPosibles = p_extracciones;
    }

    public int getExtraccionesposibles(){
        return this.extraccionesPosibles;
    }

    private boolean puedeExtraer(double p_importe){
        if (p_importe <= this.getSaldo() && (this.getExtraccionesposibles() != 0) ) {
            return true;
        }
        return false;
    }

    private void extraccion(double p_importe){
        if(this.puedeExtraer(p_importe)){
            this.setExtraccionesPosibles(this.getExtraccionesposibles() - 1);
            this.setSaldo(this.getSaldo() - p_importe);
            System.out.println("Extraccione Exitosa!");
        }else{
            if(this.getExtraccionesposibles() == 0){
                System.out.println("No tiene habilitadas mas extracciones!");
            }else{
                System.out.println("No puede extraer mas que el saldo!");
            }
        }
    }

    public void extraer(double p_importe){
        this.extraccion(p_importe);
    }

    public void depositar(double p_importe){
        this.setSaldo(p_importe + this.getSaldo());
    }

    public void mostrar(){
        System.out.println("-Caja de Ahorro-");
        System.out.println("Nro. Cuenta: " +this.getNroCuenta()+"\tSaldo: "+this.getSaldo());
        System.out.println("Titular: " +this.getTitular().nomYApe()+"\nExtracciones posibles: "+this.getExtraccionesposibles());
    }
}
