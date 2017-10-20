import greenfoot.*; 
public class SpaceShip extends Actor
{
    String name;
    int speed;
    public void act() 
    {
        move(5);
        if (isAtEdge()){
                int turnDegree = (int)(Math.random()*90);
                turn(turnDegree);
        }
            getWorld().showText(toStirng(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText( "Distance to destination is: " + calcTripDistance() + " km",getWorld().getWidth()/2, getWorld().getHeight() - 100 );     
            getWorld().showText( "Time to destination is: " + calcTripTravelTime() + " seconds",getWorld().getWidth()/2, getWorld().getHeight() - 65 );
        }    
    public SpaceShip() {
        name = "default ship";
        speed = 10;
    }
     public SpaceShip( String shipName, int shipSpeed) {
    
         name = shipName;
         speed = shipSpeed;
    }
    public String toStirng(){
    return "Name of the ship is " + name + "\nSpeed is: " + speed + "\n" + "X-coordinate: " + getX()+ "\n" + "Y-coordinate: " + getY()  ;
    }
    
    public double calcTripDistance(){

        int destinationY = getWorld().getHeight();
        int destinationX = getWorld().getWidth();
        return Math.sqrt(Math.pow(destinationY - getY(),2) + Math.pow(destinationX - getX(),2));

    }

    public double calcTripTravelTime(){

        return calcTripDistance() / speed;

        
    }
}