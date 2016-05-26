package net.runnerdave;

/**
 * Created by davidajimenez on 26/05/2016.
 */
public abstract class Beverage {
    protected String description = "Unknown beverage";

    public enum Size {TALL, GRANDE, VENTI}
    Size size = Size.TALL;

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }


    public String getDescription() {
        return this.description;
    }

    public abstract double cost();
}
