package strategy;

//import java.util.ArrayList;

public class DogRobot extends Robot {

    public DogRobot(String name)
    {
        super(name);
        this.moveBehavior = new CrawlBehavior();
        character.add("++o");
    }

    public String toString()
	{
		return this.name+" is a dog Robot";
	}
    
}
