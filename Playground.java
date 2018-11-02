
/**
 * A class representing a playground containing people.
 */
public class Playground
{ 

    /**
     * Add people to the playground and perform some actions
     */
    public void run()
    {
        // Create two instances of the Person class
        Person person1 = new Person("Sean", "");
        Person person2 = new Person("Michael", "");
        
        // using the references to each instance compare names
        if(person1.getFirstName() == person2.getFirstName())
        {
            System.out.println("Same name!");
        }
        else
        {
            System.out.println("Different name!");
        }
    }
    
    
    /**
     * From lab4: Add people to the playground and perform some actions
     */
    public void runLab4()
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
        if(age > 65)
        {
            System.out.println("Person is old!");
        }
        else
        {
            System.out.println("Person is young!");
        }
    }
}
