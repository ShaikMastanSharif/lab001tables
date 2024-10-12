public class charcterDuplicate {

    public static void getAccaourence(String str, char val){
        int count=0;
        for(char c : str.toCharArray()){
            if(c==val){
                count++;
            }
        }
        System.out.println(val +" : " + count);

    }

   public static void  getanother(String str ,char val){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==val){
                count++;
            }
        }
       System.out.println(val+" :"+count);
    }


    public static void main(String[] args) {
        String st = "i love coding and testing";

        getAccaourence(st,'g');
        getanother(st,'o');
    }
}
