package Prototype;

import java.util.List;

public class CampañaDigital extends Campaña {
    private String plataformaDigital;

    public CampañaDigital(String nombre, String objetivo, List<String> medios, String plataforma) {
        super(nombre, objetivo, medios);
        this.plataformaDigital = plataforma;
    }

    public CampañaDigital(CampañaDigital source) {
        super(source);
        this.plataformaDigital = source.plataformaDigital;
    }

    @Override
    public Campaña clone() {
        return new CampañaDigital(this);
    }

    @Override
    public void visualiza() {
        super.visualiza();
        System.out.println("Plataforma Digital: " + plataformaDigital);
    }
}

