package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return .99;
    }
}
