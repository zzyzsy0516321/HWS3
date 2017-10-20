//All written by Zach Zhong
package P3J;
import java.util.*;
public class PasswordCreation
{
    public static void main (String[] args){

        Scanner kbReader = new Scanner (System.in);

        boolean containSpecialCharacter = false;
        boolean isAtLeast6Characters = false;
        do {

            

            System.out.println("Please enter a password length of at least 6 characters and at least one non-alphanumeric character (+, -, *, /, or @.) ");
            String password = kbReader.nextLine();

            isAtLeast6Characters = password.length() >= 6;
            containSpecialCharacter = false;
            
            for (int j  = 0; j < password.length(); j++) {

                char currentCharacter = password.charAt(j);

                switch (currentCharacter) {
                    case '+':
                    case '-':
                    case '*':
                    case '/':
                    case '@':
                    containSpecialCharacter = true;
                
                }

            }

        } while (!containSpecialCharacter || !isAtLeast6Characters);
    }
}
