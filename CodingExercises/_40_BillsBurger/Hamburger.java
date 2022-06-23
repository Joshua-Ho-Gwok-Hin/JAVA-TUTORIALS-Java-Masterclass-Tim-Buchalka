package _40_BillsBurger;

public class Hamburger {

    private String name, meat, breadRollType;
    private double price;

    private String addition1Name, addition2Name, addition3Name, addition4Name;
    private double addition1Price, addition2Price, addition3Price, addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
        System.out.println(this.name + " hamburger on a " +
                this.breadRollType + " roll with " +
                this.meat + ", price is " +
                this.price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){

        if (addition1Name != null) {
            this.price += addition1Price;
            System.out.println("Added " +
                    addition1Name + " for an extra " +
                    addition1Price);
        }
        if (addition2Name != null) {
            this.price += addition2Price;
            System.out.println("Added " +
                    addition2Name + " for an extra " +
                    addition2Price);
        }
        if (addition3Name != null) {
            this.price += addition3Price;
            System.out.println("Added " +
                    addition3Name + " for an extra " +
                    addition3Price);
        }
        if (addition4Name != null) {
            this.price += addition4Price;
            System.out.println("Added " +
                    addition4Name + " for an extra " +
                    addition4Price);
        }
        return this.price;
    }
}
