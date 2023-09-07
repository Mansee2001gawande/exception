public class Excep5 {
    public static void main(String[] args) {
        int a[]=new int [5];
        try{
        a[6]=9;
        System.out.println(a);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException e){
            System.out.println("array length is 5");
        }
    }
}
