public class Carro implements Veiculo {
    String modelo;
    double velocidadeAtual = 50;

    public void acelerar(){
        System.out.println("Velocidade Atual: " + velocidadeAtual + "/Kmph");
        velocidadeAtual = velocidadeAtual + 10;
        System.out.println("Carro Acelerando " + velocidadeAtual + "/Kmph");
    }

    public void frear(){
        System.out.println("Freou!!!!");
        velocidadeAtual = 0;
        System.out.println("Velocidade Atual: " + velocidadeAtual + "/Kmph");
    }

    public void abastecer(double litros){

        System.out.println("Tanque atual: " + litros + "L");
        System.out.println("Abastecido!!!");
        litros = litros + 45.0;
        System.out.println("Tanque atual: " + litros);
    }
}
