public class Main {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        estudante.nome = "Victor";
        estudante.primeiraNota = 9;
        estudante.segundaNota = 6.0;
        estudante.exibirAprovacao();

        System.out.println("--------------------------------------------------");

        estudante.nome = "Ana";
        estudante.primeiraNota = 5.0;
        estudante.segundaNota = 4.5;
        estudante.exibirAprovacao();


    }
}
