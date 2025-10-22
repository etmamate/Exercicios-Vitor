public class Main {
    public static void main(String[] args) {
        // Criando o sistema de automação
        AutomacaoResidencial casa = new AutomacaoResidencial();

        // Criando dispositivos
        SmartTV tvSala = new SmartTV("TV da Sala");
        LampadaInteligente lampadaQuarto = new LampadaInteligente("Lâmpada do Quarto");
        ArCondicionado arCondicionado = new ArCondicionado("Ar Condicionado");

        // Adicionando dispositivos ao sistema
        casa.adicionarDispositivoCompleto(tvSala, tvSala);
        casa.adicionarDispositivoCompleto(lampadaQuarto, lampadaQuarto);
        casa.adicionarDispositivoCompleto(arCondicionado, arCondicionado);

        // Mostrando status inicial
        casa.mostrarStatus();

        // Simulação de cenários
        System.out.println("\n=== CENÁRIO: CHEGANDO EM CASA ===");
        casa.conectarTodos();
        casa.ligarTodos();

        // Operações específicas
        System.out.println("\n=== OPERAÇÕES INDIVIDUAIS ===");
        tvSala.mudarCanal(5);
        lampadaQuarto.ajustarIntensidade(75);
        arCondicionado.ajustarTemperatura(24);

        System.out.println("\n=== CENÁRIO: ASSISTINDO TV ===");
        tvSala.mudarCanal(7);
        lampadaQuarto.ajustarIntensidade(30); // Luz mais suave para assistir TV

        System.out.println("\n=== CENÁRIO: MODO NOTURNO ===");
        lampadaQuarto.ajustarIntensidade(25);
        tvSala.desligar();
        arCondicionado.ajustarTemperatura(26);

        System.out.println("\n=== CENÁRIO: SAINDO DE CASA ===");
        casa.desligarTodos();

        // Status final
        casa.mostrarStatus();
    }
}
