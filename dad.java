interface dad {
    //In interface, we can not define the function
    abstract void talk();
}
class Interface implements dad{
    public void talk(){
        System.out.println("Talking");
    }
    public static void main(String[] args){
        Interface obj=new Interface();
        obj.talk();
    }
}