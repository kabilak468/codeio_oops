public class app_form {
    int rollNo;
    String name;
    public static void main(String[] args) {
        //Creating an object
        app_form obj=new app_form();
        obj.name="Kabi";
        obj.rollNo=167;
        obj.display();
    }
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
}
