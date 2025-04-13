package logica.personas;

import java.util.ArrayList;
import java.util.Date;

public abstract class Persona {
    protected String nombre;
    protected String login;
    protected String password;
    protected ArrayList<String> enfermedadesDiscapacidades;
    protected Date fechaDeNacimiento;
    protected int peso;
    protected float altura;
    protected ArrayList<Turno> turnosAsignados;

    public Persona(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                   Date fechaDeNacimiento, int peso, float altura) {
        this.nombre = nombre;
        this.login = login;
        this.password = password;
        this.enfermedadesDiscapacidades = enfermedadesDiscapacidades;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.turnosAsignados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getEnfermedadesDiscapacidades() {
        return enfermedadesDiscapacidades;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public int getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public ArrayList<Turno> getTurnosAsignados() {
        return turnosAsignados;
    }

    public void agregarTurno(Turno turno) {
        if (!turnosAsignados.contains(turno)) {
            turnosAsignados.add(turno);
        }
    }

    public abstract String getRol();
    
    @Override
    public String toString() {
        return getRol() + ";" + nombre + ";" + login + ";" + password + ";" + String.join(",", enfermedadesDiscapacidades) + ";" +
    fechaDeNacimiento + ";" + peso + ";" + altura;
    }
}