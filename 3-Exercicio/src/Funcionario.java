
abstract class Funcionario implements Trabalhavel {

protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonificacao();

    // Getters
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
