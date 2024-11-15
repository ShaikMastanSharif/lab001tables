package day22;
import javafx.beans.binding.ListBinding;

import java.util.*;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class frequency {
    public static void main(String[] args) {
        //List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,10,20);
        /*Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int number :numbers){
            frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:frequencyMap.entrySet()){
            System.out.println("elemnt"+entry.getKey()+" value"+entry.getValue());
        }*/
       /*Map<Integer,Long> result=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);*/
       /* Map<Integer,Long> result=numbers.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(result);*/


       // List<Integer> number1= Arrays.asList(10,20,30,50,40,10,20);
       /* Map<Integer,Integer> hs = new HashMap<>();
        for(int number:number1){
            hs.put(number,hs.getOrDefault(number,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hs.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());*/

        //}

        //reverse order
        //number1.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));
        int arr[]={1,2,3,4,5};
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");


            }
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");

        }




    }
}
