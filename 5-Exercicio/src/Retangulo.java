// Classe Retangulo
class Retangulo extends FormaGeometrica {
    private double base;
    private double altura;
    
    public Retangulo(double base, double altura) {
        if (base <= 0 || altura <= 0) {
            throw new IllegalArgumentException("Base e altura devem ser positivas");
        }
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return base * altura;
    }
    
    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
}