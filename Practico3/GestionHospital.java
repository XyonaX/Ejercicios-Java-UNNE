import java.util.Scanner;

public class GestionHospital {
    public static void main(String[] args) {
        Localidad actual = null; // Inicializamos actual como null
        Paciente paciente = null; // Inicializamos paciente como null
        Hospital hospital = null; // Inicializamos hospital como null
        
        Scanner scanner = new Scanner(System.in);
        
        int opcion;
        do {
            System.out.println("Menu:");
            System.out.println("1. Consultar datos filiatorios");
            System.out.println("2. Crear Localidad");
            System.out.println("3. Crear Paciente");
            System.out.println("4. Crear Hospital");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer
            
            switch(opcion) {
                case 1:
                    consultaDatosFiliatorios(paciente,hospital);
                    break;
                case 2:
                    actual = crearLocalidad(scanner);
                    break;
                case 3:
                    paciente = crearPaciente(scanner, actual);
                    break;
                case 4:
                    hospital = crearHospital(scanner);
                    break;
                case 5:
                    System.out.println("Hasta luego!");
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, intente de nuevo.");
            }
            
        } while(opcion != 5);
        
        scanner.close();
    }
    
    private static void consultaDatosFiliatorios(Paciente paciente, Hospital hospital){
        if (paciente != null && hospital != null) {
            hospital.consultaDatosFiliatorios(paciente);
        } else {
            System.out.println("Debe crear un paciente y un hospital primero.");
        }
    }

    // Método para crear una Localidad
    private static Localidad crearLocalidad(Scanner scanner) {
        System.out.print("Ingrese el nombre de la localidad: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nombre de la provincia: ");
        String provincia = scanner.nextLine();
        return new Localidad(nombre, provincia);
    }
    
    // Método para crear un Paciente
    private static Paciente crearPaciente(Scanner scanner, Localidad localidad) {
        System.out.print("Ingrese la historia clinica del paciente: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Ingrese el nombre del paciente: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la direccion del paciente: ");
        String direccion = scanner.nextLine();
        return new Paciente(id, nombre, direccion, localidad, localidad);
    }
    
    // Método para crear un Hospital
    private static Hospital crearHospital(Scanner scanner) {
        System.out.print("Ingrese el nombre del hospital: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el nombre del director: ");
        String director = scanner.nextLine();
        return new Hospital(nombre, director);
    }
}
