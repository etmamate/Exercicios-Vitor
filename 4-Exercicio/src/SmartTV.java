class SmartTV implements Conectavel, Controlavel {
    private String nome;
    private boolean conectada;
    private boolean ligada;

    public SmartTV(String nome) {
        this.nome = nome;
        this.conectada = false;
        this.ligada = false;
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
            System.out.println(nome + " ligada");
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

    public void mudarCanal(int canal) {
        if (ligada && conectada) {
            System.out.println(nome + " mudando para o canal " + canal);
        } else {
            System.out.println(nome + " precisa estar ligada e conectada para mudar de canal");
        }
    }

    public String getNome() {
        return nome;
    }

    public boolean isConectada() {
        return conectada;
    }

    public boolean isLigada() {
        return ligada;
    }
}