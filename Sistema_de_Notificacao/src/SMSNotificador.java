// Enzo Catarino e Heitor
public class SMSNotificador implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por SMS: "+ mensagem);
    }
}
