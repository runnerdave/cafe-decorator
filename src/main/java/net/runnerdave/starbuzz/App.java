package net.runnerdave.starbuzz;

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

        Beverage beverage4 = new Decaf();
        beverage4.setSize(Beverage.Size.VENTI);
        //beverage4.size = Beverage.Size.VENTI; also works but not as nice
        beverage4 = new Soy(beverage4);
        System.out.println(beverage4.getDescription() + " $" + beverage4.cost());

        Beverage beverage5 = new Decaf();
        beverage5.setSize(Beverage.Size.TALL);
        beverage5 = new Soy(beverage5);
        System.out.println(beverage5.getDescription() + " $" + String.format("%.2f", beverage5.cost()));

        Beverage beverage6 = new Decaf();
        beverage6 = new Soy(beverage6);
        System.out.println(beverage6.getDescription() + " $" + String.format("%.2f", beverage6.cost()));
    }
}
