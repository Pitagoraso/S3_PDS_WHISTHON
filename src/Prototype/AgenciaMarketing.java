package Prototype;

import java.util.Arrays;
import java.util.List;

public class AgenciaMarketing {
    public static void main(String[] args) {
        List<String> mediosDigitales = Arrays.asList("Redes Sociales", "Email Marketing");
        CampañaDigital campañaGoogle = new CampañaDigital("Lanzamiento Producto", "Aumentar ventas", 
                mediosDigitales, "Google Ads");
        Campaña campañaGoogleClonada = campañaGoogle.clone();

        List<String> mediosPrensa = Arrays.asList("Periodicos nacionales", "Revistas especializadas");
        CampañaPrensa campañaRevista = new CampañaPrensa("Campaña Conciencia", "Educar consumidores", 
                mediosPrensa, "Times Magazine");
        Campaña campañaRevistaClonada = campañaRevista.clone();

        System.out.println("Campaña original y clonada:");
        campañaGoogle.visualiza();
        campañaGoogleClonada.visualiza();
        campañaRevista.visualiza();
        campañaRevistaClonada.visualiza();
    }
}


