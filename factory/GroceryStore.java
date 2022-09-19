package factory;

public class GroceryStore {
    
    public Cereal createCereal(String type)
    {
        Cereal cereal= createCereal(type);
        cereal.prepare();
        cereal.boxCereal();
        cereal.priceCereal();
        return cereal;
        
    }
}
