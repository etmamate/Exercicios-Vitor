
class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está desenvolvendo uma nova funcionalidade...");
    }

    @Override
    public double calcularBonificacao() {
        return salario * 0.10; // 10% de bonificação
    }
}