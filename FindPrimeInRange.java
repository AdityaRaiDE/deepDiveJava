import java.util.*;

public class FindPrimeInRange{
    public static void main(String[] args){
        // find all prime till a given number 
        System.out.print("Enter the First Number :->");
        Scanner scOne = new Scanner(System.in);
        int numOne = scOne.nextInt();
        System.out.print("Enter the Second Number :->");
        Scanner scTwo = new Scanner(System.in);
        int numTwo = scTwo.nextInt();       
        int counter = numOne;
        while(counter <= numTwo){
            boolean isPrime = true;
            // There is 2 optimization one is upper limit should be root n
            // as soon as we get the divisor break the loop
            // donot enter into the loop when there is even number 
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
