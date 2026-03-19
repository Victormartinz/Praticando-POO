public class Estoque {

    String produto;
    int quantidade;

    public void adicionarEstoq(int valor){
        this.quantidade = this.quantidade + valor;
        System.out.println("Produto: " + produto);
        System.out.println("Foi adicionador " + valor + " no Estoque");
        System.out.println("Estoque: " + quantidade);
    }

    public void removerEstoq(int valor){
        this.quantidade = this.quantidade - valor;
        System.out.println("Produto: " + produto);
        System.out.println("Foi retirado " + valor + " no Estoque");
        System.out.println("Estoque: " + quantidade);
    }
}
