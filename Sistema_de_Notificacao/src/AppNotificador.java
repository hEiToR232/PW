// Enzo Catarino e Heitor
public class AppNotificador implements Notificador {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando pelo App: " + mensagem);
    }
}
