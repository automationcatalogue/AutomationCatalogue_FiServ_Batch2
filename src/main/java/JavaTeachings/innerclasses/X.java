package JavaTeachings.innerclasses;

public class X {//Outer Class
    int a=10;
    static int b=20;

    void show(){
        System.out.println("CoreJava!!!");
    }
    static void display(){
        System.out.println("AdvancedJava!!!");
    }

    static class Y{//Inner Class
        int c=30;
        static int d=40;

        void print(){
            System.out.println("JavaScript!!!!");
        }
        static void test(){
            System.out.println("Python!!!");
        }
    }
}
