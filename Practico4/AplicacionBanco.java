import java.util.ArrayList;
import java.util.Calendar;

public class AplicacionBanco {
    public static void main(String[] args) {
        Calendar fechaHoy = Calendar.getInstance();
        fechaHoy.set(2010, 1, 12);
        Localidad localidadBanco = new Localidad("Corrientes", "Corrientes");
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado juan = new Empleado(20123310221L, "Perez", "Juan", 200000, fechaHoy);
        Empleado ezequiel = new Empleado(14166574281L, "Rodriguez", "Ezequiel", 352400, fechaHoy);
        Empleado nicolas = new Empleado(12023145221L, "Sanchez", "Nicolas", 550000, fechaHoy);

        Banco provincia = new Banco("Provincia", localidadBanco, 1, empleados);

        provincia.agregarEmpleado(juan);
        provincia.agregarEmpleado(ezequiel);
        provincia.agregarEmpleado(nicolas);
        provincia.mostrar();

        provincia.quitarEmpleado(nicolas);
        provincia.quitarEmpleado(juan);
        provincia.quitarEmpleado(ezequiel);
        provincia.mostrar();

    }
}
