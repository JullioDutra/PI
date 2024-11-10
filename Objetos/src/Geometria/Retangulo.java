package Geometria;

public class Retangulo {
    private double comprimento;
    private double altura;

    public Retangulo(double comprimento, double altura) {
        this.comprimento = comprimento;
        this.altura = altura;
    }

    public double calcularArea() {
        return comprimento * altura;
    }

    public String mostrarArea() {
        return String.format("%.2f", calcularArea());
    }
}



