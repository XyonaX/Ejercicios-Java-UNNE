public class Comercio {
    public static void main(String[] args) {
        ArtefactoHogar cocina = new Cocina("Volcan", 600, 15, 4, 2000, "80*60*60");
        ArtefactoHogar heladera1 = new Heladera("Gafa", 2000, 8, 4, 2, true);
        ArtefactoHogar lavarropas1 = new Lavarropas("Drean", 1500, 10, 4, 6, false);

        int cuotas = 6;
        float interes = (float) 2.53;
        cocina.imprimir();
        System.out.printf("Cuotas: %d - Interes: %.2f%%", cuotas, interes);
        System.out.printf("\nValor Cuota: $%.2f\nValor Cuota Con Adicionales: $%.2f\n",
                cocina.cuotaCredito(cuotas, interes), cocina.creditoConAdicional(cuotas, interes));
        heladera1.imprimir();
        System.out.printf("Cuotas: %d - Interes: %.2f%%", cuotas, interes);
        System.out.printf("\nValor Cuota: $%.2f\nValor Cuota Con Adicionales: $%.2f\n",
                heladera1.cuotaCredito(cuotas, interes), heladera1.creditoConAdicional(cuotas, interes));
        lavarropas1.imprimir();
        System.out.printf("Cuotas: %d - Interes: %.2f%%", cuotas, interes);
        System.out.printf("\nValor Cuota: $%.2f\nValor Cuota Con Adicionales: $%.2f\n",
                lavarropas1.creditoConAdicional(cuotas, interes), lavarropas1.cuotaCredito(cuotas, interes));
    }
}
