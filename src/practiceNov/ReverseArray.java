package practiceNov;

import java.util.*;

public class ReverseArray {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the array size");
      int user=sc.nextInt();

      int arr[]=new int[user];
      System.out.println("enter the array value");
      for(int i=0;i<user;i++){
          System.out.println("emter the element"+(i+1));
          arr[i]=sc.nextInt();

      }
        for(int i=user-1;i>=1;i--){
            System.out.print(arr[i]+" ");
        }









      /*  List<Integer> ls =  Arrays.asList(10,20,30);

        Map<Integer,Integer> map = new HashMap<>();
        for(int number : ls){
            map.put(number,map.getOrDefault(number,0)+1);
        }

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.print( entry.getValue());
        }*/
     //  List<Integer> numbers = Arrays.asList(10,20,30,40,50,60,10,20);
       /* Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int number :numbers){
            frequencyMap.put(number,frequencyMap.getOrDefault(number,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:frequencyMap.entrySet()){
            System.out.println("elemnt"+entry.getKey()+" value"+entry.getValue());
        }*/
       /* ListIterator<Integer> iterator = numbers.listIterator(numbers.size());
        while(iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }*/
        //numbers.sort((a,b)-> a-b);
        //System.out.println(numbers);





    }

}
