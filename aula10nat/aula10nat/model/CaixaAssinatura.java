package model;

import java.util.*;

public class CaixaAssinatura {
    private List<Item> itens = new ArrayList<>();
    private NivelAssinatura nivel;

    public CaixaAssinatura(NivelAssinatura nivel) {
        this.nivel = nivel;
        gerarItensAleatorios();
    }

    private void gerarItensAleatorios() {
        List<Item> catalogo = Arrays.asList(
            new Item("Quadrinho", 15.00),
            new Item("Chaveiro", 5.00),
            new Item("Busto", 10.00),
            new Item("Adesivo", 1.00),
            new Item("Poster", 25.00),
            new Item("Camiseta", 25.00),
            new Item("Caneta", 3.00),
            new Item("Miniatura", 20.00)
        );

        Random random = new Random();
        int totalItens = nivel.getLimiteItens();

        for (int i = 0; i < totalItens; i++) {
            Item item = catalogo.get(random.nextInt(catalogo.size()));
            itens.add(item);
        }
    }

    public List<Item> getItens() {
        return itens;
    }

    public double calcularValorTotal() {
        return itens.stream().mapToDouble(Item::getPreco).sum();
    }

    public void mostrarCaixa() {
        System.out.println("Caixa do cliente (" + nivel + "):");
        for (Item item : itens) {
            System.out.println("- " + item);
        }
        System.out.printf("Valor total: R$%.2f\n", calcularValorTotal());
    }
}
