import java.util.Scanner;

//Using the Speaker interface


public interface Speaker { 

   class SpeakerOfTheHouse implements Speaker {

      public void speak() {
      
         System.out.println( "I am Speaker of the House" ); 
      
      }
      
      public void announce (String str) {
      
         System.out.println( "The " + str + " has passed!"); 
      
      }
      
   }
      
   class SportsAnnouncer implements Speaker {
   
      public void speak() {
      
         System.out.println( "Goal!");
      
      }
   
      public void announce (String str) {
      
         System.out.println( "The " + str + " have scored a goal!");
      
      }
      
   }
      
   class Actor implements Speaker {
   
      public void speak() {
      
         System.out.println("I've been nominated for three Academy Awards.");
      
      }
      
      public void announce (String str) {
      
         System.out.println("I'm currently staring in " + str);
      
      }
      
   
    }
    
   public static void main(String[] args) { 
   
   // Getting the names of the 3 defferent things from a user. 
   
      Scanner billName = new Scanner(System.in);

      System.out.println ("Please enter the name of a bill: ");
      String nameBill = billName.nextLine();
   
      Scanner sportTeam = new Scanner(System.in);
      
      System.out.println ("Please enter the name of a sports team: ");
      String teamName = sportTeam.nextLine();
      
      Scanner movName = new Scanner(System.in);
      
      System.out.println ("Please enter the name of a movie: ");
      String nameMov = movName.nextLine();
      
      
      
      // Creating and using the objects and putting userinput to it.
      
      SpeakerOfTheHouse theSpeaker = new SpeakerOfTheHouse();
      theSpeaker.speak();
      theSpeaker.announce(nameBill);
      
      
      SportsAnnouncer announcer = new SportsAnnouncer();
      announcer.speak();
      announcer.announce(teamName);
      
      Actor theActor = new Actor();
      theActor.speak();
      theActor.announce(nameMov); 
        
}
    
    
}    
    
    



      
