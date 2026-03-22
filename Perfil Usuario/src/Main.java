public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Victor" );
        System.out.println(usuario.getNome());

        usuario.setNome("Victor Ms");
        System.out.println(usuario.getNome());

        usuario.setSenha("anaEuteAmo");
    }
}
