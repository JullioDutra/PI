package Geometria;

public class QuadroNegro {
    private Quadrado quadrado;
    private Retangulo retangulo;
    private Circunferencia circunferencia;
    private Triangulo triangulo;

    public void limpaQuadro() {
        quadrado = null;
        retangulo = null;
        circunferencia = null;
        triangulo = null;
        System.out.println("Quadro limpo.");
    }

    public void criaQuadrado(double l) {
        quadrado = new Quadrado(l);
        System.out.println("Quadrado criado com lado " + l);
    }

    public void criaRetangulo(double c, double a) {
        retangulo = new Retangulo(c, a);
        System.out.println("Retângulo criado com comprimento " + c + " e altura " + a);
    }

    public void criaCircunferencia(double r) {
        circunferencia = new Circunferencia(r);
        System.out.println("Circunferência criada com raio " + r);
    }

    public void criaTriangulo(double b, double a) {
        triangulo = new Triangulo(b, a);
        System.out.println("Triângulo criado com base " + b + " e altura " + a);
    }

    public void mostrarAreas() {
        if (quadrado != null) {
            System.out.println("Área do Quadrado: " + quadrado.mostrarArea());
        } else {
            System.out.println("Quadrado não foi criado.");
        }

        if (retangulo != null) {
            System.out.println("Área do Retângulo: " + retangulo.mostrarArea());
        } else {
            System.out.println("Retângulo não foi criado.");
        }

        if (circunferencia != null) {
            System.out.println("Área da Circunferência: " + circunferencia.mostrarArea());
        } else {
            System.out.println("Circunferência não foi criada.");
        }

        if (triangulo != null) {
            System.out.println("Área do Triângulo: " + triangulo.mostrarArea());
        } else {
            System.out.println("Triângulo não foi criado.");
        }
    }
}



