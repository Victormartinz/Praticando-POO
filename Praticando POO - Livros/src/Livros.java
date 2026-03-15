public class Livros {

    String titulo;
    int numeroPaginas;
    String autor;

    public void exibirInformacoes (){
        System.out.println("Livro: " + titulo +  " Autor: " + autor + " Número De Páginas: " + numeroPaginas);

    }

    public boolean ehGrande (boolean livroGrande){
        return livroGrande = true;
    }
}
