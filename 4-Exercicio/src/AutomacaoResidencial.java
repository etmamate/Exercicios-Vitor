// Classe de automação residencial

import java.util.ArrayList;
import java.util.List;

class AutomacaoResidencial {
    private List<Conectavel> dispositivosConectaveis;
    private List<Controlavel> dispositivosControlaveis;

    public AutomacaoResidencial() {
        this.dispositivosConectaveis = new ArrayList<>();
        this.dispositivosControlaveis = new ArrayList<>();
    }

    // Métodos para adicionar dispositivos
    public void adicionarDispositivoConectavel(Conectavel dispositivo) {
        dispositivosConectaveis.add(dispositivo);
        System.out.println("Dispositivo conectável adicionado: " + dispositivo.getNome());
    }

    public void adicionarDispositivoControlavel(Controlavel dispositivo) {
        dispositivosControlaveis.add(dispositivo);
        System.out.println("Dispositivo controlável adicionado: " + dispositivo.getNome());
    }

    // Método para adicionar dispositivos que implementam ambas as interfaces
    public void adicionarDispositivoCompleto(Conectavel conectavel, Controlavel controlavel) {
        // Verifica se é o mesmo dispositivo
        if (conectavel.getNome().equals(controlavel.getNome())) {
            dispositivosConectaveis.add(conectavel);
            dispositivosControlaveis.add(controlavel);
            System.out.println("Dispositivo completo adicionado: " + conectavel.getNome());
        } else {
            System.out.println("Erro: Os dispositivos têm nomes diferentes");
        }
    }

    // Operações em lote
    public void conectarTodos() {
        System.out.println("\n=== CONECTANDO TODOS OS DISPOSITIVOS ===");
        for (Conectavel dispositivo : dispositivosConectaveis) {
            dispositivo.conectar();
        }
    }

    public void ligarTodos() {
        System.out.println("\n=== LIGANDO TODOS OS DISPOSITIVOS ===");
        for (Controlavel dispositivo : dispositivosControlaveis) {
            dispositivo.ligar();
        }
    }

    public void desligarTodos() {
        System.out.println("\n=== DESLIGANDO TODOS OS DISPOSITIVOS ===");
        for (Controlavel dispositivo : dispositivosControlaveis) {
            dispositivo.desligar();
        }
    }

    // Status do sistema
    public void mostrarStatus() {
        System.out.println("\n=== STATUS DO SISTEMA ===");
        System.out.println("Dispositivos conectáveis: " + dispositivosConectaveis.size());
        System.out.println("Dispositivos controláveis: " + dispositivosControlaveis.size());
        
        System.out.println("\nLista de dispositivos:");
        for (Conectavel dispositivo : dispositivosConectaveis) {
            System.out.println("- " + dispositivo.getNome());
        }
    }

    // Buscar dispositivo por nome
    public Conectavel buscarConectavel(String nome) {
        for (Conectavel dispositivo : dispositivosConectaveis) {
            if (dispositivo.getNome().equals(nome)) {
                return dispositivo;
            }
        }
        return null;
    }

    public Controlavel buscarControlavel(String nome) {
        for (Controlavel dispositivo : dispositivosControlaveis) {
            if (dispositivo.getNome().equals(nome)) {
                return dispositivo;
            }
        }
        return null;
    }
}