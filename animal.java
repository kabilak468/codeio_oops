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

class inherit{
    public static void main(String[] args) {
        dog obj =new dog();
        obj.leg();
        obj.walk();
        obj.sound();
    }
}