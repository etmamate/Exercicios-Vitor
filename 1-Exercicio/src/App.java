public class App {
    public static void main(String[] args) throws Exception {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();

        gato.emitirSom();
        gato.dormindo();

        cachorro.emitirSom();
        cachorro.dormindo();
    }
}
