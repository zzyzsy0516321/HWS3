import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Galaxy extends World
{

    /**
     * Constructor for objects of class Space.
     * 
     */
    public Galaxy()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(800, 600, 1);
        SpaceShip fightTraining = new SpaceShip("Fight Training",5);
        addObject(fightTraining, 0, 0);
    }
}
