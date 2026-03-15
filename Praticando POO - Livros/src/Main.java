public class Main {
    public static void main(String[] args) {

        //criando um objeto chamado noites brancas, um livro classico
        Livros noitesBrancas = new Livros();
        noitesBrancas.titulo = "Noites Brancas";
        noitesBrancas.autor = "Fiódor Dostoiévsk";
        noitesBrancas.numeroPaginas = 96;

        //chamando o metodo de exibição para o objeto noites brancas
        noitesBrancas.exibirInformacoes();

    }
}

