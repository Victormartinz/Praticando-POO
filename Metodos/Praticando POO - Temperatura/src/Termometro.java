public class Termometro {

    double temperaturaCelsius;

    public double converterParaFahrenheit(){
        return (temperaturaCelsius * 9/5) + 32;
    }

    public void exibirStatus(){
        if (temperaturaCelsius > 30){
            System.out.println("Está quente");
        }else {
            System.out.println("Está agradável");
        }
    }

}
