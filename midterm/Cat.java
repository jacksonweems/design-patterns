package midterm;

public class Cat {
    public String title;
    private static String sound;

    public Cat(String title, String sound)
    {
        this.title = title;
        this.sound = sound;
    }

    public String toString() 
    {
        return title + " make a " + sound + " sound.";
    }

    public static int sumPrimes(int num)
    {
        int sum = 0;

        for(int i = 2; i<= num; i++)
        {
            int numDivisible = 0;

            for(int j = 1; j <= i; j++)
            {
                if(i % j ==0)
                numDivisible++;
            }
            if (numDivisible <= 2) 
            {
                sum+=i; 
            }     
        }
         return sum;
    }

    public static void main(String[] args)
    {
     System.out.println(sumPrimes(1));
    }
}
