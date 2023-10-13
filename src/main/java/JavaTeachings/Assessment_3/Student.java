package JavaTeachings.Assessment_3;

public class Student extends Person{

    private int rollNumber;
    private ClassRoom obj_ClassRoom;

    Student(int x, int y, char z,int a, ClassRoom ob1){
        super(x,y,z);
        this.rollNumber=a;
        this.obj_ClassRoom=ob1;
    }

    void display(){
        System.out.println("Student Roll Number is :"+rollNumber);
        super.display();
    }
}
