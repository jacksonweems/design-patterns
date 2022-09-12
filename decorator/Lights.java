package decorator;

public class Lights extends TreeDecorator {
    Tree tree;
  /**
 * Integrates the lights tree file
 */
    Lights(Tree tree)
    {
        super(tree.lines);
        integrateDecor(FileReader.getLines("decorator/txt/lights.txt"));
    }
    
}
