public class Excep4 {
    public static void main(String[] args) {
        String str = "94";
        int num = Integer.parseInt(str);
        System.out.println(num + 6);    // it executes fine 

        try {
        int num2 = Integer.parseInt("mansee");
        System.out.println(num2);
        }
        catch (NumberFormatException e){
            System.out.println("string cannot convert in int");
        }


    }
    
}
