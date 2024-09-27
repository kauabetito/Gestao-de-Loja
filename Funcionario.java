public class Funcionario {
    private int id;
    private String nome;
    private String cargo;
    private double salario;

    // Construtor
    public Funcionario(int id, String nome, String cargo, double salario) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Métodos
    public void atualizarCargo(String novoCargo) {
        this.cargo = novoCargo;
    }

    public void atualizarSalario(double novoSalario) {
        this.salario = novoSalario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }
}
