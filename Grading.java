import java.util.*;
/*
 * what is the issue with below code ?
 * there is an extra and codnition in if and else if . beacsue if marks is less than 90
 * then only it will go for below else if block and same thing goes till the last elseif
 *  else if( marks > 80 & marks <=90) :->  else if( marks > 80 )
 *  else if( marks > 70 & marks <=80) :-> else if(marks>70)
 * else if( marks > 60 & marks <=70) :-> else if(marks>60)
 */
public class Grading{

    public static void main(String[] args){

        System.out.print("Enter the marks :-> ");
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();
        if(marks > 90){
            System.out.println("1:Excellent");
        }
        else if( marks > 80 & marks <=90){
            System.out.println("2:Good");
        }
        else if( marks > 70 & marks <=80){
            System.out.println("3:fair");
        }
        else if( marks > 60 & marks <=70){
            System.out.println("4:Meets Expectations");
        }
        else{
            System.out.println("5:Below Par");
        }




    }


}