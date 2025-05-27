import java.util.*;

public class PrimeTillN{
    public static void main(String[] args){
        // find all prime till a given number 
        System.out.print("Enter the Number :->");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int counter = 2;
        while(counter <= num){
            boolean isPrime = true;
            // for 1,2,3 we have to make sure that below loop should not get executed 
            // if the loop does not get executed then by default isPrime will be True
            // 1 is not prime .
            // reducing the alternate number to go inside the for loop
            // just like 2 we can include the 5 , 7 but unnecessary it will increase maintaince 
            if(counter > 2 && counter % 2 == 0){
                isPrime = false;
            }
            else{
                for(int i = 2;i * i <= counter;i++){
                    if(counter % i == 0){
                        isPrime = false;
                        break;
                    }
                }
            }
            if(isPrime){
                System.out.println(counter);
            }
            counter++;
        }
    }

}
