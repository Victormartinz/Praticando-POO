public class Main {
    public static void main(String[] args) {

        //criando um objeto chamado noites brancas, um livro classico
        Livros noitesBrancas = new Livros();
        noitesBrancas.titulo = "Noites Brancas";
        noitesBrancas.autor = "Fiódor Dostoiévsk";
        noitesBrancas.numeroPaginas = 301;

        //chamando o metodo de exibição para o objeto noites brancas
        noitesBrancas.exibirInformacoes();

        //Chamando o metodo para verificar se o livro é grande ou pequeno
        boolean grandeOuPequeno = noitesBrancas.ehGrande(true);
        if (noitesBrancas.numeroPaginas > 300){
            System.out.println("O Livro " + noitesBrancas.titulo + " é Grande? " + true );
        }else {
            System.out.println("O Livro " + noitesBrancas.titulo + " é Grande? " + false );
        }

    }
}

