public class app_form {
    int rollNo;
    String name;
    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
    public void setValues(String str,int data){
        name=str;
        rollNo=data;
    }
}
class Main{
     public static void main(String[] args) {
        //Creating an object
        app_form obj1=new app_form();
        //Passing values through fields
        obj1.name="Kabi";
        obj1.rollNo=167;
        obj1.display();
        //Passing values through methods
        app_form obj2 = new app_form();
        obj2.setValues("Dhanu",130);
        obj2.display();
    }
}