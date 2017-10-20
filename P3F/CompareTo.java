//All Written by Zach Zhong
package P3F;
class CompareTo
{
   public static void main(String[] args) {
    String school1 = new String ( "Stanford" );
    String school2 = new String ( "UT Austin" );
    String school3 = new String ( "UCLA" );
    System.out.println(school2.compareTo(school3));
    
    }
    
    //Question A
    //The compareTo mathod compares the starting letter of two string,
    //It returns an int representing the differnece in numerical value;
    
    //Question B
    //If the string is completely identical, then it returns 0, meaning no difference
    //If the first letter is the same, then it compares the second letter
    //If the second letter is also the same, then it compares the third,
    //And so on...
    
}
