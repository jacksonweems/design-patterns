package decorator;

public class ChristmasTree extends Tree{
   /**
 * Represents the Christmas tree in code
 */
    public ChristmasTree()
    {
        super(FileReader.getLines("decorator/txt/tree.txt"));
    }
}
