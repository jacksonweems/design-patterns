package decorator;

public class Star extends TreeDecorator{
    Tree tree;
   /**
 * Integrates the star text file
 */
    Star(Tree tree)
    {
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/star.txt"));
    }
}
