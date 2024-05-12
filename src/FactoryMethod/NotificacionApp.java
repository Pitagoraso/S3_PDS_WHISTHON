package FactoryMethod;
public class NotificacionApp implements Notificacion {
    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando notificacion en la aplicacion: " + mensaje);
    }
}
