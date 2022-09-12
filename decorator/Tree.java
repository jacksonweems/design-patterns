package decorator;
import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines)
    {
        this.lines = lines;
    }

        /**
 * Loops through and displays a tree
 */
    public String toString()
    {
        String myLines = new String();
        for(String line : lines)
        {
            myLines += line + " \n";
        }
        return myLines;
    }

}