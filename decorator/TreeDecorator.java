package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
   // public abstract String toString();

   public TreeDecorator(ArrayList<String> lines)
    {
        super(lines);
    }
    protected void integrateDecor(ArrayList<String> decor)
    {

    }
    
}
