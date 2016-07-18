
package prob_one;
import java.util.*;
import jdk.nashorn.internal.objects.NativeArray;
/**
 *
 * @author Dish Ahuja
 */
public class Prob_One {
int arr[]=new int[]{1,2,3,5,6,3,2,1,7,5};
ArrayList al=new ArrayList();
ArrayList alnew=new ArrayList();
        public void removeDuplicates(){
    for(int i=0;i<arr.length;i++){
        al.add(arr[i]);
    }  
         
         for(Object c:al){
             int f=Collections.frequency(al, c);
             if(f==1){
                 alnew.add(c);
             }
         }
         System.out.println(alnew);
         
         //System.out.println(al);
   }
    public static void main(String[] args) {
        Prob_One po=new Prob_One();
        po.removeDuplicates();
    }
}
