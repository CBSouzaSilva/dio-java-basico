//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AreaQuadrilateros.area(5);
        AreaQuadrilateros.area(6d, 8d);
        AreaQuadrilateros.area(8, 6, 3);
        AreaQuadrilateros.area(6f, 8f);
        /*
        devido a forma que o metodo vê os tipos de dados dos parametros
        foi necessário fazer uma pequena modificação para o calculo
        do retângulo e losangulo, onde o primeiro ficou com dados do tipo double
        e o segundo float
         */
    }
}