package Dec5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occourneceChacteer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string?");
        String input=sc.nextLine();
        Map<Character,Integer> map=new HashMap();

        for(int i=0;i<input.length();i++) {
            char c = input.charAt(i);
            if (map.containsKey(c)) {
             int count=   map.get(c);
                count++;
            } else {
                map.put(c, 1);
            }
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
