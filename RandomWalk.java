//RandomWalk class file

import java.util.Random;     //Import of package section

class RandomWalk       //Class declaration section

{

  //Variable declaration section (int variables)
  
  private int xCoordinate;
  
  private int yCoordinate;
  
  private int maxSteps;
  
  private int numberOfSteps;
  
  private int boundary;
  
  private int maxDistance = 0;
  
  //First method section (value definition)
  
  public RandomWalk(int maxSteps, int boundary)
    
  {
    
    this.maxSteps = maxSteps;
    
    this.boundary = boundary;
    
    numberOfSteps = 0;
    
    xCoordinate = 0;
    
    yCoordinate = 0;
    
  }
  
  //Second method section (value definition)
  
  public RandomWalk(int max, int edge, int startX, int startY)
    
  {
   // (This constructor will be called)
       
    maxSteps = max;
    
    boundary = edge;
    
    numberOfSteps = 0;
    
    xCoordinate = startX;
    
    yCoordinate = startY;
    
    maxDistance = max(Math.abs(startX), Math.abs(startY));
    
  }
  
  
//Acccessor section / toString (input return) sectiom

 public String toString()
    
  {
    
    return "Steps: "+ numberOfSteps+" , Position("+xCoordinate+"," +yCoordinate+")";
    
  }


 public void takeStep()
 
 {
 
 Random rand = new Random();  
 
 //Switch section
 
 switch(rand.nextInt(4))
 
 {
     
     case 0:
      yCoordinate--;
     	break;
     
     case 1:
      xCoordinate--;
     	break;
       
     case 2:
       xCoordinate++;
     	break;
     
     case 3:
     yCoordinate++;
     	break;
       
   }
   
   numberOfSteps++;
   
   // Getting the absolute values of x and y
   int absX = Math.abs(xCoordinate);
   int absY = Math.abs(yCoordinate);
   
   // Finding the maximum of absX and absY
   int currentMax = max(absX, absY);
     
   // Finding the maximum of currentMax and maxDistance
    if (currentMax > maxDistance)
    {
      maxDistance = currentMax;
    }
 }
  
 
 public boolean moreSteps()  //MoreSteps method
 
 {
   if (numberOfSteps < maxSteps)
   
   {
   return true;
   }
  
  else 
   {
   return false;
   }
 }
 
 
 public boolean inBounds() //inBounds method
 
 {
   if (Math.abs(xCoordinate) <= boundary  && Math.abs(yCoordinate) <= boundary)
     
     {
       return true;
     }
 
   else
	{
      return false;
    }
 }
 
 public int getX()
  
  {
    
    return xCoordinate;
    
  }


public int getY()
  
  {
    
    return yCoordinate;
    
  }
  

private int max(int num1, int num2)
  
{
  if (num1 > num2)
  {
   return num1; 
  }
  
  else 
  {
    return num2;
  }
}
  

public int getMaxDistance()
  
{
  return maxDistance;
}
  

public void walk()  //Walk execution section

  {
    while(inBounds() == true && moreSteps() == true)  
    {  
        takeStep();
    }
  }
 
 
  //End of program
  
}
