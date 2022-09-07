package observer;
import java.util.ArrayList;
import java.util.Random;

public class Baby implements Subject{
    private ArrayList<Observer> observers;
    private String name;
    private Random rand;

    /**
    * Represents Baby in code
    */
    public Baby(String name)
    {
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
    * Shows the name of the Baby
    */
    public String getName()
    {
        return name;
    }

    /**
    * Randomly selects a response when the Baby receives love
    */
    public void receiveLove()
    {
        String [] love = {" feels appreciated and loved.", " pushes everyone away and continues to cry."};
        rand = new Random();
        int pick = rand.nextInt(love.length);
        System.out.println(this.name+love[pick]);

    }

    /**
    * Randomly selects a response when the Baby eats
    */
    public void eat()
    {
        String [] eat = {" has a happy full tummy.", " throws all his food on the floor."};
        rand = new Random();
        int pick = rand.nextInt(eat.length);
        System.out.println(this.name+eat[pick]);
    }

    public void getChanged()
    {
        System.out.println(this.name+" is having a diaper change");
    }

    public void registerObserver(Observer observer) 
    {
		observers.add(observer);
    }

    public void removeObserver(Observer observer) 
    {
		observers.remove(observer);	
    }

    public void notifyObservers(Cry cry)
    {
		for(Observer observer : observers) 
        	{
			observer.update(cry);
		}
    }

    public void angryCry()
    {
        System.out.println("Waaaaaaaaaa " +this.name+" is feeling abandoned and angry.");
        notifyObservers(Cry.ANGRY);
    }

    public void hungryCry()
    {
        System.out.println("Neh Neh Neh! " +this.name+" is starving.");
        notifyObservers(Cry.HUNGRY);
    }

    public void wetCry()
    {
        System.out.println("Aaaaaaaa! " +this.name+" is WET!.");
        notifyObservers(Cry.WET);
    }
    
}

