public class leetcodq1reverseString {
    public static void main(String[] args) {
       char [] str={ 'h','e','l','l','o'};
       reverseString(str);
        System.out.println(str);



    }
    public static void reverseString(char[] c){
        int left=0;
        int right=c.length-1;
        while(left<right){
          char  temp = c[left];
            c[left]=c[right];
            c[right]= temp;
            left++;
            right--;
        }

    }
}
