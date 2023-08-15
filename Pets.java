import java.util.*;

/**
 * compares prices of pets
 * 
 * @author Simone Tezzo
 *
 */

public abstract class Pets implements Comparable<Pets> {

    private double price;
    private String name;
 // private int stock;
    
    
    
    
    /** 
     * constructor
     * @param price, name, stock
     * @return price, name, stock
     */
    public Pets(double price, String name) {

        this.price = price;
        this.name = name;
     // this.stock = stock;
    
    }

    
    /**
     * getter and setter for Price
     * @return price
     */
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * getter and setter for name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** 
     * getter and setter for stock
     * @return stock
     
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    */

    // comparing different prices
    @Override
    public int compareTo(Pets o) {

        double aPrice = this.getPrice();
        double oPrice = this.getPrice();

        System.out.println("Pet Prices: " + aPrice + " and " + oPrice);

        if (aPrice > oPrice) {
            return 1;
        }
        else if (aPrice < oPrice) {
            return -1;
        }
        else {
            return 0;
        }

    }
}