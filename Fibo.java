import java.util.* ;

public class Fibo{
    public static void main(String[] args){

        System.out.print("Enter How many number of fibo series you want :-> ");
        Scanner sc = new Scanner(System.in);
        int stop = sc.nextInt();
        int first = 0 ;
        int second = 1;
        int third;
        int counter = 0;
        while( counter <= stop){
            if(counter == 0){
                System.out.print(first + ",");
            }
            else if( counter == 1){
                System.out.print(second+ ",");
            }
            else{
                third = second;
                second = first + second;
                first = third;
                System.out.print(second+ ",");

            }
            counter++;
        }
    }



}