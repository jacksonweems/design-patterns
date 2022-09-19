package factory;

import java.util.ArrayList;
import java.util.Random;

   /**
 * Represents Cereal in code
 */
public abstract class Cereal {
    protected String name;
    protected double price;
    protected ArrayList<String> toys = new ArrayList<String>();


    public Cereal(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    public String prepare() 
    {
		return "Preparing the " + this.name;
    }
   /**
 * prints the boxing of the cereal
 */
    public String boxCereal()
    {
        return "Boxing the " + this.name + "/n - Drawing fun pictures of " + this.name + " on the box /n - Pouring the " + this.name + " into the box /n- Adding the suprise " + toys;     
    }  
       /**
 * prints the price of the cereal
 */
    public String priceCereal()
    {
        return " Putting the price tag of " +this.price + " on the " + this.name;
    }

}
