public class Excep2 {
    public static void main(String[] args) {
        try{
        String str=  "mansee";                            //"mansee gawande";
        System.out.println(str.charAt(3));
        String str2 =null;
        System.out.println(str2.charAt(0)); 
        }
         catch(NullPointerException e) {
            System.out.println("null value does not have 0 index");
        }
         catch(StringIndexOutOfBoundsException e) {
            System.out.println("exception solve");
         }
    }
}
//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.charAt(int)" 
//because "<local1>" is null    a=value is null