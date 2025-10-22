// Classe SmartTV que implementa ambas as interfaces
class SmartTV implements Conectavel, Controlavel {
    private String nome;
    private boolean conectada;
    private boolean ligada;
    private int canal;

    public SmartTV(String nome) {
        this.nome = nome;
        this.conectada = false;
        this.ligada = false;
        this.canal = 1;
    }

    @Override
    public void conectar() {
        if (!conectada) {
            conectada = true;
            System.out.println(nome + " conectada à rede Wi-Fi");
        } else {
            System.out.println(nome + " já está conectada");
        }
    }

    @Override
    public void ligar() {
        if (!ligada) {
            ligada = true;
            System.out.println(nome + " ligada no canal " + canal);
        } else {
            System.out.println(nome + " já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            ligada = false;
            System.out.println(nome + " desligada");
        } else {
            System.out.println(nome + " já está desligada");
        }
    }

    public void mudarCanal(int novoCanal) {
        if (ligada && conectada) {
            canal = novoCanal;
            System.out.println(nome + " mudou para o canal " + canal);
        } else {
            System.out.println(nome + " precisa estar ligada e conectada para mudar de canal");
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    public boolean isConectada() {
        return conectada;
    }

    public boolean isLigada() {
        return ligada;
    }

    public int getCanal() {
        return canal;
    }
}