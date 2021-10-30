package data;

public class AutoEntrante {
    private String placa;
    private String nombreDelPropietario;
    private String precioxhora;

    public AutoEntrante(String placa, String nombreDelPropietario, String precioxhora) {
        this.placa = placa;
        this.nombreDelPropietario = nombreDelPropietario;
        this.precioxhora = precioxhora;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreDelPropietario() {
        return nombreDelPropietario;
    }

    public void setNombreDelPropietario(String nombreDelPropietario) {
        this.nombreDelPropietario = nombreDelPropietario;
    }

    public String getPrecioxhora() {
        return precioxhora;
    }

    public void setPrecioxhora(String precioxhora) {
        this.precioxhora = precioxhora;
    }
}
