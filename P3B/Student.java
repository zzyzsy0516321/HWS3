//Written By Zach Zhong
package P3B;
public class Student
{
    // instance variables - replace the example below with your own
    private String firstName;
    private String lastName;
    private double gpa;
    public double[] grades = new double[5];
    
    public Student()
    {
        
      
        
    }
    
    public Student (String firstName, String lastName, double english, double math, double science, double fineArts, double socialStudies) {

        this.firstName = firstName;
        this.lastName = lastName;
        grades[0]= english;
        grades[1] = math;
        grades[2] = science;
        grades[3] = fineArts;
        grades[4] = socialStudies;
        

    
    }
    
    public String toString (){
            
        gpa = calcGPA();
        
    
        return "Student: " + firstName + " " + lastName + "\n" + 
               "Cumulative GPA: " +  gpa + "\n";
    
    
    
    
    }
    
    
    
    public double calcGPA(){
    
        
        double totalGPA = 0;
        
        for (double grade : grades){
        
            
            totalGPA += grade;
            
        
        }
        
        
        return totalGPA / grades.length;
    
    
    }
    
    
    public double getMath(){
    
    
        return grades[1];
    
    }
    public void setMath(double math){
    
        grades[1] = math;
        
    }
    
    
    
        
}
