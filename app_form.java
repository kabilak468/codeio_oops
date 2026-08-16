public class app_form {
    int rollNo;
    String name;

    //Department is set as private
    private String dept;

    public void display(){
        System.out.println(name);
        System.out.println(rollNo);
    }
    public void setValues(String str,int data){
        name=str;
        rollNo=data;
    }

    //Seting values for a private field
    public void setDept(String val){
        dept=val;
    }

    //Making the private(dept)--->public(dept)
    public String getDept(){
        return dept;
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

        //Accessing private values through functions
        obj2.setDept("CSE");
        System.out.println(obj2.getDept());
    }
}