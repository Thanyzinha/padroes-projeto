import java.util.*;

public interface ISubject {
    void addObserver(Usuario usuario);
    void removeObserver(Usuario usuario);
    void notifyObservers(Conteudo conteudo);
}
