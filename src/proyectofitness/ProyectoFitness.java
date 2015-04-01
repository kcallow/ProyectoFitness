package proyectofitness;


import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoFitness {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String [] args){
		initShell();
	}

	public static void initShell(){
		String input = "";
		while(! input.equals("exit")){
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
		String [] command = input.split(" ");
		switch(command[0].toLowerCase()) {
			case "add":
				add(command);
				break;
			case "mod":
				modify(command);
				break;
			case "rm":
				remove(command);
				break;
			case "view":
				view(command);
				break;
            case "exit":
                break;
			default:
				System.out.println("Unrecognized command.");
				break;
		}
	}

	private static void add(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "patient":
				addPatient(command);
				break;
			case "measure":
				addMeasurement(command);
				break;
			case "exercise":
				addExercise(command);
				break;
			case "training":
				addTrainingProgram(command);
				break;
			case "day":
				addTrainingDay(command);
				break;
			case "day-exercise":
				addDayExercise(command);
				break;
			case "machine":
				addMachine(command);
				break;
			default:
				System.out.println("Unrecognized option to add...");
				break;
		}
	}

	private static void modify(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "patient":
				modifyPatient(command);
				break;
			case "measure":
				modifyMeasurement(command);
				break;
			case "exercise":
				modifyExercise(command);
				break;
			case "training":
				modifyTrainingProgram(command);
				break;
			case "day":
				addTrainingDay(command);
				break;
			case "day-exercise":
				removeDayExercise(command);
				break;
			case "machine":
				modifyMachine(command);
				break;
			default:
				System.out.println("Unrecognized option to modify...");
				break;
		}
	}

	private static void remove(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "patient":
				removePatient(command);
				break;
			case "measure":
				removeMeasurement(command);
				break;
			case "exercise":
				removeExercise(command);
				break;
			case "training":
				removeTrainingProgram(command);
				break;
			case "day":
				removeTrainingDay(command);
				break;
			case "day-exercise":
				removeDayExercise(command);
				break;
			case "machine":
				removeMachine(command);
				break;
			default:
				System.out.println("Unrecognized option to remove...");
				break;
		}
	}

	private static void view(String [] command) throws Exception {
		switch(command[1].toLowerCase()) {
			case "patient":
				viewPatient(command);
				break;
			case "measure":
				viewMeasurement(command);
				break;
			case "exercise":
				viewExercise(command);
				break;
			case "training":
				viewTrainingProgram(command);
				break;
			case "day":
				viewTrainingDay(command);
				break;
			case "machine":
				viewMachine(command);
				break;
			default:
				System.out.println("Unrecognized option to view...");
				break;
		}
	}


    private static void addPatient(String[] command) throws Exception {
        Paciente.agregar(scanner.nextLine(), scanner.nextLine(), new Cedula(scanner.nextLine()), scanner.nextLine(), new Telefono(scanner.nextLine()), new Correo(scanner.nextLine()));
    }

    private static void addMeasurement(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addExercise(String[] command) throws Exception {
        TipoEjercicio.agregar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void addTrainingProgram(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addTrainingDay(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addDayExercise(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void addMachine(String[] command) throws Exception {
        TipoMaquina.agregar(scanner.nextLine(), scanner.nextLine());
    }

    private static void modifyMachine(String[] command) throws Exception {
        TipoMaquina.modificar(scanner.nextLine(), scanner.nextLine());
    }

    private static void modifyTrainingProgram(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void modifyMeasurement(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void modifyExercise(String[] command) throws Exception {
        TipoEjercicio.modificar(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
    }

    private static void modifyPatient(String[] command) throws Exception {
        Paciente.modificar(scanner.nextLine(), scanner.nextLine(), new Cedula(scanner.nextLine()), scanner.nextLine(), new Telefono(scanner.nextLine()), new Correo(scanner.nextLine()));
    }

    private static void removePatient(String[] command) throws Exception {
        Paciente.borrar(scanner.nextLine());
    }

    private static void removeMeasurement(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeExercise(String[] command) throws Exception {
        TipoEjercicio.borrar(scanner.nextLine());
    }

    private static void removeTrainingProgram(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeTrainingDay(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeDayExercise(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void removeMachine(String[] command) throws Exception {
        TipoMaquina.borrar(scanner.nextLine());
    }

    private static void viewPatient(String[] command) throws Exception{
        System.out.println(Paciente.ver(scanner.nextLine()));
    }

    private static void viewMeasurement(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viewExercise(String[] command) throws Exception {
        System.out.println(TipoEjercicio.ver(scanner.nextLine()));
    }

    private static void viewTrainingProgram(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viewTrainingDay(String[] command) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static void viewMachine(String[] command) throws Exception {
        System.out.println(TipoMaquina.ver(scanner.nextLine())); 
    }
}