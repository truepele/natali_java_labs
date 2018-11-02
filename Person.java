
 /**
  * This class models a Person
  *
  * @author Nataliia Pinchuk
  * @version 10/16/2018
  */
 public class Person
 { 
     // Number of instances
     public static int counter = 0;
     
     private String firstName;
     private String lastName;
     private int age;
     private double height;
     
     
     /**
      * Default constructor for Person
      */
    public Person()
    {
        counter++;
        firstName = "John";
        lastName = "Doe";
        age = 1;
        height = 1.0;
    }
    
    
     /**
      * Constructor for Person
      * 
      * 
      * @param _firstName
      * @param _lastName
      */
    public Person(String _firstName, String _lastName )
    {
        counter++;

        setFirstName(_firstName);
        setLastName(_lastName);
    }
    

     /**
      * Constructor for Person
      * 
      * 
      * @param _firstName The first name of the Person.
      * @param _lastName The last name of the Person.
      * @param _age The age of the Person.
      * @param _height The height of the Person.
      */
    public Person(String _firstName, String _lastName, int _age, double _height)
    {   
        counter++;
        
        setAge(_age);
        setHeight(_height);
        setFirstName(_firstName);
        setLastName(_lastName);
    } 
       
    
    public static String getNumberOfTimesCreated()
    {
        switch(counter)
        {
            case 0:
                return "none";
            case 1:
                return "once";
            case 2:
                return "twice";
            default:
                return "too many times!";            
        }        
    }
    
    /**
     * Mutate the firstName instance variable.
     *
     * @param _firstName The new firstName.
     */
    public void setFirstName(String _firstName)
    {
        if(_firstName == null || _firstName.isEmpty())
        {            
            _firstName = "John";
            System.out.println("_firstName parameter supplied is invalid. firstName instance variable set to default value \"" + _firstName + "\"");
        }
        
        firstName = _firstName;
    }
    
    
    /**
     * Return the firstName.
     *
     * @return The firstName of the Person.
     */
    public String getFirstName()
    {
        return firstName;
    }
        
    
    /**
     * Mutate the lastName instance variable.
     *
     * @param _lastName The new lastName.
     */
    public void setLastName(String _lastName)
    {
        if(_lastName == null || _lastName.isEmpty())
        {
            _lastName = "Doe";
            System.out.println("_lastName parameter supplied is invalid. lastName instance variable set to default value \"" + _lastName + "\"");
        }
        
        lastName = _lastName;
    }
    
    
    /**
     * Return the lastName.
     *
     * @return The lastName of the Person.
     */
    public String getLastName()
    {
        return lastName;
    }
        
    
    /**
     * Set the Person's age to a new value.
     *
     * Must be a number within 0 and 100, inclusive.
     *
     * @param _age The new age.
     */
    public void setAge(int _age)
    {
        if(_age >= 0 && _age <= 100)
        {
            age = _age;
        }        
    }
  
    
    /**
     * @return The current age of the Person.
     */
    public int getAge()
    {
        return age;
    }
    
    
    
    /**
     * Set the Person's height to a new value.
     *
     * Must be a number within 0 and 200, inclusive.
     *
     * @param _height The new height.
     */
    public void setHeight(double _height)
    {
        if(_height >= 0 && _height <= 200)
        {
            height = _height;        
        }
    }
    
    
    /**
     * @return The current height of the Person.
     */
    public double getHeight()
    {
        return height;
    }
       
    
    /**
     * @return details on Person's properties.
     */
    public String getDetails()
    {
        return "Hello my name is " +  firstName + " " + lastName + " and my age is " + age;
    }
    
    
}
    


        




        
        
    

   
    

