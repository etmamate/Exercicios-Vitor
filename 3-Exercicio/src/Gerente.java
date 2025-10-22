
class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe...");
    }

    @Override
    public double calcularBonificacao() {
        return salario * 0.15; // 15% de bonificação
    }
}