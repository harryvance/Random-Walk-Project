//DrunkenWalk file

import java.util.Random;     //Import of Random package section
import java.util.Scanner;   //Import of Scanner section

public class DrunkenWalk   //Introduction of class section

{

  //Main method section
  
  public static void main (String[] args)


  {
    
    //Variable declaration section
    
    int boundary;
    
    int maxSteps;
    
    int numberOfDrunks;
    
    int counter = 0;
    
    
    //Scanner creation section
    
    
    Scanner drunkenRegister = new Scanner(System.in);
    
    
    //Input section
    
    
    System.out.println("Drunken Walk Test Program");
    
    System.out.println("Please enter the boundary.");
    
    boundary = drunkenRegister.nextInt();
    
    System.out.println("Please enter the maximum number of steps.");
      
    maxSteps = drunkenRegister.nextInt();
    
    System.out.println("Please enter the number of drunks.");
    
    numberOfDrunks = drunkenRegister.nextInt();
    
    
    //For loop section
    
    for (int i = 0; i < numberOfDrunks; i++)
      
    {
      
     RandomWalk dw1 = new RandomWalk(maxSteps, boundary);
      
     dw1.walk();
      
     if (dw1.inBounds() == false)
       
     {
      
     counter++;
       
     }
      
    } //End of for loop section
    
    
    //Final print-out section
    
    System.out.println("The number of times the drunk fell off is " + counter);
    
  }
    
    //End of program

}