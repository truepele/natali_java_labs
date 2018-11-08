
/**
 * A class representing a playground containing people.
 */
public class Playground
{ 
    public static final int OLD_AGE = 65;
    
    /**
     * Simple method demonstrating external method calls through object references.
     */
    public void run()
    {
        // Create an instance of the Person class
        Person person = new Person();
        
        // print out the default Person properties via the accessor method
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());        
        System.out.println(person.getHeight());
        
        // mutate the Person properties via the mutator method
        person.setFirstName("Michael");
        person.setLastName("Smith");
        person.setHeight(150.5);
        person.setAge(30);
        
        // print out the newly mutate properties via the accessor method
        System.out.println(person.getFirstName());
        System.out.println(person.getLastName());
        System.out.println(person.getAge());        
        System.out.println(person.getHeight());
        
        // using the accessor methods, grab the age property of the Person
        double age = person.getAge();
        if(age > OLD_AGE)
        {
            System.out.println("Person is old!");
        }
        else
        {
            System.out.println("Person is young!");
        }
        
        
        // Lab 5:
        
        // Create two instances of the Person class
        Person person2 = new Person("Sean", "Doe");
        
        // using the references to each instance compare names
        if(person.getFirstName().equals(person2.getFirstName()))
        {
            System.out.println("Same name!");
        }
        else
        {
            System.out.println("Different name!");
        }
    }
}
