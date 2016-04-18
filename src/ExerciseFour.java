/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author maxia2242
 */
public class ExerciseFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        Robot Andrew = new Robot(AM,0,0,Direction.EAST);
        new Wall(AM,1,1,Direction.NORTH);
        new Wall(AM,1,1,Direction.SOUTH);
        new Wall(AM,1,1,Direction.WEST);
        new Wall(AM,1,1,Direction.EAST);
        new Wall(AM,2,2,Direction.WEST);
        new Wall(AM,3,2,Direction.WEST);
        new Wall(AM,3,2,Direction.SOUTH);
        new Wall(AM,3,3,Direction.SOUTH);
        new Wall(AM,4,1,Direction.NORTH);
        new Wall(AM,4,1,Direction.SOUTH);
        new Wall(AM,4,1,Direction.WEST);
        new Wall(AM,4,1,Direction.EAST);
        new Wall(AM,3,3,Direction.EAST);
        new Wall(AM,2,3,Direction.EAST);
        new Wall(AM,2,2,Direction.NORTH);
        new Wall(AM,2,3,Direction.NORTH);
        new Wall(AM,1,4,Direction.NORTH);
        new Wall(AM,1,4,Direction.SOUTH);
        new Wall(AM,1,4,Direction.WEST);
        new Wall(AM,1,4,Direction.EAST);
        new Wall(AM,4,4,Direction.EAST);
        new Wall(AM,4,4,Direction.WEST);
        new Wall(AM,4,4,Direction.NORTH);
        new Wall(AM,4,4,Direction.SOUTH);
        
        
   while(Andrew.frontIsClear()){
       Andrew.move();
       Andrew.move();
       Andrew.turnLeft();
       Andrew.turnLeft();
       Andrew.turnLeft();
       Andrew.move();
       Andrew.turnLeft();
       Andrew.move();
       
   
   if(!Andrew.frontIsClear()){
       Andrew.turnLeft();
       Andrew.move();
       Andrew.turnLeft();
       Andrew.turnLeft();
       Andrew.turnLeft();
       Andrew.move();
       Andrew.move();
       Andrew.turnLeft();
       Andrew.turnLeft();
       Andrew.turnLeft();
   }
   }
        
      
            
        
        
            
        
            
    }   
    }

