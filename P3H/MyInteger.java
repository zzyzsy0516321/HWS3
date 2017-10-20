//All Written by Zach Zhong
package P3H;
public class MyInteger
{
    
    public int num;
    
    public MyInteger(int num){
    
        this.num = num;
        
    }
    
    public String toString() {
    
         return "The value of num is " + num; 
    
    }
    
    public int calculateSum() {
    
        int sum = 0;
        int result = num;
        
        while (result!=0){
        
            sum += result % 10;
            result /= 10;
        
        }
        
        return sum;
    }
    
}
