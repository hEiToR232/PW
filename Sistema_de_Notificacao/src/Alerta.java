// Enzo Catarino e Heitor
public class Alerta {
       private Notificador notificador;

    public Alerta(Notificador notificador) {
        this.notificador = notificador;
    }

    public void disparar(String mensagem){
           notificador.enviar(mensagem);
    }
}
