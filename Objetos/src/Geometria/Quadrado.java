package Geometria;

public class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public String mostrarArea() {
        return String.format("%.2f", calcularArea());
    }
}

