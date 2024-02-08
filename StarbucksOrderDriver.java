import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class StarbucksOrderDriver {


   public static void main(String [] args)throws IOException {
   
      File infile = new File("starbucksData.txt");
      Scanner scan = new Scanner(infile);
      int orderNum = 0;
      
      
      StarbucksOrder starb1 = getStarbucksOrder(scan);
      StarbucksOrder starb2 = getStarbucksOrder(scan);
      StarbucksOrder starb3 = getStarbucksOrder(scan);
      StarbucksOrder starb4 = getStarbucksOrder(scan);
      
      
      displayStarbucksOrder(starb1,1);
      displayStarbucksOrder(starb2,2);
      displayStarbucksOrder(starb3,3);
      displayStarbucksOrder(starb4,4);
      
      
      scan.close();
      
      
      
   }//end main
   
   public static StarbucksOrder getStarbucksOrder(Scanner scan)throws IOException {
      
      String line = "", size = "", temp = "", type = "";
      double price = 0.0;
      
      line = scan.nextLine();
      
      StringTokenizer st = new StringTokenizer(line, ",");
      
      size = st.nextToken();
      temp = st.nextToken();
      type = st.nextToken();
      price = Double.parseDouble(st.nextToken());
      
      
      return new StarbucksOrder(size, temp, type, price);
    
    }//end getStarbucksOrder
    
    public static void displayStarbucksOrder(StarbucksOrder starbO, int orderNum){
    
      System.out.print("\nOrder Number: " + orderNum);
    
      System.out.println("\n" + starbO);
    
    }//end display


}//end class