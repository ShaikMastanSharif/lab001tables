import java.util.HashSet;

public class dupicatescharcters {
    public static void main(String[] args) {
       String st ="Programming";
       HashSet<Character> set = new HashSet<Character>();
       for (char c: st.toCharArray()){
           if(!set.add(c)){
               System.out.println(c);
           }
       }


    }
}
