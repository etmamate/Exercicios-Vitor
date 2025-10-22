public class Main {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.acelerar();
        carro.frear();
        carro.abastecer(15.0);

        moto.acelerar();
        moto.frear();
        moto.abastecer(15.0);
    }
}
