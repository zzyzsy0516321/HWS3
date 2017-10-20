package P3G;
/**
 All written by Zach Zhong
 */
public class IntegerSearch
{
    public static void main (String[] args) {
    
    int[] numbers = {-9,2,3,4,7,9,10,23,45,67};
    findValueInArray(numbers,3);
    findValueInArray(numbers,45);    
    findValueInArray(numbers,0);    
    
    }

    public static int findValueInArray (int[] myArray, int valueToFind) {
        
        for (int index = 0; index < myArray.length; index ++){
        
            if (myArray[index] == valueToFind){
                
                System.out.println("The value " + valueToFind + " was found at index " + index);
                return index;
            }
            
        }
        
        System.out.println("The value " + valueToFind + " was not found " );
        return -1;
    }
    
}
