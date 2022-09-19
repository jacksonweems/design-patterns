package factory;



public class FrostedFlakes extends Cereal {
       /**
 * Represents Frosted flakes in code
 */
    public FrostedFlakes(String name, double price) 
    {   
       super(name, price);
        price = 2.99;
        toys.add("Spider man Tattoo");
        toys.add("Barbie Tattoo ");
        toys.add("Snap Bracele");
        toys.add("Happy Feet Figurine");
		
     }
       /**
 * Represents the specific preparations for the frosted flakes
 */
    public String prepare()
    {
       return "  - Gather the grain /n - Shape into flakes /n -Sprinkle with frosting";
    }
}
