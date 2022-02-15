import java.util.Random;       //Import of Random package section
import java.util.Scanner;     //Import of Scanner section

public class Collisions     //Introduction of class section

{
  
  //Private variable declaration section
  
  private static final int BOUNDARY = 2000000;
  
  private static final int MAX_STEPS = 100000;
    
  
  //Main method section
  
  public static void main (String[] args)

  {
  
    //RandomWalk object generation section
    
  	RandomWalk cw1 = new RandomWalk(BOUNDARY, MAX_STEPS, -3,0);
    
    RandomWalk cw2 = new RandomWalk(BOUNDARY, MAX_STEPS, 3,0);
 
    //CollisionCount value section 
 
    int collisionCount = 0;
    
    for (int i = 0; i < MAX_STEPS; i++)
    
    {
       cw1.takeStep();
       cw2.takeStep();
      
      if (samePosition(cw1,cw2) == true) //SamePosition if statement check
          
          {
             collisionCount++;
          }   
      
    }
    
        //Collision count print-out section
    
     System.out.println("The number of times the particles collided is: " + collisionCount);
    
  }
    
  // Collision method section
  private static boolean samePosition(RandomWalk p1, RandomWalk p2) 
  {
    
    //If statement that returns true if the two particles collided
    if (p1.getX() == p2.getX() && p1.getY() == p2.getY())
    {
    return true;
    }
    
    else 
    {
      return false;
    }
  }  
  
  //End of program
  
}