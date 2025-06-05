import java.util.HashSet;
import java.util.Set;

public class Usuario {
    private Assinatura assinatura;
    private Set<Class<?>> pacotesAdicionados; // controla pacotes já adicionados

    public Usuario() {
        this.assinatura = new AssinaturaBase();
        this.pacotesAdicionados = new HashSet<>();
    }

    public boolean adicionarPacote(Class<? extends PacoteDecorator> pacoteClass) {
        if (pacotesAdicionados.contains(pacoteClass)) {
            System.out.println("Pacote já adicionado: " + pacoteClass.getSimpleName());
            return false;
        }

        try {
            // Cria nova instância do pacote passando a assinatura atual
            Assinatura novaAssinatura = pacoteClass.getConstructor(Assinatura.class).newInstance(assinatura);
            assinatura = novaAssinatura;
            pacotesAdicionados.add(pacoteClass);
            System.out.println("Pacote adicionado: " + pacoteClass.getSimpleName());
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao adicionar pacote: " + e.getMessage());
            return false;
        }
    }

    public String getDescricaoAssinatura() {
        return assinatura.getDescricao();
    }

    public double getPrecoTotal() {
        return assinatura.getPreco();
    }
}
