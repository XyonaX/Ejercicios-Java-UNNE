import java.util.*;

public class AdministracionGerencia {
  public static void main(String args[]) {
    Servicio s_1 = new Servicio("Internet", 200);
    Servicio s_2 = new Servicio("Lavanderia", 50);
    Servicio s_3 = new Servicio("Alquiler de auto", 400);
    ArrayList<Servicio> servicios_1 = new ArrayList<Servicio>();
    ArrayList<Servicio> servicios_2 = new ArrayList<Servicio>();

    Hotel hotel = new Hotel("Single", "Hotel Arroyo", 200, 7, servicios_1);
    Hotel hotel2 = new Hotel("Doble", "Hotel Cupiri", 200, 7, servicios_1);
    hotel.agregarServicio(s_1);
    hotel.agregarServicio(s_2);
    hotel2.agregarServicio(s_3);

    Cabania cabania = new Cabania(2, "Cabañas Arbolada", 150, 5, servicios_2);
    cabania.agregarServicio(s_2);
    cabania.agregarServicio(s_3);

    ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();

    Gerencia gerencia = new Gerencia("Los arroyos", alojamientos);
    gerencia.agregarAlojamiento(hotel);
    gerencia.agregarAlojamiento(hotel2);
    gerencia.agregarAlojamiento(cabania);

    gerencia.mostrarLiquidacion();
  }
}