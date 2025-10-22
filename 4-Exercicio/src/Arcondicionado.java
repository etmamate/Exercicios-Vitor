// Classe ArCondicionado
class ArCondicionado implements Conectavel, Controlavel {
    private String nome;
    private boolean conectado;
    private boolean ligado;
    private int temperatura;

    public ArCondicionado(String nome) {
        this.nome = nome;
        this.conectado = false;
        this.ligado = false;
        this.temperatura = 22;
    }

    @Override
    public void conectar() {
        if (!conectado) {
            conectado = true;
            System.out.println(nome + " conectado à rede");
        } else {
            System.out.println(nome + " já está conectado");
        }
    }

    @Override
    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println(nome + " ligado na temperatura " + temperatura + "°C");
        } else {
            System.out.println(nome + " já está ligado");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println(nome + " desligado");
        } else {
            System.out.println(nome + " já está desligado");
        }
    }

    public void ajustarTemperatura(int novaTemperatura) {
        if (ligado && conectado) {
            temperatura = novaTemperatura;
            System.out.println(nome + " temperatura ajustada para " + temperatura + "°C");
        } else {
            System.out.println(nome + " precisa estar ligado e conectado para ajustar temperatura");
        }
    }

    @Override
    public String getNome() {
        return nome;
    }

    public boolean isConectado() {
        return conectado;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getTemperatura() {
        return temperatura;
    }
}