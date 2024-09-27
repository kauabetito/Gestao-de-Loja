import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private final int id;
    private final Cliente cliente;
    private final List<Produto> produtos;
    private double total;

    // Construtor
    public Pedido(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
        this.total = 0.0;
    }

    // Métodos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        total += produto.getPreco();
    }

    public double calcularTotal() {
        return total;
    }

    // Getters
    public int getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }
}
