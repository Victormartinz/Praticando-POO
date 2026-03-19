public class Main {
    public static void main(String[] args) {

        Estoque produto = new Estoque();
        produto.produto = "Mouse";
        produto.quantidade = 20;
        produto.adicionarEstoq(5);
        System.out.println("===================");
        produto.removerEstoq(10);

    }
}
