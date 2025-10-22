// Classe LampadaInteligente
class LampadaInteligente implements Conectavel, Controlavel {
    private String nome;
    private boolean conectada;
    private boolean ligada;
    private int intensidade;

    public LampadaInteligente(String nome) {
        this.nome = nome;
        this.conectada = false;
        this.ligada = false;
        this.intensidade = 0;
    }

    @Override
    public void conectar() {
        if (!conectada) {
            conectada = true;
            System.out.println(nome + " conectada à rede");
        } else {
            System.out.println(nome + " já está conectada");
        }
    }

    @Override
    public void ligar() {
        if (!ligada) {
            ligada = true;
            intensidade = 100;
            System.out.println(nome + " ligada com intensidade máxima (100%)");
        } else {
            System.out.println(nome + " já está ligada");
        }
    }

    @Override
    public void desligar() {
        if (ligada) {
            ligada = false;
            intensidade = 0;
            System.out.println(nome + " desligada");
        } else {
            System.out.println(nome + " já está desligada");
        }
    }

    public void ajustarIntensidade(int novaIntensidade) {
        if (ligada && conectada) {
            intensidade = Math.max(0, Math.min(100, novaIntensidade));
            System.out.println(nome + " intensidade ajustada para " + intensidade + "%");
        } else {
            System.out.println(nome + " precisa estar ligada e conectada para ajustar intensidade");
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

    public int getIntensidade() {
        return intensidade;
    }
}