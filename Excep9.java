public class Excep9 {
    public static void main(String[] args) {
        try{
            Class.forName("Excep8");
        }
        catch(ClassNotFoundException  e){
          //  System.out.println(e);
          System.out.println("class not found");
        }
    }
}
