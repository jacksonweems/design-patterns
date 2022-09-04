package strategy;
/**
 * Represents a human robot in code
 */
public class HumanRobot extends Robot {
/**
 * 
 */

    public HumanRobot(String name)
    {
        super(name);
        this.moveBehavior = new WalkBehavior();   
        character.add(" o");  
        character.add("-|-"); 
        character.add("/ \\");     
    }
/**
 * Creates a string representation of the robot 
 * @return the name and type of robot.
 */
    public String toString()
	{
		return this.name+" is a Human Robot";
	}
    
}