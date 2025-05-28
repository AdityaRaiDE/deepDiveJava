// there is 2 ways written to this 
// optimized way 
import java.util.*;
public class SumAllDigit{
    public static void main(String[] args){
        System.out.print("Enter The Number :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int internal_num = num < 0 ? num * -1 : num; // negative is handled here !!
            while(internal_num > 0){
                sum = sum +(internal_num % 10);
                internal_num = internal_num /10;
            }
        sum =  num < 0 ? sum * -1: sum  ;
        System.out.println("Sum is "+ sum );
    }
}
// less optimized way 
import java.util.*;
public class SumAllDigit{
    public static void main(String[] args){
        System.out.print("Enter The Number :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int internal_num = num < 0 ? num * -1 : num; // negative is handled here !!
        boolean isNegative = num < 0 ? true : false;
        // To find the sum we have to find all the digits of the number
        //  if the num == 0 
        // if the num < 0 
        // if the num > 0 
        // never declare variable in if and else since there is no gurantee that it will get assigned
        if(num == 0){
            sum = 0;
        }
        else{
            while(internal_num > 0){
                int hold_internal_num = internal_num;
                internal_num = internal_num / 10 ;
                sum = sum +(hold_internal_num - (internal_num *10));
            }
        }
        sum =  isNegative ? sum * -1: sum  ;
        System.out.println("Sum is "+ sum );
    }
}
