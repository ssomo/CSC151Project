//Create a policy holder class that will represent a person that 
//is associated with an insurance policy.

//Move the appropriate fields and methods of the Policy class into the PolicyHolder class 
//(Hint: the fields and methods you move into the PolicyHolder class should be directly associated with a policy holder).

//Add a toString method to both the Policy and PolicyHolder classes.

//Add a static field that is used to keep track of the number of Policy objects that have been created.

//Demonstrate proper use of class collaboration in such a way that a Policy has a PolicyHolder.

//Alter the Demo class to implicitly call the toString method you created in Step 2 when outputting information about the Policy objects.

//The demo program should display the number of Policy objects that were created, the number of Policyholders that are smokers, and the number of Policyholders that are non-smokers.
public class PolicyHolder //aggregate class
{
   //declare fields
   private String firstName;
   private String lastName;
   private String smokingStatus;
   private double weight; 
   private double height;
   private int age;
   
   //no-arg constructor that explicitly intializes all fields
   public PolicyHolder()
   {
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      weight = 0;
      height = 0;
   }
   
   //constructor that accepts arguments for each field
   //using the "this" reference variable to overcome shadowing of a field name by a parameter name
   public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.height = height;
      this.weight = weight;
   }
   
   //copy constructor that returns a coy of the policyholder object
   public PolicyHolder(PolicyHolder obj2)
   {
      this.firstName = obj2.firstName;
      this.lastName = obj2.lastName;
      this.age = obj2.age;
      this.smokingStatus = obj2.smokingStatus;
      this.height = obj2.height;
      this.weight = obj2.weight; 
   }
   
   //setters
   public void setFirstName(String firstName)
   {
      this.firstName = firstName;
   }
   
   public void setLastName(String lastName)
   {
      this.lastName = lastName;
   }
   
   public void setAge(int age)
   {
      this.age = age;
   }
   
   public void setSmokingStatus(String smokingStatus)
   {
      this.smokingStatus = smokingStatus;
   }
   
   public void setHeight(double height)
   {
      this.height = height;
   }
   
   public void setWeight(double weight)
   {
      this.weight = weight;
   }
   
   //getters
   public String getFirstName()
   {
      return firstName;
   }
   
   public String getLastName()
   {
      return lastName;
   }
   
   public int getAge()
   {
      return age;
   }
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }

   public double getHeight()
   {
      return height;
   }
   
   public double getWeight()
   {
      return weight;
   }

    /**
   The calculateBMI method calculates and returns the BMI of the policyholder
   @return (weight * 703) / (height)^2
   */
   
   public double getBMI()
   {
      final double CONVFACTOR = 703;
      
      return (weight * CONVFACTOR) / (height * height);
   }


   //Create a toString method
   public String toString()
   {
      return String.format("Policyholder's First Name: " + firstName +
                           "\nPolicyholder's Last Name: " + lastName +
                           "\nPolicyholder's Age : " + age + 
                           "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
                           "\nPolicyholder's Height: " + height +
                           "\nPolicyholder's Weight: " + weight +
                           "\nPolicyholder's BMI: %.2f", getBMI());
       
   }

   
   
   
   
   
   
   
}