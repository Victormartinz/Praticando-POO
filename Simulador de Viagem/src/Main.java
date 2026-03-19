public class Main {
    public static void main(String[] args) {

        CarroViagem carro = new CarroViagem();
        carro.quilometragemTotal = 0;
        carro.consumoMedio = 10.0;

        carro.adicionarViagem(50.0);
        carro.adicionarViagem(30.0);
        System.out.println("Total de Litros gasto: " + carro.calcularCombustivelGasto());

    }
}
