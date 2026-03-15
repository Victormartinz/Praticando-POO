public class Main {
    public static void main(String[] args) {

        //Criando o primeiro Carro objeto: Civic
        Carro Civic = new Carro();
        Civic.marca = "Honda";
        Civic.modelo = "Civic";
        Civic.ano = 2012;

        System.out.println("=================================");

        // Chamando o metodo de exibição para o civic
        Civic.exibirDetalhe();

        //chamando o metodo para calcular o tempo de uso
        int tempoDeUsoCivic = Civic.calcularIdade(2020);
        System.out.println("Seu Civic tem " + tempoDeUsoCivic + " Anos de Uso");

        //Criando o segundo Carro objeto: Corolla
        Carro Corolla = new Carro();
        Corolla.marca = "Toyota";
        Corolla.modelo =  "Corolla";
        Corolla.ano = 2015;

        System.out.println("=================================");

        // Chamando o metodo de exibição para o corolla
        Corolla.exibirDetalhe();

        //chamando o metodo para calcular o tempo de uso
        int tempoDeUsoCorolla = Corolla.calcularIdade(2020);
        System.out.println("Seu Corolla tem " + tempoDeUsoCorolla + " Anos de Uso");

    }
}
