package decorator;
import java.util.ArrayList;

public class ChristmasTree extends Tree{

    public ChristmasTree()
    {
        super(FileReader.getLines("decorator/txt/tree.txt"));
       // Tree.toString();
    }
   
   /*public String toString()
	{
		return lines;
	}*/
}
