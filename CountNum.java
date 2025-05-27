import java.util.*;
public class CountNum{
    public static void main(String[] args){

        System.out.print("Enter the number :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int modifed_num = num < 0 ? num* -1 : num;
        // user will enter one digit number atleast
        // ternary operator like expression? true_value:false_value
        // in case of number try to handle the default conditions like -ve and 0
        int count = 0;
        if(modifed_num == 0){
            count = 1;
            }
        else{
        while(modifed_num >0){
            modifed_num = modifed_num / 10;
            count++;

        }
    }
        System.out.println("Total no of digits for num "+ num + " is "+ count);
    }

}
