/**
 *
 * @author Adam Whaley and Simone Tezzo
 */
 
public class ExoticPet extends Pets {
    // characteristics for exotic pets
    private String species;
    private String sex;
    private int age;
    private double weight;
    private int ID;
    
    
    public ExoticPet(String name, String species, String sex, int age, double weight, int ID, double price) {

        super(price, name); // inherits from Pets class
        this.species = species;
        this.sex = sex;
        this.age = age;
        this.weight = weight;
        this.ID = ID;
        
    }

    // getters and setters
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    
    
}
