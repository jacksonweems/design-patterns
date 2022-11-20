package state;

public class TV {
   private State HomeState;
   private State NetflixState;
   private State HuluState;
   private State state;
     /**
      * represents the tv
      */
   public TV()
   {
        HomeState = new HomeState(this);
        NetflixState = new NetflixState(this);
        HuluState = new HuluState(this);
        state = HomeState;
   }
/**
 * String for the Home button
 * @return the state for HomeButton
 */
   public String pressHomeButton()
   {    
      return state.pressHomeButton();
   }
/**
 * String for Netflix
 * @return the state for Netflix
 */
   public String pressNetflixButton()
   {
      return state.pressNetflixButton();
   }
/**
 * String for Hulu
 * @return the state for Hulu
 */
   public String pressHuluButton()
   {
       return state.pressHuluButton();
   }
/**
 * String for the Movies
 * @return the state for Movies
 */
   public String pressMovieButton()
   {
       return state.pressMovieButton();
   }
/**
 * String for TV shows
 * @return the state for TV shows
 */
   public String pressTVButton()
   {
       return state.pressTVButton();
   }
/**
 * Sets the state
 * @param state state for the tv
 */
   public void setState(State state)
   {
         this.state = state;
         
   }
/**
 * Home state
 * @return home state
 */
   public State getHomeState()
   {
        return HomeState;
   }
/**
 * Netflix state
 * @return netflix state
 */
   public State getNetflixState()
   {
        return NetflixState;
   }
/**
 * Hulu state
 * @return hulu state
 */
   public State getHuluState()
   {
        return HuluState;
   }
}
