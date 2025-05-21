import java.util.HashMap;
import java.util.Map;

public class FabricaViolao {
    private Map<String, ViolaoPrototype> prototipos = new HashMap<>();

    public FabricaViolao() {
        prototipos.put("classico", new ViolaoClassico());
        prototipos.put("folk", new ViolaoFolk());
        prototipos.put("flet", new ViolaoFlet());
        prototipos.put("jumbo", new ViolaoJumbo());
        prototipos.put("7cordas", new Violao7Cordas());
        prototipos.put("12cordas", new Violao12Cordas());
        prototipos.put("zero", new ViolaoZero());
        prototipos.put("duplozero", new ViolaoDuploZero());
        prototipos.put("triplozero", new ViolaoTriploZero());
    }

    public ViolaoPrototype getViolao(String tipo) {
        ViolaoPrototype violao = prototipos.get(tipo.toLowerCase());
        if (violao != null) {
            return violao.clone();
        }
        System.out.println("Tipo de violão não encontrado.");
        return null;
    }
}
