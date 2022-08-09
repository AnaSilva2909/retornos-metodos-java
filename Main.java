public class Main {
    public static void main(String[] args) {
        
        //Exercício de Retorno
        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retângulo: " + areaRetangulo);

        
        double areaTrapezio = Quadrilatero.area(6, 5,9 );
        System.out.println("Área do trapézio: " + areaTrapezio);
    }

}