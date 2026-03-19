public class CarroViagem {

    double quilometragemTotal;
    double consumoMedio;

    public void adicionarViagem(double km){
        quilometragemTotal += km;
        System.out.println("Você correu por " + quilometragemTotal  + "km");
    }

    public double calcularCombustivelGasto(){
        return quilometragemTotal / consumoMedio;
    }
}
