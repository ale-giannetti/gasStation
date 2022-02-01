package it.unikey;

public class GasStation {

    private static double petrolCapacity = 1000;
    private static double petrolPrice = 1.72;
    private double initialQuantity = 0;



    public void Refueling(double quanityPetrol){

        for(int i = 0; i < quanityPetrol; i++){
            initialQuantity++;
        } if(quanityPetrol > petrolCapacity - initialQuantity)
            System.out.println("Non puoi rifornire questa quantità");
        else
            System.out.println("Hai rifornito " + initialQuantity);
    }
}
