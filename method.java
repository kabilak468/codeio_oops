public class method{
    public static void main(String[] args) {
        display();
        System.out.println(add(5,10));
    }
    //void function with no parameters
    public static void display(){
        System.out.println("Displaying sum !");
    }
    //non-void function with parameters
    public static int add(int a,int b){
        int c=a+b;
        return c;
    }
}