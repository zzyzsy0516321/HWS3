//Written By Zach Zhong
package P3E;
public class APLine
{
    
    int a;
    int b;
    int c;
    
    
    public APLine(int a, int b, int c){
        
        this.a = a;
        this.b = b;
        this.c = c;
        
        
    }
    
    public double getSlope(){
    
        return (-1.0 * a)/b;
        
    }
    
    public boolean isOnLine(int x, int y){
    
        if ( (a * x + b * y + c) == 0) {
            
            return true;
            
        } else {
        
            return false;
        }
    }
    
}
