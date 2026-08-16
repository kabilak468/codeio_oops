//abstract class
abstract class computer {
    void print(){
        System.out.println("Printing 'Hello'");
    }
}
//Abstract class cannot be accessed directly..instead we can inherit the class and use it...
//Objects cant be created for abstracted methods
class hp extends computer{
}
class Abstract{
    public static void main(String[] args) {
        hp obj=new hp();
        obj.print();
    }
}
