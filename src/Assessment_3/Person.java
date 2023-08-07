package Assessment_3;

public class Person {

    private int id;

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    private int age;
    private char gender;

    Person(int x, int y, char z){
        this.id=x;
        this.age=y;
        this.gender=z;
    }

    void display(){
        System.out.println("Id  value is :"+id);
        System.out.println("Age value is :"+age);
        System.out.println("Gender Value is :"+gender);
    }
}
