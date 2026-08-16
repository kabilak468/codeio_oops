//Multiple inheritance is used here

interface dad{
    abstract void talk();
}
interface mom{
    abstract void talk();
}
public class multiple implements dad,mom{
    public void talk(){
        System.out.println("Talking");
    }
}
