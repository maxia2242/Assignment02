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
public class ExerciseTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM= new City();
        new Wall (AM,2,0,Direction.SOUTH);
        new Wall (AM,2,1,Direction.SOUTH);
        new Wall (AM,2,2,Direction.SOUTH);
        new Wall (AM,2,3,Direction.SOUTH);
        new Wall (AM,2,4,Direction.SOUTH);
        new Wall (AM,2,5,Direction.SOUTH);
        new Wall (AM,2,6,Direction.SOUTH);
        new Wall (AM,2,7,Direction.SOUTH);
        new Wall (AM,2,8,Direction.SOUTH);
        new Wall (AM,2,9,Direction.SOUTH);
        new Wall (AM,2,0,Direction.EAST);
        new Wall (AM,2,1,Direction.EAST);
        new Wall (AM,2,4,Direction.EAST);
        new Wall (AM,2,7,Direction.EAST);
        new Thing (AM,2,9);
        Robot Andrew = new Robot(AM,2,0,Direction.EAST);
        
        while(!Andrew.frontIsClear()){
            Andrew.turnLeft();
            Andrew.move();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.move();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.move();
            Andrew.turnLeft();
        while(Andrew.frontIsClear()){
            Andrew.move();
        if(Andrew.canPickThing()){
            Andrew.pickThing();
            Andrew.setSpeed(0);}
        }
            
            
            
        
        
        }
    }
}
