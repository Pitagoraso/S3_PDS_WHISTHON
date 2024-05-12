package FactoryMethod;
public abstract class Cliente {
    public void notificar(String mensaje) {
        Notificacion notificacion = creaNotificacion();
        notificacion.enviar(mensaje);
    }

    protected abstract Notificacion creaNotificacion();
}

