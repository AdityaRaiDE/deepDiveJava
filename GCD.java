import java.util.*;
public class GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int orn1 = n1;
        int orn2 = n2;
        while( true){
            int rem = n1 % n2;
            if(rem == 0){
              System.out.println(n2);
              break;
            }
            n1 = n2;
            n2 = rem;

        }
        int lcm = (orn1 * orn2)/n2;
        System.out.println("GCD :->" +n2 + " LCM :-> "+lcm);
    }
}
