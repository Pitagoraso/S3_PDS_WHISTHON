package FactoryMethod;
public class ClienteEmail extends Cliente {
    @Override
    protected Notificacion creaNotificacion() {
        return new NotificacionEmail();
    }
}


