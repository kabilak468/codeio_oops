public class inheritance {
    public static void main(String[] args) {
        son obj=new son();
        System.out.println(obj.gender);
        obj.print();
    }
}
class grandfather{
    String gender="M";
    void print(){
        System.out.println("first class");
    } 
}
class father extends grandfather{
    String gender="M";
    void print(){
        System.out.println("second class");
    }    
}
class son extends father{
    
}