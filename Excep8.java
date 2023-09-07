public class Excep8 {
    public static void method (int a){
        try {
        if(a>=18) 
        System.out.println("you are eligible for voting");
         else 
           // System.out.println("you are not eligible for voting");
           throw new IllegalArgumentException ("you are not eligible for voting");
        }
        catch(java.lang.IllegalArgumentException e){
            System.out.println("write sopln");
        }
        
    }
        public static void main(String[] args) {
            Excep8.method(15);
        }

    }

