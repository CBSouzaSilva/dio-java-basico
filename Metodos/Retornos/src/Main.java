//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //retornos

        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado: "+ areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,6);
        System.out.println("Área do Retangulo: "+ areaRetangulo);

        double areaTrapezio = Quadrilatero.area(8,7,9);
        System.out.println("Área do Trapézio: "+ areaTrapezio);
    }
}