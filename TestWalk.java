//TestWalk file

import java.util.Scanner;     //Imports the Scanner
import java.util.Random;      //Imports Random

public class TestWalk 

{ 

//Main section (public static void)

    public static void main (String[] args) 
    
    { 

//Variable declaration section

 int maxSteps;   // Declaring the maximum number of steps in a random walk 
 int maxCoord;   // The maximum value of the  x and y coordinate 
 int x, y;       // The starting x and y coordinates for a random walk 

//Scanner creation section (scan)

 Scanner scan = new Scanner(System.in); 

//Beginning of input section
 
 System.out.println ("Random Walk Test Program"); //Initial printout section

 System.out.print ("Enter the boundary for the square: ");  //Boundary input section 

 maxCoord = scan.nextInt(); 
 
 System.out.print ("Enter the maximum number of steps: "); //Maximum steps input section

 maxSteps = scan.nextInt(); 

 System.out.print ("Enter the starting x and y coordinates with a space between x and y: ");   //Starting coordinates section

 x = scan.nextInt(); 

 y = scan.nextInt(); 


//RandomWalk object generation section      

      
RandomWalk rw = new RandomWalk(5,10);               // 5 assigned to max, max is then assigned to maxSteps; so maxSteps = 5
      							            	// 10 assigned to edge, edge is then assigned to boundary; boundary = 10
      
RandomWalk rw2 = new RandomWalk(maxSteps, maxCoord, x, y);           // maxSteps assigned to max; user input value for maxSteps is then assigned to class attribute maxSteps
      											            // maxCoord passed to edge; edge assigned to boundary, so boundary = maxCoord
										// x assigned to startX, y assigned to startY

RandomWalk rw3 = new RandomWalk(200,10);     //200 is assigned to max, 10 is assigned to edge

rw3.walk();      //The boundary is therefore set to 10 and 200 as the maximum steps

System.out.print(rw3);
                              
//For loop section (Random Walk objects)

for (int i = 0; i < 5; i++)

{

  rw.takeStep();
  
  rw2.takeStep();
  
  System.out.println(rw);
      
  System.out.println(rw2);
  
}
      
  System.out.println("The maximum distance of Random Walk 1 is: " + rw.getMaxDistance());
   
  System.out.println("The maximum distance of Random Walk 2 is: " + rw2.getMaxDistance());

//End of final print-out section

    } 
    
    //End of program

} 