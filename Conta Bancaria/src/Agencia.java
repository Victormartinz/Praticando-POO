public class Agencia {
    public static void main(String[] args) {

        ContaBancaria minhaConta = new ContaBancaria(500, "Victor" );

        System.out.println("Titular: " + minhaConta.getTitular() + "\nSaldo final: " + minhaConta.getSaldo());

        minhaConta.setTitular("Victor Ms");
        minhaConta.setSaldo(minhaConta.getSaldo() + 500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println("Titular: " + titularConta + "\nSaldo final: " + saldoFinal);

        ContaBancaria contaMae = new ContaBancaria("Cássia");
        System.out.println("Titular: " + contaMae.getTitular() + "\nSaldo final: " + contaMae.getSaldo());

    }
}
