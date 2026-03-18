public class Funcionario {

    String nome;
    double salarioBruto;

    public double calcularImposto(){
        return salarioBruto * 0.10;
    }


    public void exibirSalarioLiquido(){
        System.out.println("Prezado Desenvolvedor " + nome);
        System.out.printf("Seu Salario Liquido: R$ %.2f%n" , (salarioBruto - calcularImposto()));
    }

}