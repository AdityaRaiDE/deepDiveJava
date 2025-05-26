
import java.util.*;

public class FindEvenOdd{

    public static void main(String[] args){
        System.out.println("Enter the looping Counter :-> ");
        Scanner sc = new Scanner(System.in);
        int counter = sc.nextInt();
        int break_loop = 1 ;
        while(break_loop <= counter ){
            if(break_loop % 2 == 0){
                System.out.println(break_loop + " is even.");
            }
            else {
                System.out.println(break_loop + " is odd.");
            }
            break_loop++;
        }

    }
}
