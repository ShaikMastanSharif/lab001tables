package day22;

import java.util.HashSet;

public class Hashmap {

    public static int union(int arr1[], int arr2[]) {
        HashSet<Integer> sets=new HashSet<>();
       /* for(int i=0;i<arr1.length;i++){
            sets.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            sets.add(arr2[j]);
        }
        return sets.size();
    }*/
        int count=0;

      for (int i=0;i<arr1.length;i++){
          sets.add(arr1[i]);
      }
      for(int j=0;j<arr2.length;j++){
          if(sets.contains(arr2[j])){
              count++;
              sets.remove(arr2[j]);
          }
      }

return count;
    }

    public static void main(String[] args) {

       int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,9,4};
        System.out.println(union(arr1,arr2));
    }

}