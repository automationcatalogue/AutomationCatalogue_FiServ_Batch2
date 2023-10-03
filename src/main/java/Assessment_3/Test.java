package Assessment_3;

public class Test {
    public static void main(String[] args) {
        char math[]={'m','a','t','h'};
        char grade10[]={'g','r','a','d','e','1','0'};

        Subject ob_subject = new Subject(101,math);
        ClassRoom ob_classRoom = new ClassRoom(1,grade10);

        Student ob_student = new Student(1,16,'M',101,ob_classRoom);
        Teacher ob_teacher = new Teacher(101,35,'F',10,ob_subject);

        ob_student.display();
        ob_teacher.display();
    }
}
