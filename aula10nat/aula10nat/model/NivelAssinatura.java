package model;

public enum NivelAssinatura {
    BRONZE(3),
    PRATA(5),
    OURO(7),
    PLATINA(10);

    private int limiteItens;

    NivelAssinatura(int limiteItens) {
        this.limiteItens = limiteItens;
    }

    public int getLimiteItens() {
        return limiteItens;
    }
}
