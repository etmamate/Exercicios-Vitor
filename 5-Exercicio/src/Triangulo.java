// Classe Triangulo
class Triangulo extends FormaGeometrica {
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("Todos os lados devem ser positivos");
        }
        if (!validarTriangulo(ladoA, ladoB, ladoC)) {
            throw new IllegalArgumentException("Os lados fornecidos não formam um triângulo válido");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    private boolean validarTriangulo(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }
    
    @Override
    public double calcularArea() {
        // Usando a fórmula de Heron
        double s = calcularPerimetro() / 2;
        return Math.sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC));
    }
    
    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
    
    public boolean isEquilatero() {
        return ladoA == ladoB && ladoB == ladoC;
    }
    
    public boolean isIsosceles() {
        return ladoA == ladoB || ladoA == ladoC || ladoB == ladoC;
    }
    
    public boolean isEscaleno() {
        return ladoA != ladoB && ladoA != ladoC && ladoB != ladoC;
    }
    
    public double getLadoA() {
        return ladoA;
    }
    
    public double getLadoB() {
        return ladoB;
    }
    
    public double getLadoC() {
        return ladoC;
    }
}