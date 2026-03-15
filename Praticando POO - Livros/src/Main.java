public class Main {
    public static void main(String[] args) {

        //criando um objeto chamado noites brancas, um livro classico
        Livros noitesBrancas = new Livros();
        noitesBrancas.titulo = "Noites Brancas";
        noitesBrancas.autor = "Fiódor Dostoiévsk";
        noitesBrancas.numeroPaginas = 96;

        //chamando o metodo de exibição para o objeto noites brancas
        noitesBrancas.exibirInformacoes();

        //Chamando o metodo para verificar se o livro é grande ou pequeno
        boolean grandeOuPequeno = noitesBrancas.ehGrande(true);

        //criando a condição para a verificação
        if (noitesBrancas.numeroPaginas > 300){
            System.out.println("O Livro " + noitesBrancas.titulo + " é Grande? " + grandeOuPequeno );
        }else {
            grandeOuPequeno = false;
            System.out.println("O Livro " + noitesBrancas.titulo + " é Grande? " + grandeOuPequeno );
        }

        System.out.println("========================================");

        //criando um objeto chamado Anna Karanina, um livro classico
        Livros annaKaranina = new Livros();
        annaKaranina.titulo = "Anna Karanina";
        annaKaranina.autor = "Liev Tolstó";
        annaKaranina.numeroPaginas = 808;

        //Chamando o metodo de exibição para o objeto Anna Karanina
        annaKaranina.exibirInformacoes();

        //chamando o metodo boolean para verificar se é grande ou pequeno
        grandeOuPequeno = annaKaranina.ehGrande(true);

        //criando a condição para a verificação
        if (annaKaranina.numeroPaginas > 300){
            System.out.println("O Livro " + annaKaranina.titulo + "é grande? " + grandeOuPequeno);
        }else {
            grandeOuPequeno = false;
            System.out.println("O Livro " + annaKaranina.titulo + "é grande? " + grandeOuPequeno);
        }
    }
}

