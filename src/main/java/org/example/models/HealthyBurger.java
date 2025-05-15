package org.example.models;

public class HealthyBurger extends Hamburger{
    private static final String meat = "Tofu";
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price ;

    public HealthyBurger(String name, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }


    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double total = super.itemizeHamburger();

        if (healthyExtra1Name != null) {
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
            total += healthyExtra1Price;
        }

        if (healthyExtra2Name != null) {
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
            total += healthyExtra2Price;
        }
        setPrice(total);
        return total;
    }
}
