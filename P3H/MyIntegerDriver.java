//All written by Zach Zhong
package P3H;
public class MyIntegerDriver
{
   public static void main (String[] args){
    
       
       MyInteger int1 = new MyInteger (19283746);
       System.out.println(int1.toString());
       System.out.println("The sum of all digits is " + int1.calculateSum());
   }
}
