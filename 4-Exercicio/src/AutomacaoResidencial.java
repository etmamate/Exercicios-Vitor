import java.util.ArrayList;
import java.util.List;

class AutomacaoResidencial {
    private Conectavel[] dispositivosConectaveis;
    private Controlavel[] dispositivosControlaveis;

    public AutomacaoResidencial() {
        this.dispositivosConectaveis = new Conectavel[10];
        this.dispositivosControlaveis = new Controlavel[10];
    }

    public void adicionarDispositivo(Conectavel dispositivo) {
        for (int i = 0; i < dispositivosConectaveis.length; i++) {
            if (dispositivosConectaveis[i] == null) {
                dispositivosConectaveis[i] = dispositivo;
                break;
            }
        }
    }

    public void adicionarDispositivo(Controlavel dispositivo) {
        for (int i = 0; i < dispositivosControlaveis.length; i++) {
            if (dispositivosControlaveis[i] == null) {
                dispositivosControlaveis[i] = dispositivo;
                break;
            }
        }
    }

    public void conectarTodos() {
        System.out.println("\n=== CONECTANDO TODOS OS DISPOSITIVOS ===");
        for (Conectavel dispositivo : dispositivosConectaveis) {
            if (dispositivo != null) {
                dispositivo.conectar();
            }
        }
    }

    public void ligarTodos() {
        System.out.println("\n=== LIGANDO TODOS OS DISPOSITIVOS ===");
        for (Controlavel dispositivo : dispositivosControlaveis) {
            if (dispositivo != null) {
                dispositivo.ligar();
            }
        }
    }

    public void desligarTodos() {
        System.out.println("\n=== DESLIGANDO TODOS OS DISPOSITIVOS ===");
        for (Controlavel dispositivo : dispositivosControlaveis) {
            if (dispositivo != null) {
                dispositivo.desligar();
            }
        }
    }

    public void mostrarStatus() {
        System.out.println("\n=== STATUS DA RESIDÊNCIA ===");
        for (Controlavel dispositivo : dispositivosControlaveis) {
            if (dispositivo != null) {
                String nome = "";
                if (dispositivo instanceof SmartTV) {
                    nome = ((SmartTV) dispositivo).getNome();
                } else if (dispositivo instanceof LampadaInteligente) {
                    nome = ((LampadaInteligente) dispositivo).getNome();
                } else if (dispositivo instanceof ArCondicionado) {
                    nome = ((ArCondicionado) dispositivo).getNome();
                }
                System.out.println("- " + nome);
            }
        }
    }
}