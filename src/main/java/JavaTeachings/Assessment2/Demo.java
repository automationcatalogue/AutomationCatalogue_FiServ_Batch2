package JavaTeachings.Assessment2;

public class Demo {
    static Employee e1 = new Employee(101,50000);
    static Employee e2 = new Employee(102,80000);
    static Employee e3 = new Employee(103,20000);
    static Employee e4 = new Employee(104,60000);
    static Employee e5 = new Employee(103,10000);

    float totalSalary;

    float sumOfAllSalaries(){
        totalSalary=e1.empSalary+e2.empSalary+e3.empSalary+e4.empSalary+e5.empSalary;
        return totalSalary;
    }

    public static void main(String[] args) {
        Demo ob = new Demo();
        float sum = ob.sumOfAllSalaries();
        System.out.println("Sum of All Employee Salaries are :"+sum);

        Employee emp[]=ob.getEmployeeData();
        for(Employee e:emp){
            if(e.empSalary>=50000){
                System.out.println(e.empNo);
            }
        }
    }

    Employee[] getEmployeeData(){
        Employee emp[] = {e1,e2,e3,e4,e5};
        return emp;
    }
}
