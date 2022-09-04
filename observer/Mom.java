package observer;

public class Mom implements Observer{
    private Subject baby;

    /**
    * Represents Mom in code
    */
    public Mom(Subject baby)
    {
        this.baby = baby;
        baby.registerObserver(this);
    }

    /**
    * Updates Cry and Mom's response based on the type of cry
    */
    public void update(Cry cry)
    {
        switch(cry)
        {
            case ANGRY:
                System.out.println("Mom hugs "+ ((Baby)baby).getName());
                ((Baby)baby).receiveLove();
                break;
            
            case HUNGRY:
                System.out.println("Mom feeds "+ ((Baby)baby).getName());
                ((Baby)baby).eat();
                break;

            case WET:
                System.out.println("Mom changes "+ ((Baby)baby).getName());
                ((Baby)baby).getChanged();
                break;
        }
    
    }

}
