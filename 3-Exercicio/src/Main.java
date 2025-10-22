
public class Main {
    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = {
            new Desenvolvedor("João Silva", 5000),
            new Gerente("Maria Santos", 8000),
            new Estagiario("Pedro Costa", 1500)
        };

        for (Funcionario func : funcionarios) {
            System.out.println("--- " + func.getNome() + " ---");
            func.trabalhar();
            double bonificacao = func.calcularBonificacao();
            System.out.println("Bonificação: R$ " + bonificacao);
            System.out.println();
        }
    }
}
