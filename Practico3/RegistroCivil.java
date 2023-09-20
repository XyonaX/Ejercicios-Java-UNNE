public class RegistroCivil {
    public static void main(String[] args) {
        Hombre hombre = new Hombre("Pedro", "Leyes", 29, null);
        Mujer mujer = new Mujer("Maria", "Gomez", 28, null);

        hombre.casarseCon(mujer);
        hombre.mostrarEstadoCivil();
    }

}
