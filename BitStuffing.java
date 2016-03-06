package bitstuffing;
import java.util.Scanner;
/**
 *
 * @author Dish Ahuja
 */
public class BitStuffing {

   public void addBits(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter The String : ");
       String str=sc.nextLine();
       String match="11111";
       String newmatch="111110";
       String strnew;
       if(str.contains(match)){
           //System.out.println("success!");
          strnew=str.replace(match,newmatch);
          System.out.println(strnew);
       }
       
   }
    public static void main(String[] args) {
        BitStuffing bs=new BitStuffing();
        bs.addBits();
    }
    
}
