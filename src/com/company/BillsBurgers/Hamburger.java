package com.company.BillsBurgers;

public class Hamburger {
    private String name;
    private double price;
    private String meat;
    private String breadRollType;
    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, double price, String meat, String breadRollType) {
        this.name = name;
        this.price = price;
        this.meat = meat;
        this.breadRollType = breadRollType;
    }


    public void addHamburgerAddition1( String addition1Name, double addition1Price) {
        this.addition1Name = addition1Name;
        this.addition1Price = addition1Price;
    }

    public void addHamburgerAddition2( String addition2Name, double addition2Price) {
        this.addition2Name = addition2Name;
        this.addition2Price = addition2Price;
    }

    public void addHamburgerAddition3( String addition3Name, double addition3Price) {
        this.addition3Name = addition3Name;
        this.addition3Price = addition3Price;
    }

    public void addHamburgerAddition4( String addition4Name, double addition4Price) {
        this.addition4Name = addition4Name;
        this.addition4Price = addition4Price;
    }

    public double itemizeHamburger(){
        System.out.println("Hamburger with " + this.name + ", " + this.price + ", " + this.meat + ", " + this.breadRollType);
        if (addition1Name != null){
            System.out.println("Add " + this.addition1Name);
        }
        if (addition2Name != null){
            System.out.println("Add " + this.addition2Name);
        }
        if (addition3Name != null){
            System.out.println("Add " + this.addition3Name);
        }
        if (addition4Name != null){
            System.out.println("Add " + this.addition4Name);
        }
        final double finalPrice = this.price + this.addition1Price + this.addition2Price + this.addition3Price + this.addition4Price;
        return finalPrice;
    }

}
