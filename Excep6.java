 import java.util.Scanner;
public class Excep6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner ("hellooo");
        System.out.println(" "+sc.nextLine());

        // check if there is any ioexception
        System.out.println("exception "+sc.ioException ());

        sc.close ();
    }
}
