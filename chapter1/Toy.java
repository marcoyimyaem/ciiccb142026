package chapter1;

/**
 * Represents a toy item in the inventory
 * <p>
 * Each toy has a name, brand, price, quality in stock,
 * and a size classification.
 * </p>
 * <ul>
 *      <li><b>name</b> - Name of the toy (e.g., "Gundam")</li>
 *      <li><b>brand</b> - Manufacturer or brand (e.g, "Lego")</li>
 *      <li><b>price</b> - Selling price of the toy</li>
 *      <li><b>quantity</b> - Number of units available</li>
 *      <li><b>size</b> - Size category (e.g., 'S','M','L')</li>
 *  </ul>
 * @author Marc Yim
 * @version 1.0
 * @since 1.0
 */

public class Toy{
    /** Name of the Toy */
    String name;

    /** Manifacturer or brand */
    String brand;

    /** Selling price of the toy */
    double price;

    /** Number of available units */
    int quantity;

    /** Size category (e.g 'S','M','L') */
    char size;

    /** Set the toy objects price
     * 
     * @param price the new price of the toy
     */
    void setPrice(double price){
        this.price = price;
    }
     static public void main(String[] wdfwersdf) {
        Toy toy1 = new Toy();
        toy1.name ="Rage pink";
        toy1.brand = "Lab Vuvu";
        toy1.price = 4500;
        toy1.quantity = 12;
        toy1.setPrice((toy1.price*0.5));
        System.out.println(toy1.price);
        
    }
}
class Fruit{

}
class Fruit2{
    
}
class Fruit3{
    
}
 class Fruit4{
    public static void main(String[] args) {
        System.out.println("I am Fruit 4");
        Fruit3 f3 = new Fruit3();
    }
}