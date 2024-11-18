package Exception;

public class c {
    public static void main(String[] args) {


        try {

            String sh = args[0];
            int a = Integer.parseInt(sh);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());//ArrayIndexOfBoundException
        }

        int b =10/0;

        System.out.println(b);
    }
}
