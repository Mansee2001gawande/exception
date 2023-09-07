import java.util.InputMismatchException;
import java. util.Scanner;
public class Excep1 {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("enter 1st no");
        int a=sc.nextInt();
        System.out.println("enter 2nd no");
        int b=sc.nextInt();
        
        System.out.print(a/b);       /*Exception in thread "main" java.lang.ArithmeticException: / by zero
                                       at Excep1.main(Excep1.java:10)   a/0 
                                    Exception in thread "main" java.util.InputMismatchException a/2.5   */           
     
    } 
    catch (InputMismatchException e){      //e=java.util.InputMismatchException
         System.out.println("cannot devided by floting no"+e);
    }
    catch(ArithmeticException e){
        System.out.println("no is not devided by zero");
    }
}
}
