package data;

public class Parquimetro {
    private String localizacion;
    private String precioxhora;
    private String supervisor;

    public Parquimetro(String localizacion, String precioxhora, String supervisor) {
        this.localizacion = localizacion;
        this.precioxhora = precioxhora;
        this.supervisor = supervisor;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getPrecioxhora() {
        return precioxhora;
    }

    public void setPrecioxhora(String precioxhora) {
        this.precioxhora = precioxhora;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
}
