public class inheritance {
    public static void main(String[] args) {
        child obj=new child();
        System.out.println(obj.gender);
        obj.print();
    }
}
class father{
    String gender="M";
    void print(){
        System.out.println("first class");
    } 
}
class daughter extends father{
    String gender="F";
    void print(){
        System.out.println("second class");
    }    
}
class son extends father{
    String gender="M";
    void print(){
        System.out.println("third class");
    } 
}

class child extends daughter{
    String gender="F";
    void print(){
        System.out.println("fourth class");
    }  
}