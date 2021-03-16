/* This program demonstrates the policy class
*/
import java.io.*; //for file I/O classes
import java.util.Scanner; //needed for the scanner class

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      File file = new File("PolicyInformation.txt"); //opens the file
      Scanner inputFile = new Scanner(file); //uses scanner class to read the file
      
      //Declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
     
      //create a while loop to read the lines from the file
      while(inputFile.hasNext())
      {
         policyNumber = inputFile.nextLine(); 
         providerName = inputFile.nextLine();
         firstName = inputFile.nextLine();
         lastName = inputFile.nextLine();
         age = inputFile.nextInt();
         smokingStatus = inputFile.next();
         height = inputFile.nextDouble();
         weight = inputFile.nextDouble();
         inputFile.next(); //consume the newline character
         if(inputFile.hasNext())
         {
             inputFile.next();//this handles the end of the file to avoid an exception}
         }


      //create a Policy object
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
      
      //put a blank line before the output
      System.out.println();
      
      //display information about the Policy
      System.out.println("Policy Number: " + policy.getPolicyNumber());
      System.out.println("Provider Name: " + policy.getProviderName());
      System.out.println("Policyholder's First Name: " + policy.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy.getLastName());
      System.out.println("Policyholder's Age: " + policy.getAge());
      System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
      System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");
      System.out.printf("Policyholder's BMI: %.2f\n", policy.getBMI());
      System.out.printf("Policy Price: $%.2f\n", policy.getPrice());
      
      }
      
      inputFile.close();
      
   }
   
}
