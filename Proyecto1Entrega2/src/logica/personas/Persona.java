package logica.personas;

import java.util.Date;
import java.util.List;

public abstract class Persona {
    protected String nombre;
    protected String login;
    protected String password;
    protected List<String> enfermedadesDiscapacidades;
    protected Date fechaDeNacimiento;
    protected int peso;
    protected float altura;

    public Persona(String nombre, String login, String password, List<String> enfermedadesDiscapacidades,
                   Date fechaDeNacimiento, int peso, float altura) {
        this.nombre = nombre;
        this.login = login;
        this.password = password;
        this.enfermedadesDiscapacidades = enfermedadesDiscapacidades;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getEnfermedadesDiscapacidades() {
        return enfermedadesDiscapacidades;
    }

    public void setEnfermedadesDiscapacidades(List<String> enfermedadesDiscapacidades) {
        this.enfermedadesDiscapacidades = enfermedadesDiscapacidades;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public abstract String getRol();
}
