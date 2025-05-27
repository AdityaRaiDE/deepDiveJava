import java.util.*;
// Here I have kept the 10 increasing by 10 time in every loop iteration 

public class CountNum2{
    public static void main(String[] args){
        System.out.print("Enter the number :-> ");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();
        int modifed_num = num < 0 ? num* -1 : num;
        int count = 1;
        for(int i = 10;i <= modifed_num ; i = i*10){
            count++;
        }
        System.out.println("Total no of digits for num "+ num + " is "+ count);
}


}
