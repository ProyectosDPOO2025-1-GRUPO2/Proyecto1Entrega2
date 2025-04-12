package logica.personas;

import java.util.ArrayList;
import java.util.Date;

public class Cocinero extends Persona {
    private boolean capacitadoAlimentos;

    public Cocinero(String nombre, String login, String password, ArrayList<String> enfermedadesDiscapacidades,
                    Date fechaDeNacimiento, int peso, float altura, boolean capacitadoAlimentos) {
        super(nombre, login, password, enfermedadesDiscapacidades, fechaDeNacimiento, peso, altura);
        this.capacitadoAlimentos = capacitadoAlimentos;
    }

    @Override
    public String getRol() {
        return "Cocinero";
    }

    public boolean getCapacitadoAlimentos() {
        return capacitadoAlimentos;
    }

    public void trabajarEnCocina() {
        if (capacitadoAlimentos) {
            System.out.println(nombre + " está trabajando en la cocina.");
        } else {
            System.out.println(nombre + " no está capacitado para trabajar en cocina.");
        }
    }

    public void trabajarEnCaja() {
        System.out.println(nombre + " está cubriendo caja temporalmente.");
    }

    public void prepararAlimentos() {
        if (capacitadoAlimentos) {
            System.out.println(nombre + " está preparando alimentos.");
        } else {
            System.out.println(nombre + " no tiene autorización para manipular alimentos.");
        }
    }
}
