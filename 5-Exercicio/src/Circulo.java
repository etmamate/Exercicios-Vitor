// Classe Circulo
class Circulo extends FormaGeometrica {
    private double raio;
    
    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo");
        }
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
    
    public double getRaio() {
        return raio;
    }
}
