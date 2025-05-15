package org.example.models;

public class DeluxeBurger extends Hamburger{
    private static final String name = "Deluxe Burger";
    private static final String meat = "Double";
    private static final double price = 19.10;
    private static final String breadRollType = "Double Sandwich";
    private String cips;
    private String drink;

    public DeluxeBurger() {
        super(name, meat, price, breadRollType);
        this.cips = "CURVY";
        this.drink = "COKE";
    }

    public String getCips() {
        return cips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double addition1Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition2(String addition2Name, double addition2Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition3(String addition3Name, double addition3Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }

    @Override
    public void addHamburgerAddition4(String addition4Name, double addition4Price) {
        System.out.println("\nDeluxe Burger için yeni malzeme eklenemez.");
    }


}
