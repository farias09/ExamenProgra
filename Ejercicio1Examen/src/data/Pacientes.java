package data;

public class Pacientes {
    private String estadia;
    private String nombre;
    private String cedula;
    public Doctores doctorDePaciente1;
    public Doctores doctorDePaciente2;

    public Pacientes(String estadia, String nombre, String cedula) {
        this.estadia = estadia;
        this.nombre = nombre;
        this.cedula = cedula;
        this.doctorDePaciente1 = new Doctores("Jose Pablo Brenes", "Cardiologo", "1234");
        this.doctorDePaciente2 = new Doctores("David Chavarria", "Dermatólogo", "9876");
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        cedula = cedula;
    }
}
