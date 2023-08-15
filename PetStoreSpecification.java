import java.util. *;

public interface PetStoreSpecification {

    /**
     * update inventory by adding the given pets and their prices
     *
     * @param pets
     * @param price
     * @return
     */

    public void adoptionDrive (ArrayList<Pets> pets, double price);
        

    /**
     * calculate and return dollar amount for current inventory of pets 
     * that are in stock
     *
     * @return total in stock value
     */
    
    public double inventoryValue();

}