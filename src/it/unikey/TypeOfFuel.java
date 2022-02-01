package it.unikey;

public class TypeOfFuel extends GasStation {

    private static double PriceGreen = 5;
    private static double PriceDisel = 10;

    @Override
    public void Refueling(double quanity) {
        double Maxcapacity = 2000;
        double capacity = 0;

        for (int i = 0; i < quanity; i++) {
            capacity++;
        }
        if (quanity > Maxcapacity)
            System.out.println("Non puoi rifornire questa quantità di benzina nel distributore");
        else
            System.out.println("Hai rifornito " + quanity);
    }

    public void SellFuelGreen(String brand, String model, double Money){

        double litri = Money / PriceGreen;
        System.out.println("Hai rifornito la tua " + model + " di " + litri + " litri di  benzina");

    }

}
