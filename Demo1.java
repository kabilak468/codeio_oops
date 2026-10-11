abstract class person {
    String name;
    int age;
    String address;
    abstract void display();
    void setdata(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }
}
class student extends person{
    int id;
    void deptid(int id){
        this.id=id;
    };
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
class teacher extends person{
    double salary;
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }
}
public class Demo1{
    public static void main(String[] args) {
        student s1=new student();
        s1.deptid(1123);  
        s1.display();
        s1.setdata("Kabi",18,"xxx");
        teacher t1=new teacher();
        t1.display();
        t1.setdata("Kabi",18,"xxx");
    }
}