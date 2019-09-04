package animals;

public class Mammals extends AbstractAnimal
{
    public Mammals(String name, int Discovery)
    {
        super(name, Discovery);
    }

    @Override
    public String move()
    {
        return "walk";
    }

    @Override
    public String breath()
    {
        return "lungs";
    }

    @Override
    public String reproduce()
    {
        return "live births";
    }
}