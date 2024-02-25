package Ejercicio01;

public class Principal {
    public static void main(String[] args) {
       
        CorreoElectronico correo = new CorreoElectronico("Hola", "angelplanet440@gmail.com", "Saludo");
        correo.enviar();

        SMS sms = new SMS("Hola", "123456789", 160);
        sms.enviar();

        NotificacionApp notificacionApp = new NotificacionApp("Hola", "usuario1", "abc123");
        notificacionApp.enviar();
    }
}