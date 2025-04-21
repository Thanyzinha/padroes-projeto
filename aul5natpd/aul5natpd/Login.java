import java.util.Random;

public class Login {
    private static Login instancia;
    private String usuario = "admin";
    private String senha = "1234";

    private Login() {}

    public static Login getInstancia() {
        if (instancia == null) {
            instancia = new Login();
        }
        return instancia;
    }

    public boolean autenticar(String user, String pass, String captcha, String resposta) {
        return usuario.equals(user) && senha.equals(pass) && captcha.equals(resposta);
    }

    public String gerarCaptcha() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(chars.charAt(r.nextInt(chars.length())));
        }
        return sb.toString();
    }
}
