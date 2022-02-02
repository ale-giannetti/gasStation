package it.unikey;

public class TypeOfFuel extends GasStation {

    private static double PriceGreen = 5;
    private static double PriceDisel = 10;
    private static double Maxcapacity = 2000;
    private double capacity = 0;

    @Override
    public void Refueling(double quanity) {
        
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

    public void SellDisel(String brand, String model, double Money){

        double litri = Money / PriceDisel;
        System.out.println("Hai rifornito alla tua " + model + " di " + litri + " litri di  Disel");

    }

}
