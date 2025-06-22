import java.util.*;

public class Genero implements ISubject {
    private String nome;
    private List<Usuario> observers = new ArrayList<>();

    public Genero(String nome) {
        this.nome = nome;
    }

    @Override
    public void addObserver(Usuario usuario) {
        observers.add(usuario);
    }

    @Override
    public void removeObserver(Usuario usuario) {
        observers.remove(usuario);
    }

    @Override
    public void notifyObservers(Conteudo conteudo) {
        for (Usuario u : observers) {
            u.update(conteudo, nome);
        }
    }

    public void adicionarConteudo(Conteudo conteudo) {
        System.out.println("\n📺 Novo conteúdo adicionado ao gênero " + nome + ": " + conteudo.getTitulo());
        notifyObservers(conteudo);
    }

    public String getNome() {
        return nome;
    }
}
