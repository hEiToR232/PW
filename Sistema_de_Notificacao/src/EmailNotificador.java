// Enzo Catarino e Heitor
public class EmailNotificador implements Notificador{
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando por E-MAIL: " + mensagem);
    }

}
