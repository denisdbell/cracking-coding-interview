import java.util.*;

public class MyClass {
   
    public static void main(String args[]) {
     
     int count = 0;
     ArrayList<Character> s = new  ArrayList<Character>();
     
     s.add('a');
     s.add('a');
     s.add('b');
     s.add('c');
      
      ArrayList<Character> letters = new  ArrayList<Character>();
      
      for(int index = 0; index < s.size(); index++){
        
        if( letters.contains( s.get(index) ) ){
            System.out.println("Repeat " + s.get(index));
            
            count = count +=1;
        }
        
        letters.add( s.get(index) );
      }
      
      System.out.println(count);
    }
}

