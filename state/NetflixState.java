package state;

public class NetflixState implements State
{
    private TV tv;
    private String movies[] = {"- The Land Before Time","- Frozen","- The Little Mermaid", "- Ice Age"};
    private String tvShows[] = {"- Peppa Pig","- My Little Pony","- Garfield", "- Teenage Mutant Ninja Turtles"};
/**
 * netflix state
 * @param tv tv
 */
    public NetflixState(TV tv)
    {
        this.tv = tv;
    }
/**
 * String for home state
 */
    public String pressHomeButton()
    {
        tv.setState(tv.getHomeState());
        return (" Loading the home screen...");      
    }
/**
 * String for netflix state
 */
    public String pressNetflixButton() 
    { 	
        return (" We are already in Netflix.");		
	}
/**
 * String for hulu state
 */
    public String pressHuluButton() 
    { 	
		tv.setState(tv.getHuluState());
        return (" Loading Hulu...\n");	
	}
/**
 * String for movie state
 * loops and prints the movies in the array
 */
    public String pressMovieButton() 
    { 	
        System.out.println("Netflix Movies:");
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
        System.out.println("Netflix TV Shows:");
        for(String i : tvShows)
        {
            System.out.println(i);    
        }
        return "";
		
	}

}
