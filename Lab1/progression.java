/**
A progression is a list of number with the numbers either increasing or decreasing at
a constant rate.
*/



// Super Class 
public class progression {

   public int first;
   public int curr;
   
   
   public progression (int first, int curr) {
   
      this.first = first;
      
      this.curr = curr;
   
   }
   
   
/**
First method
*/
      
   public int firstValue() {
   
      curr = first;
         
      return curr;
   
    }
    
//Second Method       
    public int nextValue() {
    
      return curr = curr + 1;
      
    }
    
//Third Method    
    public void printProgression(int n) {
   
      System.out.print(firstValue());
      
      for (int i = 2; i <= n; i++) {
      
         System.out.print(" " + nextValue());
         
      }
      
      System.out.println("\n");
          
    }
    
 
 
// Testing/main class 
    
public static void main(String[] args) { 

   ArithProgression firstTen = new ArithProgression(1,23);
   
   Geometric tenValues = new Geometric(1,2);

   firstTen.printProgression(10);
   
   tenValues.printProgression(10);


}
    
    

}

//sub class 
class ArithProgression extends progression {


 
 
   ArithProgression(int first, int curr) {
   
      super(first,curr);
      
      curr = curr + 5;  
      
   }
   
  
   // Method to override previous increment
   
   public int nextValue() {
   
      curr = curr + setInt(5);
   
      return curr;
   }
   
    /** Method to override previous increment
       
   */
   
   public int setInt(int n) {
   
   //Integer num = new Integer(1);
   
   //n= Integer.valueOf(num.intValue() + n);
   
   
   return n;
   
   }
   

}










class Geometric extends progression {


   Geometric(int first, int curr) {
   
   super(first, curr);
   
   first = first + 2;
   
 }
 
 //Method to increment geometricly...current value * n
 
   public int setInc(int n) { 
   
   
      n = curr * n;


      return n;
      
      
   }

}




