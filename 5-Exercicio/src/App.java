import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // Criando uma lista de formas geométricas
        List<FormaGeometrica> formas = new ArrayList<>();

        // Adicionando diferentes formas à lista
        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Retangulo(6.0, 3.0));
        formas.add(new Triangulo(3.0, 4.0, 5.0));
        formas.add(new Triangulo(5.0, 5.0, 5.0)); // Triângulo equilátero
        formas.add(new Circulo(2.5));
        formas.add(new Quadrado(7.0));

        // Exibindo informações de todas as formas (demonstração de polimorfismo)
        System.out.println("=== FORMAS GEOMÉTRICAS ===\n");

        for (FormaGeometrica forma : formas) {
            forma.exibirInformacoes();
        }

        // Calculando totais
        System.out.println("=== RESUMO GERAL ===");
        double areaTotal = 0;
        double perimetroTotal = 0;

        for (FormaGeometrica forma : formas) {
            areaTotal += forma.calcularArea();
            perimetroTotal += forma.calcularPerimetro();
        }

        System.out.println("Área total de todas as formas: " + String.format("%.2f", areaTotal));
        System.out.println("Perímetro total de todas as formas: " + String.format("%.2f", perimetroTotal));
        System.out.println("Número total de formas: " + formas.size());

        // Demonstração adicional com tipos específicos
        System.out.println("\n=== INFORMAÇÕES ESPECÍFICAS ===");

        for (FormaGeometrica forma : formas) {
            if (forma instanceof Triangulo) {
                Triangulo triangulo = (Triangulo) forma;
                String tipo = triangulo.isEquilatero() ? "Equilátero"
                        : triangulo.isIsosceles() ? "Isósceles" : "Escaleno";
                System.out.println("Triângulo " + tipo + " - Lados: " +
                        String.format("%.1f, %.1f, %.1f",
                                triangulo.getLadoA(), triangulo.getLadoB(), triangulo.getLadoC()));
            } else if (forma instanceof Circulo) {
                Circulo circulo = (Circulo) forma;
                System.out.println("Círculo - Raio: " + circulo.getRaio());
            } else if (forma instanceof Quadrado) {
                Quadrado quadrado = (Quadrado) forma;
                System.out.println("Quadrado - Lado: " + quadrado.getLado());
            } else if (forma instanceof Retangulo) {
                Retangulo retangulo = (Retangulo) forma;
                System.out.println("Retângulo - Base: " + retangulo.getBase() +
                        ", Altura: " + retangulo.getAltura());
            }
        }
    }
}
