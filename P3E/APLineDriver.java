//Written By Zach Zhong
package P3E;
public class APLineDriver
{
    public static void main (String[] args){
    APLine line1 = new APLine(5,4,-17);
    double slope1 = line1.getSlope();       //slope1 is assigned -1.25
    boolean onLine1 = line1.isOnLine(5,-2); //true because 5(5) + 4(-2) + (-17) = 0
   
    APLine line2 = new APLine(-25,40,30);
    double slope2 = line2.getSlope();        //slope1 is assigned 0.625
    boolean onLine2 = line2.isOnLine(5,-2);  //true because -25(5) + 40(-2) + 30 != 0
   
    //Testing Results
    System.out.println("Slope 1 is " + slope1);
    System.out.println("Line 1 is on line: " + onLine1);
    System.out.println("Slope 2 is " + slope2);
    System.out.println("Line 2 is on line: " + onLine2);
    

    }
}
