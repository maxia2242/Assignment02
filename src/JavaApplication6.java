/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maxia2242
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        Robot Andrew = new Robot(AM,1,1,Direction.EAST);
        new Thing (AM,1,2);
        new Thing(AM,1,3);
        new Thing(AM,1,4);
        new Thing(AM,1,5);
        new Thing(AM,1,6);
        new Thing(AM,1,7);
        new Thing(AM,1,8);
        new Thing(AM,1,9);
        new Thing(AM,1,10);
        new Thing(AM,1,11);
        
        while(Andrew.countThingsInBackpack()<7)
        {
            Andrew.move();
            Andrew.pickThing();
        
        }
        if(Andrew.countThingsInBackpack()== 7)
                Andrew.move();
                Andrew.move();
                Andrew.move();
                Andrew.move();
            
        
            
        


        
        
        
      
       
    
        
     
               
          
          
        
        
        
        
        
    }
    }
