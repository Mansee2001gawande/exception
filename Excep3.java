import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Excep3 {
    public static void main(String[] args) {
        try{
       File ob =new File("google.com") ;
       FileReader ob2 = new FileReader ("file");
        }
        catch(FileNotFoundException e) {
            System.out.println("given file is not found");
        } 
    }
}
//Excep3.java:9: error: unreported exception FileNotFoundException; must be caught or declared to
// be thrown