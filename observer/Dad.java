package observer;
import java.util.Random;

public class Dad implements Observer{
    private Subject baby;
    private Random rand;

    /**
 * Represents Dad in code
 */
    public Dad(Subject baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
    * Updates Cry and randomly selects Dad's response
    */
    public void update(Cry cry)
    {
        String [] response = {"Dad puts a pillow over his head", "Dad nudges mom", "Dad screams .... aaaaa"};
        rand = new Random();
        int pick = rand.nextInt(response.length);
        System.out.println(response[pick]);

    }
    
}
