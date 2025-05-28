// basic recursion is used to solve this problem
 import java.util.*;
 public class AddDigitTillSingleDigit {
   public static void main(String[] args){

       System.out.print("Enter the num :-> ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       int modified_num = num < 0? num * -1 :num;//modified_num will always be +ve.
       int addedNum = 0;
       if(modified_num > 0 ){
          addedNum = new Sum().add(modified_num);// this will add the all number first time 
          while(addedNum >=10){
            addedNum = new Sum().add(addedNum);// this will keep adding the digits till
                                                   // we rech below 10 
          }

       }
            System.out.println("Single digit sum is :-> " + (num < 0? addedNum* -1 :addedNum));

   }
   
}
// value --> add --> value ( it can be multiple / single digit num )
  class Sum{
    public int add(int num){
      int addedNum = 0;
      while(num > 0 ){
         // add the remainder 
         // replace the num by it's quotent 
         addedNum = addedNum + (num % 10);
         num = num / 10;
      }
      return addedNum;
    }
 }
 
