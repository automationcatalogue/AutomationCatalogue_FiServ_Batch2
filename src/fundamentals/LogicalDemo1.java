package fundamentals;

public class LogicalDemo1 {
    public static void main(String[] args) {

        LogicalDemo1 ob1 = new LogicalDemo1();

        int x=90, y=75, z=105;
        boolean test = (x==z) && (y!=x);
                    //90==105 && 75 !=90
                    //false && true --> false
        System.out.println(test);//false

        boolean test1 = (x==z) || (y!=x);
                    //90==105 || 75!=90
                    //false || true --> true
        System.out.println(test1);//true
    }
}
