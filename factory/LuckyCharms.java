package factory;

public class LuckyCharms extends Cereal {

    /**
 * Represents lucky charms in code
 */
    public LuckyCharms(String name, double price) 
    {   
       super(name, price);
        price = 1.55;
        toys.add("My Little Pony Stickers");
        toys.add("Elsa ring ");
        toys.add("Play doe");
        toys.add("Tiny truck");
		
    }
    
    /**
 * Represents the specific preparations for the lucky charms
 */
    public String prepare()
    {
       return "  -Gather the grain /n -Shape into X's and O's /n -Create Marshmallow shapes /n -Mix grain and marshmallows";
    }
}

    

