package animals;

import java.util.*;


public class Main
{
    public static void printAnimals(ArrayList<AbstractAnimal> animal, AnimalTest test)
    {
        for (AbstractAnimal a: animal)
        {
            if (test.test(a))
            {
                System.out.println("Name: " +  a.getName() + " Reproduce: " + a.reproduce() + " Move: " + a.move() + " Breath: " + a.breath() + " Discovered: " + a.getDiscovery());
            }
        }
    }

    public static void main(String[] args)
    {
        //Animals Array
        ArrayList<AbstractAnimal> myList = new ArrayList<AbstractAnimal>();

        //Mammals
        myList.add(new Mammals("Panda", 1869));
        myList.add(new Mammals("Zebra", 1778));
        myList.add(new Mammals("Koala", 1778));
        myList.add(new Mammals("Sloth", 1778));
        myList.add(new Mammals("Armadillo", 1778));
        myList.add(new Mammals("Raccoon", 1778));
        myList.add(new Mammals("BigFood", 1778));

        


        //1. List all the animals alphabetically.
        System.out.println("*** Sorting in Alphabetical Order ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(animal -> System.out.println(animal.getName()));
      



    }


}