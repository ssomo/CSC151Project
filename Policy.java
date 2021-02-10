public class Policy{

   //Create a private field for the variables
   private int policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String status;
   private double height;
   private double weight;
   
   //Create a no-arg constructor that accepts arguments
   public Policy(){
      policyNumber = 0;
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      status = "";
      height = 0;
      weight = 0.0;
   }
   
   //Create a constructor that accepts all necessary arguments to fully initialize the Policy object
   public Policy(int number, String insuranceProviderName, String policyholderFirstName, String policyholderLastName, int policyholderAge, String smokingStatus, double policyholderHeight, double policyholderWeight){
      policyNumber = number;
      providerName = insuranceProviderName;
      firstName = policyholderFirstName;
      lastName = policyholderLastName;
      age = policyholderAge;
      status = smokingStatus;
      height = policyholderHeight;
      weight = policyholderWeight;
   }
   //Create setters and getters for each field
   
   public void setPolicyNumber(int policyNumberGiven){
      policyNumber = policyNumberGiven;
   }
   
   public void setPolicyNumber(String policyNumberGiven){
      policyNumber = Integer.parseInt(policyNumberGiven);
   }
   
   public void setProviderName(String providerNameGiven){
      providerName = providerNameGiven;
   }
   
   public void setFirstName(String firstNameGiven){
      firstName = firstNameGiven;
   }
   
   public void setLastName(String lastNameGiven){
      lastName = lastNameGiven;
   }
   
   public void setAge(int ageGiven){
      age = ageGiven;
   }
   
   public void setAge(String ageGiven){
      age = Integer.parseInt(ageGiven);
   }
   
   public void setStatus(String statusGiven){
      status = statusGiven;
   }
   
   public void setHeight(double heightGiven){
      height = heightGiven;
   }
   
   public void setWeight(double weightGiven){
      weight = weightGiven;
   }
   
   public int getPolicyNumber(){
      return policyNumber;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public String getFirstName(){
      return firstName;
   }
   
   public String getLastName(){
      return lastName;
   }
   
   public int getAge(){
      return age;
   }
   
   public String getStatus(){
      return status;
   }
   
   public double getHeight(){
      return height;
   }
   
   public double getWeight(){
      return weight;
   }
  
  
   /**
   The calculateBMI method calculates and returns the BMI of the policyholder
   @param weight - The weight of the policyholder
   @param height - The height of the policyholder
   */
   
   public static double calculateBMI(double weight, double height){
      double bmi = (weight * 703) / (height * height);
      return bmi;
   }
   
   /**
   The calculateInsurancePolicy calculates and returns the price of the insurance policy
   There is a base fee of $600
   @param age - If the Policyholder is over 50 years, there is an additional fee of $75
   @param status - If the Policyholder is a smoker, there is an additional fee of $100
   If the Policyholder has a BMI of over 35, there is an additional fee calculate as follows:
         -Additional Fee = (BMI - 35) * 20
   */
   
   public static double calculateInsurancePolicy(int age, String status, double bmi)
   {
      double baseFee = 600;
      double additionalFee = 0.0;
      
      //Create an if statement for addtional fees regarding age
      if(age < 50){
         additionalFee = 75;
         return additionalFee;   
      }
      
      //Create an if else statement for additional fees if the policyholder is a smoker
      if(status == "smoker"){
         additionalFee = 100;
         return additionalFee;
      }
      else{
      }
      
      //Create an if statement for additional fees if the policyholder has a BMI over 35
      if(bmi < 35){
         additionalFee = (bmi - 35) * 20;
         return additionalFee;
      }
      
      return baseFee + additionalFee; 
   }
   
}