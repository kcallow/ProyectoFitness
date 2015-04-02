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
			case "medicion":
				agregarMedicion(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
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
				modificarPaciente(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
                break;
			case "medicion":
				modificarMedicion(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "tipo-ejercicio":
				modificarTipoEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "ejercicio":
				modificarEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "maquina":
				modificarMaquina(scanner.nextLine(),scanner.nextLine());
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
			case "medicion":
				borrarMedicion(command);
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
			case "medicion":
				verMedicion(command);
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

    private static void borrarPaciente(String[] command) throws Exception {
        Paciente.borrar(scanner.nextLine());
    }

    private static void borrarMedicion(String[] command) throws Exception {
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

    private static void verMedicion(String[] command) throws Exception {
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

    private static void agregarPaciente(String numeroCedula, String nombre, String sexo, String fechaNacimiento, String telefono, String correo) throws Exception {
        Cedula cedula = new Cedula(numeroCedula);
        if(pacientes.containsKey(cedula))
            throw new Exception("Ya existe un paciente con cedula indicada.");
        pacientes.put(cedula, new Paciente(nombre, sexo, LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-uuuu")), new Telefono(telefono), new Correo(correo)));
    }

    private static void agregarMedicion(String cedula, String nombreMedicion, String valor) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para agregar medicion.");
        paciente.getMediciones().put(nombreMedicion, Double.parseDouble(valor));
    }

    private static void agregarTipoEjercicio(String nombre, String descripcion, String maquina) throws Exception {
        if(tiposEjercicio.containsKey(nombre))
            throw new Exception("Ya existe un tipo de ejercicio con ese nombre.");
        tiposEjercicio.put(nombre, new TipoEjercicio(descripcion, maquina));
    }

    private static void agregarDia(String cedula, String numeroDia) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para agregar dia.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        Integer numero = Integer.parseInt(numeroDia);
        if(programa.containsKey(numero))
            throw new Exception("Ya existe un dia con ese numero.");
        programa.put(numero, new Dia());
    }

    private static void agregarEjercicio(String cedula, String numeroDia, String numeroEjercicio, String tipoEjercicio, String series, String repeticiones, String peso1, String peso2, String peso3, String tiempoDescanso) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para agregar ejercicio.");
        Dia dia = paciente.getProgramaEntrenamiento().get(Integer.parseInt(numeroDia));
        if(dia == null)
            throw new Exception("Dia invalido para agregar ejercicio.");
        Integer numero = Integer.parseInt(numeroEjercicio);
        if(dia.containsKey(numero))
            throw new Exception("El numero para el ejercicio ya corresponde a otro.");
        dia.put(numero, new Ejercicio(tipoEjercicio, Integer.parseInt(series), Integer.parseInt(repeticiones), Integer.parseInt(peso1), Integer.parseInt(peso2), Integer.parseInt(peso3), Integer.parseInt(tiempoDescanso)));
    }

    private static void agregarMaquina(String nombre, String descripcion) throws Exception {
        if(maquinas.containsKey(nombre))
            throw new Exception("Nombre invalido para agregar maquina.");
        maquinas.put(nombre, descripcion);
    }

    private static void modificarPaciente(String cedula, String nombre, String sexo, String fechaNacimiento, String telefono, String correo) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para modificar.");
        paciente.setNombre(nombre);
        paciente.setSexo(sexo);
        paciente.setFechaDeNacimiento(LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        paciente.setTelefono(telefono);
        paciente.setCorreo(correo);
    }

    private static void modificarMedicion(String cedula, String nombreMedicion, String valor) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para modificar medicion.");
        if(!paciente.getMediciones().containsKey(nombreMedicion))
            throw new Exception("El nombre de medicion dado no corresponde a ninguna medicion del paciente.");
        paciente.getMediciones().put(nombreMedicion, Double.parseDouble(valor));
    }

    private static void modificarTipoEjercicio(String nombre, String descripcion, String maquina) throws Exception {
        TipoEjercicio tipoEjercicio = tiposEjercicio.get(nombre);
        if(tipoEjercicio == null)
            throw new Exception("Tipo de ejercicio invalido para modificar.");
        tipoEjercicio.setDescripcion(descripcion);
        tipoEjercicio.setTipoMaquina(maquina);
    }

    private static void modificarEjercicio(String cedula, String numeroDia, String numeroEjercicio, String tipoEjercicio, String series, String repeticiones, String peso1, String peso2, String peso3, String tiempoDescanso) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para modificar ejercicio.");
        Dia dia = paciente.getProgramaEntrenamiento().get(Integer.parseInt(numeroDia));
        if(dia == null)
            throw new Exception("Dia invalido para modificar ejercicio.");
        Integer numero = Integer.parseInt(numeroEjercicio);
        if(!dia.containsKey(numero))
            throw new Exception("El numero de ejercicio no corresponde a ninguno.");
        Ejercicio ejercicio = dia.get(numero);
        ejercicio.setTipo(tipoEjercicio);
        ejercicio.setSeries(Integer.parseInt(series));
        ejercicio.setRepeticiones(Integer.parseInt(repeticiones)); 
        ejercicio.setPeso1(Integer.parseInt(peso1)); 
        ejercicio.setPeso2(Integer.parseInt(peso2)); 
        ejercicio.setPeso3(Integer.parseInt(peso3)); 
        ejercicio.setTiempoDescanso(Integer.parseInt(tiempoDescanso));
    }

    private static void modificarMaquina(String nombre, String descripcion) throws Exception {
        if(!maquinas.containsKey(nombre))
            throw new Exception("Nombre invalido para modificar maquina.");
        maquinas.put(nombre, descripcion);
    }
}