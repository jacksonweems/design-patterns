package strategy;

public class iRobot extends Robot {

    //private String name;

    public iRobot(String name)
    {
        super(name);
        moveBehavior= new RunBehavior();
        character.add(" ()");
        character.add(">|<");
        character.add("/ \\");


    }

    public String toString()
	{
		return this.name+" is an iRobot";
	}
    
}
