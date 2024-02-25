package Ejercicio01;

abstract class Notificacion {
    protected String mensaje;
    protected String destinatario;

    public Notificacion() {
        this.mensaje = "";
        this.destinatario = "";
    }

    public Notificacion(String mensaje, String destinatario) {
        this.mensaje = mensaje;
        this.destinatario = destinatario;
    }

    public abstract void enviar();
}


class CorreoElectronico extends Notificacion {
    private String asunto;

    public CorreoElectronico(String mensaje, String destinatario, String asunto) {
        super(mensaje, destinatario);
        this.asunto = asunto;
    }


    @Override
    public void enviar() {
        System.out.println("Enviando correo electrónico a " + destinatario + " con asunto: " + asunto + " y mensaje: " + mensaje);
    }
}

class SMS extends Notificacion {
    private int limiteCaracteres;

    public SMS(String mensaje, String destinatario, int limiteCaracteres) {
        super(mensaje, destinatario);
        this.limiteCaracteres = limiteCaracteres;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS a " + destinatario + " con límite de caracteres: " + limiteCaracteres + " y mensaje: " + mensaje);
    }
}

class NotificacionApp extends Notificacion {
    private String idDispositivo;

    public NotificacionApp(String mensaje, String destinatario, String idDispositivo) {
        super(mensaje, destinatario);
        this.idDispositivo = idDispositivo;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando notificación en la aplicación al dispositivo con ID: " + idDispositivo + " y mensaje: " + mensaje);
    }
}


