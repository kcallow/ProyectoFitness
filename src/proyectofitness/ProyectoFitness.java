package proyectofitness;

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
				agregarPaciente(command);
				break;
			case "medida":
				agregarMedida(command);
				break;
			case "tipo-ejercicio":
				agregarTipoEjercicio(command);
				break;
			case "programa":
				agregarPrograma(command);
				break;
			case "dia":
				agregarDia(command);
				break;
			case "ejercicio":
				agregarEjercicio(command);
				break;
			case "maquina":
				agregarMaquina(command);
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


    private static void agregarPaciente(String[] command) throws Exception {
        Paciente.agregar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void agregarMedida(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).agregarMedicion(scanner.nextLine(), Double.parseDouble(scanner.nextLine()));
    }

    private static void agregarTipoEjercicio(String[] command) throws Exception {
        TipoEjercicio.agregar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void agregarPrograma(String[] command) {
        Paciente.get(scanner.nextLine()).setProgramaEntrenamiento(new ProgramaEntrenamiento());
    }

    private static void agregarDia(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().agregarDia();
    }

    private static void agregarEjercicio(String[] command) throws Exception {
        Paciente.get(scanner.nextLine()).getProgramaEntrenamiento().getDia(getInt()).agregarEjercicio(new Ejercicio(getInt(),scanner.nextLine(),getInt(),getInt(),getInt(),getInt(),getInt(),getInt()));
    }

    private static void agregarMaquina(String[] command) throws Exception {
        Maquina.agregar(scanner.nextLine(), scanner.nextLine());
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
}