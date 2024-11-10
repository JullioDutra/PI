package Geometria;

public class Main {
    public static void main(String[] args) {
        QuadroNegro quadro = new QuadroNegro();

        quadro.criaQuadrado(4);
        quadro.criaRetangulo(5, 3);
        quadro.criaCircunferencia(7);
        quadro.criaTriangulo(6, 2);

        quadro.mostrarAreas();  

        quadro.limpaQuadro();
    }
}
