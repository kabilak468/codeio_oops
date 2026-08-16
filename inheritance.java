public class inheritance {
    public static void main(String[] args) {
        son obj=new son();
        System.out.println(obj.gender);
        obj.print();
    }
}
class father{
    String gender="M";
    void print(){
        System.out.println("Parent class");
    }    
}
class son extends father{
    
}