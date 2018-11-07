/**
 * Class to model a Playground
 *
 * Lab 5 Solution
 *
 * @author Gary Tong
 * @version 1.0
 */
public class Playground extends Object
{
    public static final int OLD_AGE = 65;

    /**
     * Simple method demonstrating external method calls through object references.
     */
    public void run()
    {
        Person p = new Person();

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        p.setFirstName("Gary");
        p.setLastName("Tong");
        p.setAge(32);
        p.setHeight(175.0);

        System.out.println(p.getFirstName());
        System.out.println(p.getLastName());
        System.out.println(p.getAge());
        System.out.println(p.getHeight());

        if(p.getAge() > OLD_AGE)
        {
            System.out.println("Person is old!");
        }
        else
        {
            System.out.println("Person is young!");
        }        
        
        Person p2 = new Person();      
        p2.setFirstName("Bob");
        
        if(p.getFirstName().equals(p2.getFirstName()))
        {
            System.out.println("Same Person!");
        }
    }
    
    public void playWithArrays()
    {
        // create an array of integers
        // the total size of the array is 10 elements
        // remember, arrays are 0-indexed
        int numbers[] = new int[10];

        // because arrays are 0-indexed, we are setting the first element here to the value of 5
        numbers[0] = 5;
        numbers[9] = 20; // set last element to value 20;

        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
//        System.out.println(numbers[10]); // this is an error at run time because we don't have anything at index 10; index 9 is our last element



        // arrays can be of reference types too, such as String
        String words[] = new String[10];
        words[0] = "Gary";
        
        System.out.println(words[0]);   // prints Gary
        System.out.println(words[5]);   // prints null because the default value of a reference is null

        // using a while loop to go through our array
        int index = 0;
        while (  index < words.length    ) // .length gives us the total size, which is 10
        {
            // we can access the value using the index
            System.out.println(words[index]);

            // make sure to increase the index or else we're in an infinite loop!
            index++;
        }



        // again, arrays can of reference types such as Person
        // create an array called people and it'll hold 5 Person references
        Person people[] = new Person[5];

        // the first reference will be an object instantiated by the default contructor
        // remember, the default value of a reference type is null
        // so people[1] through people[4] are null until we create new Person() and assign them accordingly
        people[0] = new Person();

        // using the first reference, the . operator allows us access to anything within scope.
        // here we mutate the first name
        people[0].setFirstName("Bob");

        // using the . operator, we can get access to first name
        System.out.println(people[0].getFirstName());

        // using a while loop we can loop through the entire array of Person references
        int i = 0;
        while(i < people.length)
        {
            // people[1] through people[4] are null because we havent't initialized them yet
            Person p = people[i];

            // that's why we should be checking if it's indeed null
            // and only if p is not null, we attempt to grab the first name
            if (p != null)
            {
                // grabbing the first name gives us a string back
                // which in turn means we can use methods exposed through the string class
                // one such method is toUpperCase()
                System.out.println(p.getFirstName().toUpperCase());
            }

            // lastly, increase the control!
            i++;
        }
    }
}













