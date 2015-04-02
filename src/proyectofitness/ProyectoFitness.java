package proyectofitness;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoFitness {

    public static final Pacientes pacientes = new Pacientes();
    public static final Maquinas maquinas = new Maquinas();
    public static final TiposEjercicio tiposEjercicio = new TiposEjercicio();
    public static final TiposMedicion tiposMedicion = new TiposMedicion();

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String [] args){
		initShell();
	}

    private static int getInt() {
        return Integer.parseInt(scanner.nextLine());
    }

	public static void initShell(){
		String input = "";
		while(! input.equals("salir")){
            System.out.print(" > ");
            input = scanner.nextLine();
            try {
                processCommand(input);
            } catch (Exception ex) {
                Logger.getLogger(ProyectoFitness.class.getName()).log(Level.SEVERE, null, ex);
            }
		}
	}

	private static void processCommand(String input) throws Exception{
        if(input.equals(""))
            return;
        if(input.charAt(0) == '#') {
            System.out.println(input.substring(1));
            return;
        }
		String [] command = input.split(" ");
		switch(command[0].toLowerCase()) {
			case "agregar":
				agregar(command);
				break;
			case "mod":
				modificar(command);
				break;
			case "rm":
				borrar(command);
				break;
			case "ver":
				ver(command);
				break;
            case "salir":
                break;
			default:
				System.out.println("Unrecognized command.");
				break;
		}
	}

	private static void agregar(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "paciente":
				agregarPaciente(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "medida":
				agregarMedida(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "tipo-ejercicio":
				agregarTipoEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "dia":
				agregarDia(scanner.nextLine(),scanner.nextLine());
				break;
			case "ejercicio":
				agregarEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "maquina":
				agregarMaquina(scanner.nextLine(),scanner.nextLine());
				break;
			default:
				System.out.println("Opcion invalida para agregar...");
				break;
		}
	}

	private static void modificar(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "paciente":
				modificarPaciente(command);
				break;
			case "medida":
				modificarMedida(command);
				break;
			case "tipo-ejercicio":
				modificarTipoEjercicio(command);
				break;
			case "ejercicio":
				modificarEjercicio(command);
				break;
			case "maquina":
				modificarMaquina(command);
				break;
			default:
				System.out.println("Opcion invalida para modificar...");
				break;
		}
	}

	private static void borrar(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "paciente":
				borrarPaciente(command);
				break;
			case "medida":
				borrarMedida(command);
				break;
			case "tipo-ejercicio":
				borrarTipoEjercicio(command);
				break;
			case "programa":
				borrarPrograma(command);
				break;
			case "dia":
				borrarDia(command);
				break;
			case "ejercicio":
				borrarEjercicio(command);
				break;
			case "maquina":
				borrarMaquina(command);
				break;
			default:
				System.out.println("Opcion invalida para borrar...");
				break;
		}
	}

	private static void ver(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "paciente":
				verPaciente(command);
				break;
			case "medida":
				verMedida(command);
				break;
			case "tipo-ejercicio":
				verTipoEjercicio(command);
				break;
			case "programa":
				verPrograma(command);
				break;
			case "dia":
				verDia(command);
				break;
			case "maquina":
				verMaquina(command);
				break;
			default:
				System.out.println("Opcion invalida para ver...");
				break;
		}
	}

    private static void modificarMaquina(String[] command) throws Exception {
        Maquina.modificar(scanner.nextLine(), scanner.nextLine());
    }

    private static void modificarEjercicio(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().getDia(getInt()).modificarEjercicio(new Ejercicio(getInt(),scanner.nextLine(),getInt(),getInt(),getInt(),getInt(),getInt(),getInt()));
    }

    private static void modificarMedida(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).modificarMedicion(scanner.nextLine(), scanner.nextDouble());
        scanner.nextLine();
    }

    private static void modificarTipoEjercicio(String[] command) throws Exception {
        TipoEjercicio.modificar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void modificarPaciente(String[] command) throws Exception {
        Paciente.modificar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void borrarPaciente(String[] command) throws Exception {
        Paciente.borrar(scanner.nextLine());
    }

    private static void borrarMedida(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).borrarMedicion(scanner.nextLine());
    }

    private static void borrarTipoEjercicio(String[] command) throws Exception {
        TipoEjercicio.borrar(scanner.nextLine());
    }

    private static void borrarPrograma(String[] command) {
        Paciente.get(scanner.nextLine()).setProgramaEntrenamiento(null);
    }

    private static void borrarDia(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().borrarDia(getInt());
    }

    private static void borrarEjercicio(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().getDia(getInt()).borrarEjercicio(getInt());
    }

    private static void borrarMaquina(String[] command) throws Exception {
        Maquina.borrar(scanner.nextLine());
    }

    private static void verPaciente(String[] command) throws Exception{
        System.out.println(Paciente.ver(scanner.nextLine()));
    }

    private static void verMedida(String[] command) throws Exception {
        System.out.println("Hola");
        System.out.println(Paciente.get(scanner.nextLine()).verMedicion(scanner.nextLine()));
    }

    private static void verTipoEjercicio(String[] command) throws Exception {
        System.out.println(TipoEjercicio.ver(scanner.nextLine()));
    }

    private static void verPrograma(String[] command) throws Exception {
        System.out.println(Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().toString());
    }

    private static void verDia(String[] command) throws Exception {
        System.out.println(Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().getDia(getInt()));
    }

    private static void verMaquina(String[] command) throws Exception {
        System.out.println(Maquina.ver(scanner.nextLine())); 
    }

    private static void agregarPaciente(String cedula, String nombre, String sexo, String fechaNacimiento, String telefono, String correo) throws Exception {
        pacientes.put(new Cedula(cedula), new Paciente(nombre, sexo, LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-uuuu")), new Telefono(telefono), new Correo(correo)));
    }

    private static void agregarMedida(String cedula, String nombreMedida, String valor) throws Exception {
        pacientes.get(new Cedula(cedula)).getMediciones().put(nombreMedida, Double.parseDouble(valor));
    }

    private static void agregarTipoEjercicio(String nombre, String descripcion, String maquina) {
        tiposEjercicio.put(nombre, new TipoEjercicio(descripcion, maquina));
    }

    private static void agregarDia(String cedula, String numeroDia) throws Exception {
        pacientes.get(new Cedula(cedula)).getProgramaEntrenamiento().put(Integer.parseInt(numeroDia), new Dia());
    }

    private static void agregarEjercicio(String cedula, String numeroDia, String numeroEjercicio, String tipoEjercicio, String series, String repeticiones, String peso1, String peso2, String peso3, String tiempoDescanso) throws Exception {
        pacientes.get(new Cedula(cedula)).getProgramaEntrenamiento().get(Integer.parseInt(numeroDia)).put(Integer.parseInt(numeroEjercicio), new Ejercicio(tipoEjercicio, Integer.parseInt(series), Integer.parseInt(repeticiones), Integer.parseInt(peso1), Integer.parseInt(peso2), Integer.parseInt(peso3), Integer.parseInt(tiempoDescanso)));
    }

    private static void agregarMaquina(String nombre, String descripcion) {
        maquinas.put(nombre, descripcion);
    }
}