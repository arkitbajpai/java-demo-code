public class demo2{
    public static void main(String[] args)
    {
        Student s1= new Student();
        Student s2= new Student();
        // basically Student(); is a contructor if we are not defining it then it store the default value zero otherwise what ever values that we are
        //giving it to it.

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
    // creating the constructor for the same.
    // this is methord overloading as well as we are adding more  and more values to the variablles for the same.
    Student()
    {
        name="arkit";
        roll=1;
        age=22;
        Collegename="aktu";
    }
    // this is the contrcutiing channning
    Student(String name , String Collegename)
    {
       this(0,name, 0, Collegename);
    }

    Student(int roll, String name , int age , String Collegename)
    {
        this.name=name;
        this.roll=roll;
        this.age=age;
        this.Collegename=Collegename;
    }

    void markattendence(){
        System.out.println("attendennce is marked by "+ name);

    }
    
    void print(){
        System.out.print(name +","+ roll  +","+ age  +","+Collegename);
    }

}