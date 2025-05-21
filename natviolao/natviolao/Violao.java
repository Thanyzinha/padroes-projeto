public abstract class Violao implements ViolaoPrototype {
    protected String nome;
    protected String descricao;
    protected String tipoCordas;
    protected int numeroCordas;
    protected String corpo;
    protected String som;
    protected String indicacao;

    public Violao(String nome, String descricao, String tipoCordas, int numeroCordas, String corpo, String som, String indicacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoCordas = tipoCordas;
        this.numeroCordas = numeroCordas;
        this.corpo = corpo;
        this.som = som;
        this.indicacao = indicacao;
    }

    @Override
    public ViolaoPrototype clone() {
        try {
            return (ViolaoPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Erro ao clonar violão", e);
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Tipo de cordas: " + tipoCordas);
        System.out.println("Número de cordas: " + numeroCordas);
        System.out.println("Corpo: " + corpo);
        System.out.println("Som: " + som);
        System.out.println("Indicação: " + indicacao);
        System.out.println("-----------------------------------");
    }
}
