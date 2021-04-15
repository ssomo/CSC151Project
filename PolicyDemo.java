/* This program demonstrates the policy class
*/
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner; //needed for the scanner class

public class PolicyDemo
{
   public static void main(String[] args) throws IOException
   {
      
      //Declare variables
      String policyNumber = "";
      String providerName = "";
      String firstName = "";
      String lastName = "";
      int age = 0;
      String smokingStatus = "";
      double height = 0;
      double weight = 0;
      int numSmokers = 0;
      String fileInput = "";
      
      //ArrayList to store Policy objects
      ArrayList<Policy> policyList = new ArrayList<Policy>();
      
      /*The book uses the "throws IOException" option in the main method header. In this exercise we use a "try" and "catch" process. We "try" to open the file and process it, but if something goes wrong, 
        an IOException will be "thrown" and we can "catch" it and deal with the problem. By taking this approach instead of adding a "throws IOException" clause to the main method header, we can 
        gracefully handle problems related to reading the file without having our program crash. If a problem occurs while processing the file, the IOException is immediately "thrown", the code 
        immediately jumps to the "catch" block of code. The message in the "catch" block will display. */
      try
      {
         //create and open the file
         File file = new File("PolicyInformation.txt");
         Scanner inputFile = new Scanner(file);
         
         //process all information in the file
         while(inputFile.hasNext())
         {
            //"Parsing" way of reading input
            //We read each line of input as a string and convert it to other data types when required
            //See comments at the end of the code for an alternate way to read the data without parsing
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            fileInput = inputFile.nextLine();
            age = Integer.parseInt(fileInput);//convert the age to an int
            smokingStatus = inputFile.nextLine();
            fileInput = inputFile.nextLine();
            height = Double.parseDouble(fileInput);//convert the height to a double
            fileInput = inputFile.nextLine();
            weight = Double.parseDouble(fileInput);//convert the weight to a double
            
            //make sure we haven't hit the end of the file before trying to skip the blank line
            if(inputFile.hasNext())
               inputFile.nextLine();
             
            //create a PolicyHolder and Policy object and add it to our ArrayList
            policyList.add(new Policy(policyNumber, providerName, new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight)));
            
            /**
            is also acceptable...
            PolicyHolder p = new PolicyHolder(firstName, lastName, age, smokingStatus, height, weight);
            policyList.add(new Policy(policyNumber, providerName, p));
            */
         
      }

      
      //print out information about each Policy object
         for(Policy policy : policyList)
         { 
            //display information about the Policy
            System.out.println(policy);
            System.out.println();
            if(policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
               numSmokers++;
           
           
         }
         
         //print out the number of Policy objects
         System.out.println("There were " + Policy.numOfPolicies + " Policy objects created.");
         
      
         //print out the number of smokers and non-smokers
         System.out.println("The number of policies with a smoker is: " + numSmokers);
         System.out.println("The number of policies with a non-smoker is: " + (policyList.size() - numSmokers) );
      }//close the "try" block of code 
      catch(IOException ex)//If something goes wrong, an IOException is "thrown" to us, and we "catch" it and deal with it
      {
         //use the getMessage method of the exception we "caught" to print out it's message about what went wrong
         System.out.println("Something went wrong reading the file: " + ex.getMessage());
      }
            
   }
   
}

 /* Alternate way of reading input without parsing
            policyNumber = inputFile.nextLine();
            providerName = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();//clear the newline left in the buffer
            smokingStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
         
            //make sure we haven't hit the end of the file before trying to skip the blank line
            if(inputFile.hasNext())
               inputFile.nextLine();
            if(inputFile.hasNext())
               inputFile.nextLine();
            */
            
            
            
             /* Optional way to populate the ArrayList 
                                  
            policyList.add(new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight));
           
            */
            
            
            /* Optional way to code the selection structure
            
            for(Policy policy : policyList)
            { 
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
               System.out.println();
      
               if(policy.getSmokingStatus().equalsIgnoreCase("smoker"))//keep track of the number of smokers
               numSmokers++;
             }
               */
            

