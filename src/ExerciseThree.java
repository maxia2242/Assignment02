/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author maxia2242
 */
public class ExerciseThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();
        Robot Andrew = new Robot(AM,15,3,Direction.SOUTH);
       
        while(Andrew.getStreet()>0){
        if (Andrew.getDirection() == Direction.EAST){
            Andrew.turnLeft();
        }
        if (Andrew.getDirection() == Direction.SOUTH){
            Andrew.turnLeft();
            Andrew.turnLeft();
        }
        if (Andrew.getDirection() == Direction.WEST){
            Andrew.turnLeft();
            Andrew.turnLeft();
        }
        Andrew.move();
        }
        while(Andrew.getAvenue()>0){
            if(Andrew.getDirection() == Direction.NORTH){
                Andrew.turnLeft();
            }
            Andrew.move();
        }
            
            
        
        
        
    }
}


