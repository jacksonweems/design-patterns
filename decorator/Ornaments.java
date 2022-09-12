package decorator;

public class Ornaments extends TreeDecorator {
    Tree tree;
  /**
 * Integrates the ornaments text file
 */
    Ornaments(Tree tree)
    {
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/ornaments.txt"));
    }  
}
