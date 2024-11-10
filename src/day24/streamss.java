package day24;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.sort;
import static java.util.Arrays.stream;

public class streamss {

    public static void main(String[] args) {
        //List<Integer> num= Arrays.asList(2,5,7,9,6);
        /*num.stream()
                .filter(n-> n%3==1)
                .sorted()
                .map(n -> n*2)
                .forEach(n-> System.out.println(n));*/
       /* List<Integer> data= Arrays.asList(3000,1000,5000,6000,7000);

       long output=  data.stream().filter(sal-> sal>1000 ).count();
        System.out.println(output);*/


        // Integer arr[]={2,5,7,2,7,8,9,1,8,9,6};
        // Arrays.stream(arr).sorted().distinct().forEach(n-> System.out.println(n));
       /* Integer arr[]={5,4,8,9,6,4,1};
          Arrays.stream(arr).sorted((Integer val1,Integer val2)->val2-val1);*/


        // Arrays.stream(arr).sorted().forEach(System.out::println);
       /* Arrays.stream(arr)
                .sorted()
                .distinct()
                .filter(n->n%2==0)
                .limit(5)
                .forEach(System.out::println);*/

     /*Stream<Integer> number=  num.stream().skip(2);
   List<Integer> ls= number.collect(Collectors.toList());
        System.out.println(ls);*/

      /* List<String> number= Arrays.asList("2.55","57.54","5244.2","253.12");
      DoubleStream doubles= number.stream().sorted().mapToDouble((String val)->Double.parseDouble(val));
      double[]dd=doubles.toArray();
        stream(dd).forEach(n->System.out.println(n));*/


    List<Integer> number=Arrays.asList(2,1,4,7,10);
   /* Stream<Integer> numStream=number.stream()
            .filter((Integer val)->val>=3)
            .peek((Integer val)-> System.out.println("number greate"+val))
            .map((Integer val)-> (val*-1))
            .peek((Integer val)-> System.out.println("number add map"+val))
            .sorted()
            .peek((Integer val)-> System.out.println(val));
    List<Integer> filterNumbers=numStream.collect(Collectors.toList());*/

        /*number.stream()
                .filter((Integer val)->val>=3)
                .map((Integer val)->(val*-1)).sorted()
                .forEach((Integer val)->System.out.println(val));*/
       // Optional<Integer> minimum=number.stream().sorted().min((Integer val1, Integer val2)-> val1-val2);
       // System.out.println(minimum.get());


Optional<Integer> maxNumber=number.stream().sorted().max((Integer val1,Integer val2)-> val1-val2);
        System.out.println(maxNumber.get());
    }
}
