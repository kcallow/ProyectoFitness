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
				System.out.println("Comando no reconocido.");
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
				borrarPaciente(scanner.nextLine());
				break;
			case "medicion":
				borrarMedicion(scanner.nextLine(),scanner.nextLine());
				break;
			case "tipo-ejercicio":
				borrarTipoEjercicio(scanner.nextLine());
				break;
			case "programa":
				borrarPrograma(scanner.nextLine());
				break;
			case "dia":
				borrarDia(scanner.nextLine(),scanner.nextLine());
				break;
			case "ejercicio":
				borrarEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine());
				break;
			case "maquina":
				borrarMaquina(scanner.nextLine());
				break;
			default:
				System.out.println("Opcion invalida para borrar...");
				break;
		}
	}

	private static void ver(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "paciente":
                System.out.println(getPaciente(scanner.nextLine()));
				break;
			case "medicion":
                System.out.println(getMedicion(scanner.nextLine(),scanner.nextLine()));
				break;
			case "mediciones":
                System.out.println(getMediciones(scanner.nextLine()));
				break;
			case "tipo-ejercicio":
				System.out.println(getTipoEjercicio(scanner.nextLine()));
				break;
			case "programa":
				System.out.println(getPrograma(scanner.nextLine()));
				break;
			case "dia":
				System.out.println(getDia(scanner.nextLine(),scanner.nextLine()));
				break;
			case "ejercicio":
				System.out.println(getEjercicio(scanner.nextLine(),scanner.nextLine(),scanner.nextLine()));
				break;
			case "maquinas":
				System.out.println(maquinas);
				break;
			case "maquina":
				System.out.println(getMaquina(scanner.nextLine()));
				break;
			default:
				System.out.println("Opcion invalida para ver...");
				break;
		}
	}

    public static void agregarPaciente(String numeroCedula, String nombre, String sexo, String fechaNacimiento, String telefono, String correo) throws Exception {
        Cedula cedula = new Cedula(numeroCedula);
        if(pacientes.containsKey(cedula))
            throw new Exception("Ya existe un paciente con cedula indicada.");
        LocalDate fecha;
        try{
            fecha = LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-uuuu"));
        }
        catch (Exception e) {
            throw new Exception("Fecha invalida.  El formato correcto es dd-MM-aaaa");
        }
        pacientes.put(cedula, new Paciente(nombre, sexo, fecha, new Telefono(telefono), new Correo(correo)));
    }

    public static void agregarMedicion(String cedula, String nombreMedicion, String valor) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para agregar medicion.");
        paciente.getMediciones().put(nombreMedicion, Double.parseDouble(valor));
    }

    public static void agregarTipoEjercicio(String nombre, String descripcion, String maquina) throws Exception {
        if(tiposEjercicio.containsKey(nombre))
            throw new Exception("Ya existe un tipo de ejercicio con ese nombre.");
        tiposEjercicio.put(nombre, new TipoEjercicio(descripcion, maquina));
    }

    public static void agregarDia(String cedula, String numeroDia) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para agregar dia.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        Integer numero = Integer.parseInt(numeroDia);
        if(programa.containsKey(numero))
            throw new Exception("Ya existe un dia con ese numero.");
        programa.put(numero, new Dia());
    }

    public static void agregarEjercicio(String cedula, String numeroDia, String numeroEjercicio, String tipoEjercicio, String series, String repeticiones, String peso1, String peso2, String peso3, String tiempoDescanso) throws Exception {
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

    public static void agregarMaquina(String nombre, String descripcion) throws Exception {
        if(maquinas.containsKey(nombre))
            throw new Exception("Nombre invalido para agregar maquina.");
        maquinas.put(nombre, descripcion);
    }

    public static void modificarPaciente(String cedula, String nombre, String sexo, String fechaNacimiento, String telefono, String correo) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para modificar.");
        paciente.setNombre(nombre);
        paciente.setSexo(sexo);
        paciente.setFechaDeNacimiento(LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("dd-MM-uuuu")));
        paciente.setTelefono(telefono);
        paciente.setCorreo(correo);
    }

    public static void modificarMedicion(String cedula, String nombreMedicion, String valor) throws Exception {
        if(!tiposMedicion.containsKey(nombreMedicion))
            throw new Exception("Nombre de medicion no esta disponible.");
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para modificar medicion.");
        if(!paciente.getMediciones().containsKey(nombreMedicion))
            throw new Exception("El nombre de medicion dado no corresponde a ninguna medicion del paciente.");
        paciente.getMediciones().put(nombreMedicion, Double.parseDouble(valor));
    }

    public static void modificarTipoEjercicio(String nombre, String descripcion, String maquina) throws Exception {
        TipoEjercicio tipoEjercicio = tiposEjercicio.get(nombre);
        if(tipoEjercicio == null)
            throw new Exception("Tipo de ejercicio invalido para modificar.");
        tipoEjercicio.setDescripcion(descripcion);
        tipoEjercicio.setTipoMaquina(maquina);
    }

    public static void modificarEjercicio(String cedula, String numeroDia, String numeroEjercicio, String tipoEjercicio, String series, String repeticiones, String peso1, String peso2, String peso3, String tiempoDescanso) throws Exception {
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

    public static void modificarMaquina(String nombre, String descripcion) throws Exception {
        if(!maquinas.containsKey(nombre))
            throw new Exception("Nombre invalido para modificar maquina.");
        maquinas.put(nombre, descripcion);
    }

    public static void borrarPaciente(String cedula) throws Exception {
        if(!pacientes.containsKey(cedula))
            throw new Exception("Cedula no corresponde a ningun paciente.  No se puede borrar.");
        pacientes.remove(cedula);
    }

    public static void borrarMedicion(String cedula, String nombreMedicion) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para borrar medicion.");
        if(!paciente.getMediciones().containsKey(nombreMedicion))
            throw new Exception("Nombre no corresponde a ninguna medicion.  No se puede borrar.");
        paciente.getMediciones().remove(nombreMedicion);
    }

    public static void borrarTipoEjercicio(String nombre) throws Exception {
        if(!tiposEjercicio.containsKey(nombre))
            throw new Exception("Nombre no corresponde a ningun ejercicio.  No se puede borrar.");
        tiposEjercicio.remove(nombre);
    }

    public static void borrarPrograma(String cedula) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para borrar programa de entrenamiento.");
        if(paciente.getProgramaEntrenamiento().size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede borrar.");
        paciente.getProgramaEntrenamiento().clear();
    }

    public static void borrarDia(String cedula, String numeroDia) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para borrar dia de programa de entrenamiento.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        if(programa.size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede borrar.");
        Integer numero = Integer.parseInt(numeroDia);
        if(!programa.containsKey(numero))
            throw new Exception("Numero de dia invalido para borrar dia de programa de entrenamiento.");
        programa.remove(numero);
    }

    public static void borrarEjercicio(String cedula, String numeroDia, String numeroEjercicio) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para borrar dia de programa de entrenamiento.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        if(programa.size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede borrar.");
        Dia dia = programa.get(Integer.parseInt(numeroDia));
        if(dia == null)
            throw new Exception("Numero de dia invalido para borrar ejercicio de dia de programa de entrenamiento.");
        Integer numero = Integer.parseInt(numeroEjercicio);
        if(!dia.containsKey(numero))
            throw new Exception("Numero de ejercicio invalido para borrar ejercicio de dia de programa de entrenamiento.");
        dia.remove(numero);
    }

    public static void borrarMaquina(String nombre) throws Exception {
        if(!maquinas.containsKey(nombre))
            throw new Exception("Nombre no corresponde a ninguna maquina.  No se puede borrar.");
        maquinas.remove(nombre);
    }

    public static Paciente getPaciente(String valorCedula) throws Exception {
        Cedula cedula = new Cedula(valorCedula);
        if(!pacientes.containsKey(cedula))
            throw new Exception("Cedula no corresponde a ningun paciente.  No se puede get.");
        return pacientes.get(cedula);
    }

    public static Double getMedicion(String cedula, String nombreMedicion) throws Exception {
        Mediciones mediciones = getMediciones(cedula);
        if(!mediciones.containsKey(nombreMedicion))
            throw new Exception("Nombre no corresponde a ninguna medicion.  No se puede get.");
        return mediciones.get(nombreMedicion);
    }

    public static Mediciones getMediciones(String cedula) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para get mediciones.");
        return paciente.getMediciones();
    }

    public static TipoEjercicio getTipoEjercicio(String nombre) throws Exception {
        if(!tiposEjercicio.containsKey(nombre))
            throw new Exception("Nombre no corresponde a ningun ejercicio.  No se puede get.");
        return tiposEjercicio.get(nombre);
    }

    public static ProgramaEntrenamiento getPrograma(String cedula) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para get programa de entrenamiento.");
        if(paciente.getProgramaEntrenamiento().size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede get.");
        return paciente.getProgramaEntrenamiento();
    }

    public static Dia getDia(String cedula, String numeroDia) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para get dia de programa de entrenamiento.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        if(programa.size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede get.");
        Integer numero = Integer.parseInt(numeroDia);
        if(!programa.containsKey(numero))
            throw new Exception("Numero de dia invalido para get dia de programa de entrenamiento.");
        return programa.get(numero);
    }

    public static Ejercicio getEjercicio(String cedula, String numeroDia, String numeroEjercicio) throws Exception {
        Paciente paciente = pacientes.get(new Cedula(cedula));
        if(paciente == null)
            throw new Exception("Paciente invalido para get dia de programa de entrenamiento.");
        ProgramaEntrenamiento programa = paciente.getProgramaEntrenamiento();
        if(programa.size() == 0)
            throw new Exception("Paciente todavia no tiene programa de entrenamiento.  No se puede get.");
        Dia dia = programa.get(Integer.parseInt(numeroDia));
        if(dia == null)
            throw new Exception("Numero de dia invalido para get ejercicio de dia de programa de entrenamiento.");
        Integer numero = Integer.parseInt(numeroEjercicio);
        if(!dia.containsKey(numero))
            throw new Exception("Numero de ejercicio invalido para get ejercicio de dia de programa de entrenamiento.");
        return dia.get(numero);
    }

    public static String getMaquina(String nombre) throws Exception {
        if(!maquinas.containsKey(nombre))
            throw new Exception("Nombre no corresponde a ninguna maquina.  No se puede get.");
        return maquinas.get(nombre);
    }
}