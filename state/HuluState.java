package state;

public class HuluState implements State
{
    private TV tv;
    private String movies[] = {"- Cars","- Cinderella","- Wall-E","- ET"};
    private String tvShows[] = {"- Sesame Street","- Care Bears","- Looney Toons"};
/**
 * hulu state
 * @param tv tv
 */
    public HuluState(TV tv)
    {
        this.tv = tv;
    }
/**
 * String for home state
 */
    public String pressHomeButton()
    {
        tv.setState(tv.getHomeState());
        return (" Loading the home screen...\n");
        
    }
/**
 * String for netflix state
 */
    public String pressNetflixButton() 
    { 	
        return (" Loading Netflix...\n");		
	}
/**
 * String for hulu state
 */
    public String pressHuluButton() 
    { 	
		tv.setState(tv.getHuluState());
        return (" We are aleady in Hulu.");
		
	}
/**
 * String for movie state
 * loops and prints the movies in the array
 */
    public String pressMovieButton() 
    { 	
        System.out.println("Hulu Movies:");
        for(String i : movies)
        {
            System.out.println(i);              
        }
        return "";
	}
/**
 * String for TV state
 * loops and prints the tv shows in the array
 */
    public String pressTVButton() 
    { 	
        System.out.println("Hulu TV Shows:");
        for(String i : tvShows)
        {
            System.out.println(i);   
        }
        return "";
		
	}

}
