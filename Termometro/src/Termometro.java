public class Termometro {

    private double temperatura;

    public void setTemperatura(double temperatura) {
        if (temperatura < -50 || temperatura > 100){
            System.out.println("Erro ao colocar nova temperatura");
        }else {
            this.temperatura = temperatura;
        }
    }

    public double getTemperatura(){
        return temperatura;
    }

    public Termometro(double temperatura) {
        setTemperatura(temperatura);
    }

    public Termometro() {
    }
}
