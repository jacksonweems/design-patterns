package singleton;
import java.util.ArrayList;
import java.util.Random;

public class OutfitCreator 
{
    private ArrayList<ClothingItem> tops;
    private ArrayList<ClothingItem> bottoms;
    private ArrayList<ClothingItem> wholes;
    private Random rand;
    private static OutfitCreator outfitCreator;

    private OutfitCreator()
    {
    }

    public static OutfitCreator getInstance() 
    {
		if (outfitCreator == null) {
			System.out.println("Creating an outfit");
			outfitCreator = new OutfitCreator();
		}
		return outfitCreator;
	}

    public String getOutfit(Season season)
    {
        if(rand.nextInt(2)==0)
        {   
            String myLines = new String();
        for(ClothingItem top : tops)
        {
            myLines += top;
        }
            
            String myLiness = new String();
            for(ClothingItem bottom : bottoms)
        {
            myLiness += bottom;
        }
            String topBottom = myLines + myLiness;
            return topBottom;
        }
        else
        {
            String myLinesss = new String();
            for(ClothingItem whole : wholes)
            {
                myLinesss += whole;
            }
            return myLinesss;
        }
    }
}
