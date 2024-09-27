public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor
    public Produto(int id, String nome, double preco, int quantidadeEmEstoque) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    // Métodos (Comportamentos)
    public boolean verificarDisponibilidade() {
        return quantidadeEmEstoque > 0;
    }

    public void reduzirEstoque(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
        } else {
            System.out.println("Quantidade solicitada não disponível.");
        }
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }
}
