public class calc {
    /* Polymorphism - The functions are called depending upon the the number of arguments passed 
    (Method overloading) - Creating functions with same name and differentiating them with their no. of arguments passed */
    void add(int a,int b){
        System.out.println("Calling 1st add method");
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println("Calling 2nd add method");
        System.out.println(a+b+c);
    }
}
class polymorph{
    public static void main(String[] args) {
        calc obj=new calc();
        obj.add(8,9);
        obj.add(10,20,30);
    }
}