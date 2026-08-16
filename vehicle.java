public class vehicle {
    static void wheels(){
        System.out.println("4 wheels");
    }
}
class bus extends vehicle{

}
class Newthing{
    public static void main(String[] args) {
        vehicle.wheels();
    }
}