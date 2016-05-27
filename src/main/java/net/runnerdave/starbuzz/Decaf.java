package net.runnerdave.starbuzz;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class Decaf extends Beverage {

    public Decaf() {
        description = "Decaf";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}
