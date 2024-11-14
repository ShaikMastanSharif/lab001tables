package Task_nov14;

public class D1 {
    public static void main(String[] args) {


        atb t =new atb("sharif");

    }

}



class atb {
    {
        System.out.println("iib");
    }

    static {
        System.out.println("sib");
    }




    private String name;
    private String clas;


    private String ATB_clas;

public atb(String name){
    this.name=name;
}


    public String getName(){
        return  name;
    }
    public  void  setName(String name){
        this.name= name;
    }
    public String getClas(){
        return clas;
    }
    public void setClas(String clas){
        this.clas=clas;

    }
    public String getATB_clas(){
        return  ATB_clas;
    }
    public void setATB_clas(String ATB_clas){
        this.ATB_clas=ATB_clas;
    }


}


