package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
