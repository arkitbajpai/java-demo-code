public class demo2{
    public static void main(String[] args)
    {
        Student s1= new Student();
        Student s2= new Student();

        s1.name="arkit";
        s1.roll=1;
        s1.age=22;
        s1.Collegename="aktu";

         s2.name="arkit1";
        s2.roll=3;
        s2.age=22;
        s2.Collegename="aktu";
      
        s1.markattendence();
        s1.print();
        s2.print();

     
    }

}

class Student{
    String name;
    int roll;
    int age;
    String Collegename;

    void markattendence(){
        System.out.println("attendennce is marked by "+ name);

    }
    
    void print(){
        System.out.print(name +","+ roll  +","+ age  +","+Collegename);
    }

}