package singleton;
import java.util.ArrayList;

public class ClothingItem
{
   private String name;
   private String color;
   private ClothingPart part;
   private ArrayList<Season> seasons;

   public ClothingItem(String name, ClothingPart part, String color)
    {
        this.name = name;
        this.seasons = new ArrayList<Season>();
        this.color = color;
        this.part = part;
    }
    public boolean hasSeason(Season season)
    {
        for(Season Seasonn : seasons)
        {
            if(Seasonn == season)
            return true;
        }
        return false;
    }

    public void addSeason(Season season)
    {
       seasons.add(season);
    }
    public String toString()
    {
        return color + " " + name;
    }

}