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
   
   public void setHeight(double h){
      height = h;
   }
   
   public void setWeight(double w){
      weight = w;
   }
   
   public String getPolicyNumber(){
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
   
   public String getSmokingStatus(){
      return smokingStatus;
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
   
   public double getBMI(){
      final double CONVFACTOR = 703;
      return (weight * CONVFACTOR) / (height * height);
   }
   
   /**
   The calculateInsurancePolicy calculates and returns the price of the insurance policy
   There is a base fee of $600
   @param age - If the Policyholder is over 50 years, there is an additional fee of $75
   @param status - If the Policyholder is a smoker, there is an additional fee of $100
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
   
}