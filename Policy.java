public class Policy{

   //Create a private field for the variables
   private String policyNumber;
   private String providerName;
   private PolicyHolder ph; //object aggregation - programmer created field - the policy has a policy holder( a has a relationship)
   
   /**only one copy of the field is in memory, regardless of the number of instances of the class 
      that might exist - good use of memory management to use a static field when a common field
      is used by all objects. Example : if a common field is a company name, the company name could be static*/
      
   //Static field to keep tract of the number of Policy objects
   public static int numOfPolicies = 0;
   
   
   //No-arg constructor that intializes all fields
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      ph = new PolicyHolder();
      numOfPolicies++;
   }  
   
   //Constructor that accepts arguments for each field
   //Using the "this" reference variable to overcome shadowing of a field name by a parameter name
   public Policy(String policyNumber, String providerName, PolicyHolder ph)
   {
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.ph = new PolicyHolder(ph);//create a "deep copy" using the PolicyHolder's copy constructor
      numOfPolicies++;
   }
   
   //setters
   public void setPolicyNumber(String policyNumber)
   {
      this.policyNumber = policyNumber;
   }
   
   public void setProviderName(String providerName)
   {
      this.providerName = providerName;
   }
   
   //getters
   public String getPolicyNumber()
   {
      return policyNumber;
   }
    
   public String getProviderName()
   {
      return providerName;
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(ph);//return a copy of the PolicyHolder for the policy using the copy constructor
   }
   
   
   
   public double getPrice()
   {
      final double BASE_PRICE = 600;
      final double ADDITIONAL_FEE_AGE = 75;
      final double ADDITIONAL_FEE_SMOKING = 100;
      final double ADDITIONAL_FEE_PER_BMI = 20;
      
      final int AGE_THRESHOLD = 50;
      final int BMI_THRESHOLD = 35;
      
      double price = BASE_PRICE;
      
      if(ph.getAge() > AGE_THRESHOLD)//Over 50 yrs
         price += ADDITIONAL_FEE_AGE; //75
         
      if(ph.getSmokingStatus().equalsIgnoreCase("smoker"))
         price += ADDITIONAL_FEE_SMOKING; //100
      
      //Call the getBMI() method
      if(ph.getBMI() > BMI_THRESHOLD) //BMI OVER #5
         price += ((ph.getBMI() - BMI_THRESHOLD) * ADDITIONAL_FEE_PER_BMI); //additional BMI fee - 20
         
      return price;
   }
   
   //Create a toString method
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + ph + //implicitly calling the PolicyHolder's toString() method
                           "\nPolicy Price: $%.2f", getPrice());
            
   }

   
}