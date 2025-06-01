// this code is not optimized 
import java.util.*;

public class Rotate{

    public static void main(String [] args){
        System.out.print("Enter the number :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Rotate By :-> ");
        Scanner scr = new Scanner(System.in);
        int rotate = scr.nextInt();
        if(rotate < 0){
             int len = 1 ;
            int qu = num;     
            while(true){
                qu = qu / 10;
                if (qu == 0) {
                    break;
             }
                len++;;
        }
        rotate = len + rotate;
        }
        int numBkp = num;
        // rotate logic 
        int rorate_num = rotate==0?num:0 ;//if rorate value is 0 
        int multiplier  = 1;
        //12345 rorate by 2 :-> numbkp =5,50,4
        for(int i=1 ; i <=rotate;i++){
            numBkp = numBkp / 10;// reminder
            rorate_num = (numBkp *multiplier )+rorate_num;
            multiplier = multiplier * 10;
        }
        //rorate_num :-> 345 numbkp = 12
        //1. find length of numbkp :-> 100
        int length = 10 ;
        int quotent = numBkp;     
        while(true){
            quotent = quotent / 10;
            if (quotent == 0) {
                break;
            }
            length = length*10;
        }
        System.out.println("The Rotated Num will be :-> "+ (rorate_num *length)+numBkp);

    }
}
