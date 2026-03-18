public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Victor";
        funcionario.salarioBruto = 3000.0;
        funcionario.exibirSalarioLiquido();

        System.out.println("====================");

        funcionario.nome = "Dostoévidki";
        funcionario.salarioBruto = 12550.50;
        funcionario.exibirSalarioLiquido();
    }
}