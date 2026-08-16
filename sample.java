public class sample {
    String name;
    int rollNo;

    //Parameterised Constructor
    sample(String user,int roll){
        name=user;
        rollNo=roll;
    }
    
    //Non-Parameterised Constructor creation
    /*
    sample(){
        //Always used as default values
        name="Kabi";
        rollNo=167;
    }
    */
}
class constructor{
    public static void main(String[] args) {
        sample sp=new sample("Kabi",167);
        System.out.println(sp.name);
        System.out.println(sp.rollNo);
    }
}