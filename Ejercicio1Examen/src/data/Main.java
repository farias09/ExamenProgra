package data;

public class Main {

    public static void main(String[] args) {
        Pacientes elPaciente1 = new Pacientes("1 semana","David Arias", "188993245");
        Pacientes elPaciente2 = new Pacientes("3 semana","Marco Ramirez", "165478769");
        System.out.println("El paciente uno se llama: " + elPaciente1.getNombre());
        System.out.println("La estadia es de: " + elPaciente1.getEstadia());
        System.out.println("El número de cédula del paciente es: " + elPaciente1.getCedula());
        System.out.println("El doctor encargado es: " + elPaciente1.doctorDePaciente1.getNombre());
        System.out.println("La especialidad del doctor es: " + elPaciente1.doctorDePaciente1.getEspecialidad());
        System.out.println("El número de identificación del doctor es: " + elPaciente1.doctorDePaciente1.getNumeroDeMedico());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("El paciente dos se llama: " + elPaciente2.getNombre());
        System.out.println("La estadia es de: " + elPaciente2.getEstadia());
        System.out.println("El número de cédula del paciente es: " + elPaciente2.getCedula());
        System.out.println("El doctor encargado es: " + elPaciente2.doctorDePaciente2.getNombre());
        System.out.println("La especialidad del doctor es: " + elPaciente2.doctorDePaciente2.getEspecialidad());
        System.out.println("El número de identificación del doctor es: " + elPaciente2.doctorDePaciente2.getNumeroDeMedico());
    }
}
