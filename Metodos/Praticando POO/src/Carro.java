public class Carro {

    int ano;
    String modelo;
    String marca;

    public void exibirDetalhe(){
        System.out.println("Este carro é um " + marca + " " + modelo + " do ano " + ano);
    }

    public int calcularIdade(int anoCarroAtual){
        return anoCarroAtual - ano;
    }

}
