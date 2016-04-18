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
public class ExerciseFive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        new Wall(AM,0,0,Direction.WEST);
        new Wall(AM,1,0,Direction.WEST);
        new Wall(AM,2,0,Direction.WEST);
        new Wall(AM,3,0,Direction.WEST);
        new Wall(AM,4,0,Direction.WEST);
        new Wall(AM,5,0,Direction.WEST);
        new Wall(AM,6,0,Direction.WEST);
        new Wall(AM,7,0,Direction.WEST);
        new Wall(AM,8,0,Direction.WEST);
        new Wall(AM,9,0,Direction.WEST);
        new Wall(AM,0,1,Direction.EAST);
        new Wall(AM,1,1,Direction.EAST);
        new Wall(AM,2,1,Direction.EAST);
        new Wall(AM,3,1,Direction.EAST);
        new Wall(AM,4,1,Direction.EAST);
        new Wall(AM,5,1,Direction.EAST);
        new Wall(AM,6,1,Direction.EAST);
        new Wall(AM,7,1,Direction.EAST);
        new Wall(AM,8,1,Direction.EAST);
        new Wall(AM,0,2,Direction.EAST);
        new Wall(AM,1,3,Direction.NORTH);
        new Wall(AM,1,4,Direction.NORTH);
        new Wall(AM,1,5,Direction.NORTH);
        new Wall(AM,1,6,Direction.NORTH);
        new Wall(AM,1,6,Direction.EAST);
        new Wall(AM,2,6,Direction.EAST);
        new Wall(AM,2,6,Direction.SOUTH);
        new Wall(AM,2,5,Direction.SOUTH);
        new Wall(AM,2,4,Direction.SOUTH);
        new Wall(AM,2,3,Direction.SOUTH);
        new Wall(AM,3,2,Direction.EAST);
        new Wall(AM,4,3,Direction.NORTH);
        new Wall(AM,4,4,Direction.NORTH);
        new Wall(AM,4,5,Direction.NORTH);
        new Wall(AM,4,5,Direction.EAST);
        new Wall(AM,4,5,Direction.SOUTH);
        new Wall(AM,4,4,Direction.SOUTH);
        new Wall(AM,4,3,Direction.SOUTH);
        new Wall(AM,5,2,Direction.EAST);
        new Wall(AM,6,2,Direction.EAST);
        new Wall(AM,7,3,Direction.NORTH);
        new Wall(AM,7,4,Direction.NORTH);
        new Wall(AM,7,5,Direction.NORTH);
        new Wall(AM,7,6,Direction.NORTH);
        new Wall(AM,7,7,Direction.NORTH);
        new Wall(AM,7,7,Direction.EAST);
        new Wall(AM,8,7,Direction.EAST);
        new Wall(AM,8,7,Direction.SOUTH);
        new Wall(AM,8,6,Direction.SOUTH);
        new Wall(AM,8,5,Direction.SOUTH);
        new Wall(AM,8,4,Direction.SOUTH);
        new Wall(AM,8,3,Direction.SOUTH);
        new Wall(AM,9,2,Direction.EAST);
        new Wall(AM,9,1,Direction.EAST);
        
        Robot Andrew = new Robot(AM,0,2,Direction.SOUTH);
        
        if(Andrew.getStreet()== 0){
        Andrew.move();
        Andrew.turnLeft();
        }
        
        while(Andrew.frontIsClear()){
            Andrew.move();
        }
        
            
        
            
        
            
            while(!Andrew.frontIsClear()){
                if(Andrew.getDirection() == Direction.EAST){
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    Andrew.move();
                }
                if(Andrew.getDirection() == Direction.SOUTH){
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    Andrew.move();
                }
                if(Andrew.getDirection() == Direction.WEST){
                    Andrew.turnLeft();
                }
               
                if(Andrew.getDirection() == Direction.NORTH){
                    Andrew.turnLeft();
                    Andrew.move();
                }
            }
            while(Andrew.frontIsClear()){
            Andrew.move();
            //if(Andrew.getStreet()== 2){
                //Andrew.turnLeft();
           //}
           // if(Andrew.getStreet() == 3){
                //Andrew.turnLeft();
                //Andrew.turnLeft();
               // Andrew.turnLeft();
           // }
        }
            while(!Andrew.frontIsClear()){
                Andrew.turnLeft();
                Andrew.turnLeft();
              
            }
            while(Andrew.frontIsClear()){
                Andrew.move();
            }
                    
          
           
        
                
          
            
        
       
    
    }
}
    




