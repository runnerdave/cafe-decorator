package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class Espresso extends Beverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
