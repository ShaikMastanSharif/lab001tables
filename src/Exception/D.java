package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class D{
    public static void main(String[] args) throws  Exception {
        //checked//complie time
        FileInputStream file = null;
        try {
            file = new FileInputStream("file.txt");
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            if(file!=null)
                try {
                    file.close();
                }catch (IOException e){

                }
        }

        //unchecked//runtime



            int b = 10 / 10;
        System.out.println(b);





        }
}
