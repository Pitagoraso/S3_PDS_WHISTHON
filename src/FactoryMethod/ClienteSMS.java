package FactoryMethod;

public class ClienteSMS extends Cliente {
    @Override
    protected Notificacion creaNotificacion() {
        return new NotificacionSMS();
    }
}
