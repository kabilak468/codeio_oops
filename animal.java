//Filename=Parentname

//Parent class
public class animal {
    public void leg(){
        System.out.println("It has four legs");
    }
    public void walk(){
        System.out.println("It can walk");
    }
}
//Child1 class
class dog extends animal{
    public void sound(){
        System.out.println("Says bow");
    } 
}
//Child2 class
class cat extends animal{
    public void sound(){
        System.out.println("Says meow");
    }
}
//child3-Method overriding
class kangaroo extends animal{
    public void leg(){
        System.out.println("It has two legs");
    }
}
class inherit{
    public static void main(String[] args) {
        kangaroo obj =new kangaroo();
        obj.leg();
        obj.walk();
    }
}