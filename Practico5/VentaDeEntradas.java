
import java.util.*;

public class VentaDeEntradas {
  public static void main(String args[]) {
    ArrayList<Visitante> visitantes = new ArrayList<>();
    Zoologico zoologico1 = new Zoologico("El Caribú", visitantes);

    Persona persona1 = new Persona(298374831, "Maria", "Loseau", 1990);
    Persona persona2 = new Persona(298374832, "Carlos", "Lopez", 1987);
    Persona persona3 = new Persona(298374833, "Michael", "Michael", 2000);

    Calendar fecha = new GregorianCalendar(2016, 9, 22);
    Calendar fecha1 = new GregorianCalendar(2016, 9, 1);
    Calendar fecha2 = new GregorianCalendar(2016, 9, 30);

    Individuo individuo1 = new Individuo("a", fecha, persona1);
    Individuo individuo2 = new Individuo("b", fecha, persona2);
    Individuo individuo3 = new Individuo("c", fecha, persona3);

    ArrayList<Individuo> integrantes = new ArrayList<>();

    Delegacion delegacion1 = new Delegacion("PAMI", fecha, integrantes);

    delegacion1.agregaIntegrante(individuo2);
    delegacion1.agregaIntegrante(individuo3);

    zoologico1.nuevoVisitante(individuo1);
    zoologico1.nuevoVisitante(delegacion1);

    zoologico1.listaVisitantePorFecha(fecha);
    System.out.println("\n\n\n");
    zoologico1.listaTipoVisitantePorFecha(fecha, "Delegacion");
    System.out.println("Total recaudacion: " + zoologico1.recaudacion(fecha1, fecha2));
  }
}