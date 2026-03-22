public class Usuario {

    private String nome;
    private String senha;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(String senha) {
        if (senha.length() >= 8 ){
            this.senha = senha;
            System.out.println("Senha alterada");
        }else {
            System.out.println("Caracteres insuficiente.");
        }
    }

    public Usuario(String nome, String senha){
        this.nome = nome;
        setSenha(senha);
    }

    public Usuario(String nome){
        this.nome = nome;
        senha = "ana123123";
    }

    public Usuario(){}

}
