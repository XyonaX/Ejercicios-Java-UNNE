public class CuentaBancaria {
    private int nroCuenta;  
    private double saldo;   
    private Persona titular;  // Titular de la cuenta

    // Constructor para inicializar la cuenta con número de cuenta y titular
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setSaldo(0.0);
        this.setTitular(p_titular);
    }

    // Constructor para inicializar la cuenta con número de cuenta, titular y saldo
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
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

    // Método para obtener el titular de la cuenta (getter)
    public Persona getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    // Método para realizar un depósito en la cuenta
    public double depositar(double p_importe){
        this.saldo = getSaldo() + p_importe;
        return getSaldo();
    }

    // Método para realizar una extracción de la cuenta
    public double extraer(double p_importe){
        this.saldo = getSaldo() - p_importe;
        return getSaldo();
    }

    // Método para mostrar información sobre la cuenta
    public void mostrar(){
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: "+this.getTitular().nomYApe()+" ("+this.getTitular().edad()+")");
        System.out.println("Saldo: "+this.getSaldo());
    }

    // Método toString para representar la cuenta como una cadena de texto
    public String toString(){
        return String.format("%d\t%s\t%.2f",this.getNroCuenta(),this.getTitular().nomYApe(),this.getSaldo());
    }
}
