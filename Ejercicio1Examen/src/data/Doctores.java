package data;

public class Doctores {
    private String Nombre;
    private String Especialidad;
    private String NumeroDeMedico;

    public Doctores(String nombre, String especialidad, String numeroDeMedico) {
        Nombre = nombre;
        Especialidad = especialidad;
        NumeroDeMedico = numeroDeMedico;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }

    public String getNumeroDeMedico() {
        return NumeroDeMedico;
    }

    public void setNumeroDeMedico(String numeroDeMedico) {
        NumeroDeMedico = numeroDeMedico;
    }
}
