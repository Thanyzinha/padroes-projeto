public class NotificacaoBasica implements Notificacao {

    @Override
    public String enviar(String mensagem) {
        return "Enviando mensagem básica: " + mensagem;
    }
}
