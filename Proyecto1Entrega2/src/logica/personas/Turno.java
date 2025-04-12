package logica.personas;

public class Turno {
    private boolean apertura;
    private boolean cierre;
    private String lugar;
    private String tarea;

    public Turno(boolean apertura, boolean cierre, String lugar, String tarea) {
        this.apertura = apertura;
        this.cierre = cierre;
        this.lugar = lugar;
        this.tarea = tarea;
    }

    public boolean getApertura() {
        return apertura;
    }

    public boolean getCierre() {
        return cierre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getTarea() {
        return tarea;
    }

    public void setApertura(boolean apertura) {
        this.apertura = apertura;
    }

    public void setCierre(boolean cierre) {
        this.cierre = cierre;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }
}