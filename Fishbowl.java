public class Fishbowl {
    /**
    This is the fishbowl class.
     It is for the fish objects that are going to be in the 10x10 array/fishbowl.
     The object will have two attributes: color and price
     */

    //instance variables
    private String color;//color of the fish
    private double price;//cost of the fish

    //constructor
    public Fishbowl(String c, double p){
        color=c;
        price=p;
    }

    //gets the color of the fish
    public String getColor(){
        return color;
    }

    //gets the price of the fish
    public double getPrice(){
        return price;
    }

    //set the color of the fish
    public void setColor(String col){
        color=col;
    }

    //sets the price of the fish
    public void setPrice(double money){
        price=money;
    }
}
