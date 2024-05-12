package Prototype;

import java.util.List;

public class CampañaPrensa extends Campaña {
    private String editorial;

    public CampañaPrensa(String nombre, String objetivo, List<String> medios, String editorial) {
        super(nombre, objetivo, medios);
        this.editorial = editorial;
    }

    public CampañaPrensa(CampañaPrensa source) {
        super(source);
        this.editorial = source.editorial;
    }

    @Override
    public Campaña clone() {
        return new CampañaPrensa(this);
    }

    @Override
    public void visualiza() {
        super.visualiza();
        System.out.println("Editorial: " + editorial);
    }
}


    