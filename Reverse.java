import java.util.*;
public class Reverse{
    public static void main(String[] args){
        System.out.print("Enter the number :-> ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int modified_num = num < 0 ? num * -1 : num;
        int reverse_num = 0;
        while(modified_num > 0){
            reverse_num = (reverse_num * 10) + (modified_num % 10);
            modified_num = modified_num / 10;
        }
        System.out.println("Reverse Num is :-> " + (num < 0 ? reverse_num * -1 : reverse_num));
    }
}
