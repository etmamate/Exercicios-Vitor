public class Main {
    public static void main(String[] args) throws Exception {
        // Criando dispositivos
        SmartTV tvSala = new SmartTV("TV da Sala");
        LampadaInteligente lampadaQuarto = new LampadaInteligente("Lâmpada do Quarto");
        ArCondicionado arCondicionado = new ArCondicionado("Ar Condicionado");

        // Criando sistema de automação
        AutomacaoResidencial casa = new AutomacaoResidencial();

        // Adicionando dispositivos
        casa.adicionarDispositivo(tvSala);
        casa.adicionarDispositivo(lampadaQuarto);
        casa.adicionarDispositivo(arCondicionado);

        // Simulação
        casa.mostrarStatus();
        casa.conectarTodos();
        casa.ligarTodos();

        // Operações específicas
        System.out.println("\n=== OPERAÇÕES ESPECÍFICAS ===");
        tvSala.mudarCanal(5);
        lampadaQuarto.ajustarIntensidade(75);
        arCondicionado.ajustarTemperatura(24);

        // Modo noturno
        System.out.println("\n=== MODO NOTURNO ===");
        lampadaQuarto.ajustarIntensidade(25);
        tvSala.desligar();
        arCondicionado.ajustarTemperatura(26);

        // Desligar tudo
        casa.desligarTodos();
    }
}
