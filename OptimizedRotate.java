import java.util.*;

public class OptimizedRotate {
    public static void main(String[] args){
        System.out.print("Enter the number and the rotateNum :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); //34598
        int rotate = sc.nextInt(); //2
        int counter = 10;
        int length = 1;
        int quotent = num;
        while(true){
            quotent = quotent/10;
            if(quotent == 0){
                break;
            }
            length++;
            counter = counter * 10;
        }

        rotate = rotate <= 0 ? (length + rotate)% length:rotate % length;// handle negative
        // find remimber , quotent and the multiplier 
        int rem = 1 ;
        for(int i = 1 ;i<=rotate ;i++){
            rem = rem * 10;
            counter = counter / 10 ;

        }
       System.out.println( (num % rem) * counter +  (num / rem));


    }    }
