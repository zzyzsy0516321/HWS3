import greenfoot.*; 
public class SpaceShip extends Actor
{
    String name;
    int speed;
    boolean isMissionCompleted;

    public void act() 
    {

        move(speed);
        if (isAtEdge()){

            //IF IT IS AT RIGHT EDIGE         
            if (getX() == 799){

                turn(90);
                move(1);
                turn(90);

            
            } else if (getX() == 0) {

                turn(-90);
                move(1);
                turn(-90);             

            
            }

        }
        
        if (getX() == 799 && getY() == 599){

            setLocation( getWorld().getWidth()/2, getWorld().getHeight()/2 );
            isMissionCompleted = true;
            Greenfoot.stop();

        }

        if (isMissionCompleted){

            getWorld().showText("Mission Completed!",getWorld().getWidth()/2,getWorld().getHeight()/2);
        } else {
            getWorld().showText(toStirng(),getWorld().getWidth()/2,getWorld().getHeight()/2);
            getWorld().showText( "Distance to destination is: " + calcTripDistance() + " km",getWorld().getWidth()/2, getWorld().getHeight() - 100 );     
            getWorld().showText( "Time to destination is: " + calcTripTravelTime() + " seconds",getWorld().getWidth()/2, getWorld().getHeight() - 65 );
        }

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