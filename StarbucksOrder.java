import java.lang.String;
import java.text.DecimalFormat;

public class StarbucksOrder{

   private String size = "";
   private String temp = "";
   private String type = "";
   private double price = 0.0;
   private double totalCost = 0.0;


   public StarbucksOrder(){
      String size = "",
             temp = "",
             type = "";
      double price = 0.0;
             

   }//end 
   
   public StarbucksOrder(String size, String temp, String type, double price){
   
      this.size = size;
      this.temp = temp;
      this.type = type;
      this.price = price;
      
   
   }//end constructor

   public StarbucksOrder(StarbucksOrder copy){
   
      this.size = size;
      this.temp = temp;
      this.type = type;
      this.price = price;
      
      
   }//end copy
   
   
   //Setters------------------------------------------
   
   /**
   
   sets the size of the starbucks order to size
   @param size -> the new size of the starbucks order
   
   */
   
   public void setSize(String size){
      this.size = size;
   }//end setSize
   
   public void setTemp(String temp){
      this.temp = temp;
   }//end setTemp
   
   public void setType(String type){
      this.type = type;
   }//end setType
   
   public void setPrice(double price){
      this.price = price;
   }//end setPrice
   
   
   //Getters------------------------------------------
   
   /**
   
   returns the size of the starbucks order
   @return the size of the starbucks order
   
   */
   
   public String getSize(){
      return size;
   }//end getSize
   
   public String getTemp(){
      return temp;
   }//end getTemp
   
   public String getType(){
      return type;
   }//end getType
   
   public double getPrice(){
      return price;
   }//end getPrice
   

   
   //---------------------------------------------------
   
   /** checks the starbucksOrder against the test starbucksOrder
   
   @param test the starbucksOrder compares to this starbucksOrder
   @returns true if the same attributes, false otherwise
   
   */
   
   public boolean equals(StarbucksOrder test){
      boolean same = false;
      
      if (this.size.equals(test.size) &&
          this.temp.equals(test.temp) &&
          this.type.equals(test.type) &&
         ((int)(this.price * 1000) == (int)(test.price * 1000)));
         
         same = true;
      
      return same;
      
      
    }//end equals
    
    
    public String toString(){
    
      DecimalFormat formatter = new DecimalFormat("$##.00");
    
      StringBuilder sb = new StringBuilder();
      
      sb.append(String.format("\n%5s%9s", "Size:", size));
      sb.append(String.format("\n%5s%9s", "Temp:", temp));
      sb.append(String.format("\n%5s%9s", "Type:", type));
      sb.append(String.format("\n%5s%8s", "Price:", formatter.format(price)));
    
      return sb.toString();
    
    
    }//end toString
 
   


}//end class