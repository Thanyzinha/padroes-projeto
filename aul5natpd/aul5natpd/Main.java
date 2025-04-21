import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Login login = Login.getInstancia();

        System.out.print("Usuário: ");
        String user = sc.nextLine();
        System.out.print("Senha: ");
        String pass = sc.nextLine();

        String captcha = login.gerarCaptcha();
        System.out.println("Digite o código: " + captcha);
        String resposta = sc.nextLine();

        
        if (login.autenticar(user, pass, captcha, resposta)) {
            System.out.println("Login bem-sucedido!");
        } else {
            System.out.println("Acesso negado!");
        }
    }
}
