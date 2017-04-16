import java.util.Arrays;
import java.util.*;

public class workLibraries {

   public static void main(String[] args) {
   
   // Creating the 2 by 10 array
   
   int row = 2;
   int column = 10;
   
   int[][] myArray = new int[row][column];
   
   // Making each index of the array a differnt random number.
   
   for(int i = 0; i < row; i++)
   
      for(int j = 0; j < column; j++)
      
         myArray[i][j] = (int)(Math.random() * 900 + 100);
   
   // Printing out the original random array
   
   System.out.println(Arrays.deepToString(myArray) + "\n");
   
   // Printing out the reversed Array
   
   swapRows(myArray,0,1);
   System.out.println(Arrays.deepToString(myArray) + "\n");   
      
      
   
   
   
 
 
   // Using the Random Function.
   
   char [] myCharArray = new char[9];
   
   Random r = new Random(); 
     
   for (int i = 0; i < myCharArray.length; i++) 
   
      myCharArray[i] = (char)(r.nextInt(26) + 'a');
  
  
  // Printing out the array of Random Characters
  
   for (int i = 0; i < myCharArray.length; i++) {
   
      System.out.print(Character.toUpperCase(myCharArray[i]));
   
  } 
  
  
   

}
   
   // This is the method to swap the Rows. 
   
   public static void swapRows(int array[][], int rowA, int rowB) {
   
      int tmpRow[] = array[rowA];
      
      array[rowA] = array[rowB];
      
      array[rowB] = tmpRow;
      
  

   }


}
   
