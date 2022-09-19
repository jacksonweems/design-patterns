package factory;

public class FruitLoops extends Cereal{

    /**
 * Represents fruit loops in code
 */
    public FruitLoops(String name, double price) 
    {   
       super(name, price);
        price = 1.89;
        toys.add("Paw Patrol Stickers");
        toys.add("Bat Man ring");
        toys.add("Silly Putty");
        toys.add("Tiny car");
		
	}
    
    /**
 * Represents the specific preparations for the fruit loops
 */
    public String prepare()
    {
       return "  -Gather the grain /n -Shape into circles /n -Randomly color circles /n -Let circles dry";
    }
    
}
