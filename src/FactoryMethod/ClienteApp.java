package FactoryMethod;
public class ClienteApp extends Cliente {
    @Override
    protected Notificacion creaNotificacion() {
        return new NotificacionApp();
    }
}


