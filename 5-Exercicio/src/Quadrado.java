// Classe Quadrado
class Quadrado extends FormaGeometrica {
    private double lado;
    
    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("Lado deve ser positivo");
        }
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    public double getLado() {
        return lado;
    }
}