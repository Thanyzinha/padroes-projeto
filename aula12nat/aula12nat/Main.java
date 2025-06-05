public class Main {
    public static void main(String[] args) {
        Notificacao notificacao = new NotificacaoBasica();

        Notificacao notificacaoWhatsapp = new NotificacaoWhatsappDecorator(notificacao);

        String resposta = notificacaoWhatsapp.enviar("Olá, essa é uma mensagem de teste.");
        System.out.println(resposta);
    }
}
