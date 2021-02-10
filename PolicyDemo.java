/* This program demonstrates the policy class
*/
import java.util.Scanner; //needed for the scanner class

public class PolicyDemo{
   public static void main(String[] args){
      
      //Needed for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Access methods from policy class
      Policy policy = new Policy();
      policy.setBMI(calculateBMI);
      
      //Create a single instance of the policy class using the constructor that accepts arguments  
      Policy policy1 = new Policy(1234, "State Farm", "John", "Doe", 24, "non-smoker", 62.0, 250.5);
     
      System.out.print("Please enter the Policy Number: ");
      keyboard.nextInt();
      
      System.out.print("Please enter the Provider Name: ");
      keyboard.next();
      keyboard.nextLine();
      
      System.out.print("Please enter the Policyholder’s First Name: ");
      keyboard.next();
      
      System.out.print("Please enter the Policyholder’s Last Name: ");
      keyboard.next();
      
      System.out.print("Please enter the Policyholder’s Age: ");
      keyboard.nextInt();
      
      System.out.print("Please enter the Policyholder’s Smoking Status (smoker/non-smoker): ");
      keyboard.next();
      
      System.out.print("Please enter the Policyholder’s Height (in inches): ");
      keyboard.nextDouble();
      
      System.out.print("Please enter the Policyholder’s Weight (in pounds): ");
      keyboard.nextDouble(); 
      
      System.out.println();
      System.out.println();
      
      //Display information about the policy
      System.out.println("Policy Number: " + policy1.getPolicyNumber());
      System.out.println("Provider Name: " + policy1.getProviderName());
      System.out.println("Policyholder's First Name: " + policy1.getFirstName());
      System.out.println("Policyholder's Last Name: " + policy1.getLastName());
      System.out.println("Policyholder's Smoking Status: " + policy1.getStatus());
      System.out.println("Policyholder's Height: " + policy1.getHeight());
      System.out.println("Policyholder's Weight: " + policy1.getWeight());
      System.out.println("Policyholder's BMI: " + policy.getBMI(calculateBMI));
      System.out.printf("Policy Price: $%,.2f \n", baseFee + additionalFee);
      
   }
   
   
}
