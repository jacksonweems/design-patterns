package state;

public class HomeState implements State
{
    private TV tv;
/**
 * Home state
 * @param tv tv
 */
    public HomeState(TV tv)
    {
        this.tv = tv;
    }
/**
 * String for home state
 */
    public String pressHomeButton()
    {
        return (" TV is already on the home screen.\n");  
    }
/**
 * String for netflix state
 */
    public String pressNetflixButton() 
    { 	
		tv.setState(tv.getNetflixState());
        return (" Loading Netflix...\n");
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
 */
    public String pressMovieButton() 
    { 	
        return (" Home: You must pick an app to show movies.");	
	}
/**
 * String for TV state
 */
    public String pressTVButton() 
    { 	
        return (" Home: You must pick an app to show tv shows.");	
	}

}
