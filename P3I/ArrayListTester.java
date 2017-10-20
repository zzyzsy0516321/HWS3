package P3I;

import java.util.List;
import java.util.ArrayList; 

public class ArrayListTester
{
    
    public static void main (String[] args){
    List<String> colleges = new ArrayList<String>();
    colleges.add("Stanford");
    colleges.add( "UCLA" );
    colleges.add( "UC Berkely" );
    colleges.add( "MIT" );
    colleges.add( "Cal Tech" );
    
     for (int index = 0; index < colleges.size(); index ++){
    
    System.out.println(colleges.get(index));
    
   }
    colleges.remove( 1 ); 
    colleges.add(1,"Mt.SAC");
    
   
   
   for (String college: colleges){
    
    System.out.println(college);
    
    }
   
}
    

    
}
