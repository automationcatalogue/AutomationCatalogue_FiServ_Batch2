package Assessment_3;

public class Teacher extends Person{
    private int experienceYears ;
    private Subject specialization;

    Teacher(int x, int y, char z,int a, Subject ob1){
        super(x,y,z);
        this.experienceYears=a;
        this.specialization=ob1;
    }

    void display(){
        System.out.println("Teacher experience years is :"+experienceYears);
        super.display();
    }


}
