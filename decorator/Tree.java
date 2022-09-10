package decorator;
import java.util.ArrayList;

public abstract class Tree {
    protected ArrayList<String> lines;

    public Tree(ArrayList<String> lines)
    {
        //this.lines = new ArrayList<String>();
        this.lines = lines;
    }

    public String toString()
    {
       for(int j = 0; j < lines; j++)
       {

       }
    }

}