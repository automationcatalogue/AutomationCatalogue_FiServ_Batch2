package JavaTeachings.oops.constructors;

public class Demo2 {
    public static void main(String[] args) {
        Emp1 e1 = new Emp1(101, 10000.00f);
        System.out.println(e1.empNo+"-"+e1.empSalary);

        Emp1 e2 = new Emp1(102, 20000.00f);
        System.out.println(e1.empNo+"-"+e1.empSalary);


    }
}
