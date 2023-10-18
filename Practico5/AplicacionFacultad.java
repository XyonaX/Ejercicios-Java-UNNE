import java.util.ArrayList;

public class AplicacionFacultad {
    public static void main(String[] args) {
        ArrayList<Cargo> cargosJuan = new ArrayList<>();
        ArrayList<Cargo> cargosMirta = new ArrayList<>();
        cargosJuan.add(0, new Cargo("JTP-Programación OO", 800, 2013, 10));
        cargosJuan.add(1, new SemiExclusivo("Titular-TFA", 1400, 2011, 20, 0));
        cargosJuan.add(2, new Cargo("JTP-Analisis de Sistemas", 800, 2003, 10));

        cargosMirta.add(0, new Cargo("JTP-TP-II", 1200, 2012, 10));
        cargosMirta.add(1, new Exclusivo("JTP-Ing.Soft", 1800, 2013, 10, 20, 10));
        Profesor juan = new Profesor(28596132, "Juan", "Perez", 1986, "Lic. Sistemas de Informacion", cargosJuan);
        Profesor mirta = new Profesor(34519921, "Mirta", "Lopez", 1993, "Lic. Sistemas de Informacion", cargosMirta);

        Facultad unne = new Facultad("UNNE");

        unne.altaProfesor(juan);
        unne.altaProfesor(mirta);

        unne.listarProfesoresCargos();
        unne.nominaProfesores();

    }
}
