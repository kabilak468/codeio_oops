public class vehicle{
    static int mil=56;
    static void wheels(){
        System.out.println("4 wheels");
    }
}
class bus extends vehicle{
    
}
class Newthing{
    public static void main(String[] args) {
        vehicle.wheels();
        System.out.println(vehicle.mil);
        bus.mil=45;
        System.out.println(vehicle.mil);
    }
}