package sorting;

public class frontSorting {
    public static void PrintArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(i);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={7,3,6,3,1,8,5,3,7,2,6,3,8,};
        for(int i=0;i<arr.length-1;i++){
            int small=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[small]>arr[j]){
                    small=j;
                }

            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        PrintArray(arr);
    }

}
