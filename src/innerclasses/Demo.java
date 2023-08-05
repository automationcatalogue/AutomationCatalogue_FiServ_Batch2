package innerclasses;

public class Demo {
    public static void main(String[] args) {
        C ob1 = new C(){
            public void show(){
                System.out.println("Core Java!!!!");
            }

            public void display(){
                System.out.println("Advanced Java!!!");
            }
        };

        ob1.show();
        ob1.display();
    }
}
