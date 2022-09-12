package decorator;

import java.util.ArrayList;

public abstract class TreeDecorator extends Tree {
   /**
 * Represents the tree decorator in code
 */
   public TreeDecorator(ArrayList<String> lines)
    {
        super(lines);
    }
        /**
 * Loops through and adds the decorations to the Christmas tree
 */
    protected void integrateDecor(ArrayList<String> decor)
    {  
        for(int j = 0; j < decor.size(); j ++)
        {
            String line = "";

            for(int i = 0; i < lines.get(j).length(); i ++)
            {
                if(decor.get(j).substring(i, i+1).equals(" "))
                {
                    line += lines.get(j).substring(i, i + 1);
                }
                else
                {
                    line += decor.get(j).substring(i, i + 1);
                }
            }
            lines.set(j,line);
        }
    
    }
}
