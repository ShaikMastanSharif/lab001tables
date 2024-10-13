public class AverageElements {
    public static void main(String[] args) {
        int[] num={1,2,3,4,5};
        int total=0;
        for(int e:num){
            total=total+e;
        }
        System.out.println(total);
        System.out.println(total/num.length);
    }
}
