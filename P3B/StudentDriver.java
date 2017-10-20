//Written By Zach Zhong
package P3B;
public class StudentDriver
{
    public static void main (String[] args){
        Student senior = new Student("Joe","Senior", 3.0,3.0,3.5,4.0,4.0);
        System.out.println(senior.toString());
        senior.setMath(4.0);
        System.out.println("Student's new math is " + senior.getMath() + "\n");
        System.out.println(senior.toString());
    
    }
}

