import java.util.* ;

public class Prime{
    public static void main( String[] args){

        System.out.print("Enter The number :->");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 2 ;
        while(true) {
              if ( n % counter == 0){
                System.out.println("The Number is not prime");
                break;
              }
              else{
                counter++;
                if(counter == n){
                    System.out.println("The Number is prime");
                    break;
                }
              }
        }
 

    }



}