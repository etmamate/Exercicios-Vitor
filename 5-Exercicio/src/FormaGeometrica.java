// Classe abstrata FormaGeometrica
abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    
    // Método concreto para exibir informações
    public void exibirInformacoes() {
        System.out.println(this.getClass().getSimpleName() + ":");
        System.out.println("Área: " + String.format("%.2f", calcularArea()));
        System.out.println("Perímetro: " + String.format("%.2f", calcularPerimetro()));
        System.out.println();
    }
}