 import java.util.* ;
 public class Count{
     public static void main(String[] args){
        System.out.print("Enter the nymber :-> ");
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int divisor = y;
        int counter = 1;
        while(true){
            divisor = divisor / 10;
            if(divisor == 0){
                System.out.println(y + " The count of digit is :-> " + counter);
                break;
            }
            counter++;

            
        }


     }



 }