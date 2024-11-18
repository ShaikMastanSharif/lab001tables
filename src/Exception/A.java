package Exception;

public class A {

    public static void main(String [] args){

        try {
            String st1 = args[0];
        }    catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

      //  int x = Integer.parseInt();
int a=10;
        try {
            int b = a / 0;
            System.out.println(b);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
           // e.printStackTrace();

        }

        String str= null;

        try {
            str.length();
        }catch (NullPointerException e){
           // System.out.println(e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("program is ended");
        }
    }
}
