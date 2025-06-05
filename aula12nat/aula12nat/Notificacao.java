public interface Notificacao {
    /**
     * Envia uma mensagem.
     * @param mensagem texto da mensagem
     * @return confirmação do envio
     */
    String enviar(String mensagem);
}
