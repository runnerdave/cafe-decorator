package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public double cost() {
        return .10 + beverage.cost();
    }
}
