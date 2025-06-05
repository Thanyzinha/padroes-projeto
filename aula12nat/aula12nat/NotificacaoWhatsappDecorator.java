public class NotificacaoWhatsappDecorator extends NotificacaoDecorator {

    public NotificacaoWhatsappDecorator(Notificacao notificacao) {
        super(notificacao);
    }

    @Override
    public String enviar(String mensagem) {
        String resultado = super.enviar(mensagem);
        resultado += "\nEnviando mensagem por WhatsApp: " + mensagem;
        return resultado;
    }
}
