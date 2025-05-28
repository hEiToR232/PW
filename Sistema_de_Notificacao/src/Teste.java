// Enzo Catarino e Heitor
public class Teste {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        Notificador sms = new SMSNotificador();
        Notificador app = new AppNotificador();
        Alerta alertaEmail = new Alerta(email);
        Alerta alertaSMS = new Alerta(sms);
        Alerta alertaApp = new Alerta(app);
        alertaEmail.disparar("Laçamento no KaBuM!");
        alertaSMS.disparar("VIVO AVISA: Voce recebeu 1 ligação...");
        alertaApp.disparar("Joaozinho123123 \nEnviou um  reel de user32321");
    }
}
