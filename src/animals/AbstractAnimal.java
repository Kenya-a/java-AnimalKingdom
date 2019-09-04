package animals;

public abstract class AbstractAnimal
{
    public static int maxID = 0;
    
    int id;
    String name;
    int Discovery;

    public AbstractAnimal( String name, int Discovery)
    {
        // maxID ++;
        // id = maxID;
        this.name = name;
        this.Discovery = Discovery;
    }

    public String eat()
    {
        return "Yumm..Food";
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public int getDiscovery()
    {
        return Discovery;
    }

    @Override
    public String toString()
    {
        return "Name: " + getName() + " Year Discovered: "  + getDiscovery() + "\n";
    }

    public abstract String move();

    public abstract String breath();

    public abstract String reproduce();
}
