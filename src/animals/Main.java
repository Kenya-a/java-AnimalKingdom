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
        myList.add(new Mammals("Koala", 1816));
        myList.add(new Mammals("Sloth", 1804));
        myList.add(new Mammals("Armadillo", 1758));
        myList.add(new Mammals("Raccoon", 1758));
        myList.add(new Mammals("BigFood", 2021));

        //Fish
        myList.add(new Fish("Salmon", 1758));
        myList.add(new Fish("Catfish", 1817));
        myList.add(new Fish("Perch", 1758));

        //Birds
        myList.add(new Birds("Pigeon", 1837));
        myList.add(new Birds("Peacock", 1821));
        myList.add(new Birds("Toucan", 1758));
        myList.add(new Birds("Parrot", 1824));
        myList.add(new Birds("Swan", 1758));
        
        

        //1.List all the animals in descending order by year named
        System.out.println("*** Sorting in Descending Order of Discovery Year ***");
        myList.sort((a1, a2) -> a1.getDiscovery() - a2.getDiscovery());
        myList.forEach(animal -> System.out.println(animal.getName() + ":" + animal.getDiscovery()));

        System.out.println();



        //2. List all the animals alphabetically.
        System.out.println("*** Sorting in Alphabetical Order ***");
        myList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
        myList.forEach(animal -> System.out.println(animal.getName()));
        System.out.println();


        //3.List all the animals order by how they move
        System.out.println();
        System.out.println();

        //4.List only those animals the breath with lungs
        System.out.println();
        System.out.println();

        //5.List only those animals that breath with lungs and were named in 1758
        System.out.println();
        System.out.println();

        //6.List only those animals that lay eggs and breath with lung
        System.out.println();
        System.out.println();

        //7.List alphabetically only those animals that were named in 1758
        System.out.println();
        System.out.println();


    }


}