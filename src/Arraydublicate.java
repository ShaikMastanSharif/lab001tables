import java.util.HashSet;

public class Arraydublicate {

    public static void main(String[] args) {
        String st[]={"amazon","gcp" ,"tcs","info","amazon","tcs","value","gcp"};
        //hashset
        HashSet<String> data = new HashSet<String>();
        for (String e:st){
            if(data.add(e)==false){
                System.out.println(e);
            }
        }

        //brunt force
        for(int i =0 ;i<st.length;i++){
            for(int j=i+1;j<st.length;j++){
                if(st[i]==st[j]){
                    System.out.println(st[i]);
                }
            }
        }
    }
}
