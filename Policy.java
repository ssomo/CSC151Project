public class Policy{

   //Create a private field for the variables
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double height;
   private double weight;
   
   //Create a no-arg constructor that accepts arguments
   public Policy(){
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      height = 0;
      weight = 0.0;
   }
   
   //Create a constructor that accepts all necessary arguments to fully initialize the Policy object
   public Policy(String pnumber, String pName, String fName, String lName, int a, String sStatus, double h, double w){
      policyNumber = pnumber;
      providerName = pName;
      firstName = fName;
      lastName = lName;
      age = a;
      smokingStatus = sStatus;
      height = h;
      weight = w;
   }
   //Create setters and getters for each field
   
   public void setPolicyNumber(String pNumber){
      policyNumber = pNumber;
   }
   
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
   public void setFirstName(String fName){
      firstName = fName;
   }
   
   public void setLastName(String lName){
      lastName = lName;
   }
   
   public void setAge(int a){
      age = a;
   }
   
   
   public void setSmokingStatus(String sStatus){
      smokingStatus = sStatus;
   }
   
   public void setHeight(int h){
      height = h;
   }
   
   public void setWeight(int w){
      weight = w;
   }
   
   /**
   Gets the policy number and returns it  
   @return policyNumber
   */
   public String getPolicyNumber(){
      return policyNumber;
   }
   
   /**
   Gets the provider name and returns it
   @return providerName 
   */
   public String getProviderName(){
      return providerName;
   }
   
   /**
   Gets the first name of the policy user and returns it
   @return firstName 
   */
   public String getFirstName(){
      return firstName;
   }
   
   /**
   Gets the last name of the policy user and returns it
   @return lastName 
   */
   public String getLastName(){
      return lastName;
   }
   
   /**
   Gets the age of the policy user and returns it
   @return age 
   */
   public int getAge(){
      return age;
   }
   
   /**
   Gets the smokingStatus of the policy user and returns it
   @return smokingStatus 
   */
   public String getSmokingStatus(){
      return smokingStatus;
   }
   
   /**
   Gets the height of the policy user and returns it
   @return height 
   */
   public double getHeight(){
      return height;
   }
   
   /**
   Gets the weight of the policy user and returns it
   @return weight 
   */
   public double getWeight(){
      return weight;
   }
  
  
   /**
   The calculateBMI method calculates and returns the BMI of the policyholder
   @return (weight * 703) / (height)^2
   */
   
   public double getBMI(){
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /**
   The calculateInsurancePolicy calculates and returns the price of the insurance policy
   There is a base fee of $600
   @return price
      If the Policyholder has a BMI of over 35, there is an additional fee calculate as follows:
         -Additional Fee = (BMI - 35) * 20
   */
   
   public double getPrice ()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(age > AGE_THRESHOLD)//Over 50 yrs
         price += ADDITIONAL_FEE_AGE; //75
         
      if(smokingStatus.equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING; //100
      
      //Call the getBMI() method
      if(getBMI() > BMI_THRESHOLD) //BMI OVER #5
         price += ((getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
   //Create a toString method
   public String toString()
   {
      String str = "Policy Number: " + policyNumber +
            "\nProvider Name: " + providerName +
            "\nPolicyholder's First Name: " + firstName +
            "\nPolicyholder's Last Name: " + lastName +
            "\nPolicyholder's Age : " + age + 
            "\nPolicyholder's Smoking Status (Y/N): " + smokingStatus +
            "\nPolicyholder's Height: " + height +
            "\nPolicyholder's Weight: " + weight;
      return str;
   }

   
}