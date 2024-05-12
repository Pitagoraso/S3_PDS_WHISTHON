package FactoryMethod;
public class Usuario {
    public static void main(String[] args) {
        Cliente clienteEmail = new ClienteEmail();
        Cliente clienteSMS = new ClienteSMS();
        Cliente clienteApp = new ClienteApp();

        clienteEmail.notificar("Bienvenido al sistema de notificacion por Email!");
        clienteSMS.notificar("Tu codigo de verificacion es 123456");
        clienteApp.notificar("Tienes una nueva notificacion en la app");
    }
}
