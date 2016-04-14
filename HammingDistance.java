
package hammingdistance;

import java.util.*;

/**
 *
 * @author Dish Ahuja
 */
public class HammingDistance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First String : ");
       String a=sc.nextLine();
        System.out.println("Enter Second String : ");
      String b=sc.nextLine();
        int aDeci=Integer.parseInt(a,2);
        int bDeci=Integer.parseInt(b,2);
int r=aDeci^bDeci;
String result=Integer.toBinaryString(r);
       int dist=0;
        //System.out.println(result);
        //System.out.println(bInt);
        //System.out.println(r);
 //   String result=Integer.toString(r);
       for(int i=0;i<result.length();i++){
           if(result.charAt(i)=='1'){
               dist++;
           }
       }
        System.out.println("The Distance Is : "+dist);
    }
    
}
