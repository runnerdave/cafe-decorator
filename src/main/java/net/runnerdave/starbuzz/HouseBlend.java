package net.runnerdave.starbuzz;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend";
    }

    @Override
    public double cost() {
        return .89;
    }
}
