package Exception;

public class B {
    public static void main(String [] args){
        int a=10;
       // System.exit(0);
        try {
            int b = a / 10;
        } catch(Exception e){
            throw new RuntimeException(e);
        }finally{
            System.out.println("excueted");
        }


    }


}
