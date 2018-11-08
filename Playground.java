
/**
 * A class representing a playground containing people.
 * 
 * Lab 6
 *
 * @author Nataliia Pinchuk
 * @version 11/7/2018
 */
public class Playground
{ 
    public static final int OLD_AGE = 65;    
    private Person[] personArray = new Person[5];
    
    /**
     * Simple method to exercise knowledge around arrays and while loops
     */
    public void addPeople()
    {
        personArray[0] = new Person();
        personArray[0].setAge(10);
        
        personArray[1] = new Person();
        personArray[1].setAge(15);
        
        personArray[2] = new Person();
        personArray[2].setAge(23);
        
        personArray[3] = new Person();
        personArray[3].setAge(38);
        
        personArray[4] = new Person();
        personArray[4].setAge(28);
                
        int total = 0;
        int count = 0;        
        
        while(count < personArray.length)
        {
            total += personArray[count].getAge();
            count++;
        }
        
        double average = total / count;
        
        System.out.println("Average age is: " + average);    
    }
    
    
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
