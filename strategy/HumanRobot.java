package strategy;

public class HumanRobot extends Robot {

    public HumanRobot(String name)
    {
        super(name);
        moveBehavior = new WalkBehavior();   
        character.add(" o");  
        character.add("-|-"); 
        character.add("/ \\");     
    }

    public String toString()
	{
		return this.name+" is a Human Robot";
	}
    
}