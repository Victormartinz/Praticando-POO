public class Main {
    public static void main(String[] args) {

        Retangulo retangulo = new Retangulo();
        retangulo.altura = 5;
        retangulo.largura = 20;

        System.out.println(retangulo.calcularArea());
        System.out.println(retangulo.calcularPerimetro());

    }
}
