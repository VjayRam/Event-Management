

public class MenuItem
{
    //definition of menu item type
    public final static int MOVIE = 1;
    public final static int CONCERT = 2;
    public final static int COMEDY = 3;
    public final static int DRAMA = 4;
    
    private int     ID;
    private String  name;
    private byte    type;
    private double  price;
    private String  description;
    
    private byte     state;
    private double  promotion_price;
    public final static byte PROMOTION_ITEM = 1;
    public final static byte SEASONAL_ITEM = 2;
    
    public MenuItem(int newID, String newName, double newPrice, byte newType, String newDescription)
    {
        this.ID = newID;
        this.name = newName;
        this.price = newPrice;
        this.type = newType;
        this.description = newDescription;
        this.state = 0;
        this.promotion_price = 0;
    }

    //setter
    public void setName( String newName)
    {
        this.name = newName;
    }
    
    public void setPrice( double newPrice)
    {
        this.price = newPrice;
    }
    
    public void setType( byte newType)
    {
        this.type = newType;
    }

    public void setDescription( String newDescription)
    {
        this.description = newDescription;
    }
    
    public void setState( byte newState, double tempPrice)
    {
        this.state = newState;
        this.promotion_price = tempPrice;
    }
    
    public void resetState()
    {
        this.state = 0;
        this.promotion_price = 0;
    }
    
    
    //getter
    int getID()
    {
        return this.ID;
    }
    
    String getName()
    {
        return this.name;
    }
    
    double getPrice()
    {
        if(this.state != 0 && this.promotion_price != 0)
        {
            return this.promotion_price;
        }
        else
            return this.price;
    }
    
    double gerRegularPrice()
    {
        return this.price;
    }
    
    String getDescription()
    {
        return this.description;
    }
    
    byte getType()
    {
        return this.type;
    }
    
    byte getState()
    {
        return this.state;
    }
}
