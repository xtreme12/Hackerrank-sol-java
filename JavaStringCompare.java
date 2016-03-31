
package javastringcompare;
import java.util.*;
/**
 *
 * @author Dish Ahuja
 */
public class JavaStringCompare {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=sc.nextInt();
      ArrayList al=new ArrayList();
        int max;
        String min;
        for(int c=0;c<str.length();c++){
            for(int i=1;i<=str.length()-c;i++){
             String sub=str.substring(c,c+i);
             if(sub.length()==len){
                     al.add(sub);  
                 Collections.sort(al);
                 
             }
              
                    
            }
            
        }
                  System.out.println(al.get(0));
                 System.out.println(al.get(al.size()-1));
       // System.out.println(al);
    }
    
}
