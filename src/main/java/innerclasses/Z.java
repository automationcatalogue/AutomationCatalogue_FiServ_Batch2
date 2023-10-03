package innerclasses;

public class Z {
    public static void main(String[] args) {
       Z ob1 = new Z();
       ob1.display();
    }

    void display(){
        class Test{
            void show(){
                System.out.println("Core Java!!!");
            }
        }
        Test ob1 = new Test();
        ob1.show();
    }
}
