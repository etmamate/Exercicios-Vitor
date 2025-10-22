
class Estagiario extends Funcionario {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está aprendendo e ajudando nas tarefas...");
    }

    @Override
    public double calcularBonificacao() {
        return salario * 0.05; // 5% de bonificação
    }
}