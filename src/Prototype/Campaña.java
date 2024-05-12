package Prototype;

import java.util.ArrayList;
import java.util.List;

public abstract class Campaña implements Cloneable {
    protected String nombre;
    protected String objetivo;
    protected List<String> medios;

    public Campaña(String nombre, String objetivo, List<String> medios) {
        this.nombre = nombre;
        this.objetivo = objetivo;
        this.medios = new ArrayList<>(medios);
    }

    public Campaña(Campaña source) {
        this.nombre = source.nombre;
        this.objetivo = source.objetivo;
        this.medios = new ArrayList<>(source.medios);
    }

    @Override
    public abstract Campaña clone();

    public void visualiza() {
        System.out.println("Campaña: " + nombre + " - Objetivo: " + objetivo);
        System.out.println("Medios: " + String.join(", ", medios));
    }

    public void imprime() {
        System.out.println("Imprimiendo detalles de la campaña: " + nombre);
    }
}


