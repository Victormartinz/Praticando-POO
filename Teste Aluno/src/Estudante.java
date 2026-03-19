public class Estudante {

    String nome;
    double primeiraNota;
    double segundaNota;

    public double calcularMedia(){
        return (primeiraNota + segundaNota) / 2;
    }

    public boolean passouDeAno(){
        return calcularMedia() >= 7.0 ;
    }

    public void exibirAprovacao(){
        if (passouDeAno()){
            System.out.println("Parabens Aluno(a) " + nome + " Você foi aprovado");
        }else {
            System.out.println("Sinto lhe informar Aluno(a) " + nome + " Você foi reprovado(a)");
        }

    }

}
