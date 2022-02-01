package it.unikey;

public class Main {

    public static void main(String[] args) {
        
        GasStation gs = new GasStation();
        TypeOfFuel sg = new TypeOfFuel();

        gs.Refueling(200);
        gs.Refueling(200);
        //gs.Refueling(700);

        gs.Sell(50);
        gs.UpdatePrice(2);
        gs.Sell(50);

        sg.Refueling(2500);
        sg.SellFuelGreen("Mercedes", "Classe A", 70);
        sg.SellDisel("Opel", "Corsa", 25);

    }
}
