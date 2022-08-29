
package strategy;
import java.util.ArrayList;

public abstract class Robot {
    protected String name;
    protected ArrayList<String> character;
    protected MoveBehavior moveBehavior;

    public Robot(String name)
    {
        this.character = new ArrayList<String>();
        this.name=name;
    }

    public void setMoveBehavior(MoveBehavior moveBehavior)
    {
        moveBehavior=this.moveBehavior;
    }

    public String getName()
    {
        return name;
    }

    public void move()
    {
        moveBehavior.move(character);
    }

    public abstract String toString();
}
