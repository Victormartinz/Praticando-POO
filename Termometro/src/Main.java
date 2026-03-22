public class Main {
   public static void main(String[] args) {

        Termometro termometro = new Termometro(100);

        System.out.println(termometro.getTemperatura());

        termometro.setTemperatura(2000);
        System.out.println(termometro.getTemperatura());

    }
}
