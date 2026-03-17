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
        boolean grandeOuPequeno = noitesBrancas.ehGrande();
        System.out.println("O livro é grande? " + grandeOuPequeno);

        System.out.println("========================================");

        //criando um objeto chamado Anna Karanina, um livro classico
        Livros annaKaranina = new Livros();
        annaKaranina.titulo = "Anna Karanina";
        annaKaranina.autor = "Liev Tolstó";
        annaKaranina.numeroPaginas = 808;

        //Chamando o metodo de exibição para o objeto Anna Karanina
        annaKaranina.exibirInformacoes();

        //chamando o metodo boolean para verificar se é grande ou pequeno
        grandeOuPequeno = annaKaranina.ehGrande();
        System.out.println("O livro é grande? " + grandeOuPequeno);


        }
    }


