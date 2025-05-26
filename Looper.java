import java.util.*;

public class Looper{
    public static void main(String[] args){

        System.out.print("Enter the number :->");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int counter = 1 ;
        while(counter <= y){

            System.out.println("Current Number is :-> " + counter);
            counter++;
        }
    }


}