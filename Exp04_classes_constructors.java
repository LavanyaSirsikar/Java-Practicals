class student{
    int rollno;
    String name;

  student() {
        this(0, "Unknown");
    }

    student(int rollno,String name){
        this.rollno=rollno;
        this.name=name;
    }

    void display(){
        System.out.println(this.rollno);
        System.out.println(this.name);
    }

}


public class Exp04_classes_constructors {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student(1, "lavanya");
        s1.display();
        s2.display();


    }
}
