public class RegistroCivil {
    public static void main(String[] args) {
        Hombre hombre = new Hombre("Pedro", "Leyes", 29, null);
        Mujer mujer = new Mujer("Maria","Gomez",28, null);

        casarseCon(hombre, mujer);
    }

    private static void casarseCon(Hombre hombre, Mujer mujer){
        if(hombre.getEsposa() == null && mujer.getEsposo() == null){
            hombre.casarseCon(mujer);
            hombre.casadaCon();
        }else{
            System.out.println("Ya se encuentran csados");
        }
    }
}
