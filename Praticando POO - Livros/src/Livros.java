public class Livros {

    String titulo;
    int numeroPaginas;
    String autor;

    public void exibirInformacoes (){
        System.out.println("Livro: " + titulo + "\n"  +
                "Autor: " + autor + "\n" +
                "Número De Páginas: " + numeroPaginas);

    }

    public boolean ehGrande (){
        return numeroPaginas > 300;
    }
}
