package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", soy";
    }

    @Override
    public double cost() {
        return .15 + beverage.cost();
    }
}
