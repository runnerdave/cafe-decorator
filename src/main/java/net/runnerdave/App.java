package net.runnerdave;

/**
 * Coffee shop decorator
 */
public class App {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()
                + " $" + beverage.cost());
        Beverage beverage2 = new DarkRoast();
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
        Beverage beverage3 = new HouseBlend();
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);

        System.out.println("after adding Mochax2 and whip:" + beverage2.getDescription() + " $" + beverage2.cost());

        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println("after adding Mocha, Soy and whip:" + beverage3.getDescription() + " $" + beverage3.cost());

        Beverage beverage4 = new Soy(new Decaf());
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

    }
}
