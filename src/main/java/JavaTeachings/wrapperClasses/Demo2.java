package JavaTeachings.wrapperClasses;

public class Demo2 {
    public static void main(String[] args) {
        Integer ob1 = new Integer(10);
        int y=ob1.intValue();
        System.out.println(y);

        boolean b=Character.isLowerCase('A');
        System.out.println(b);

        boolean b1= Character.isDigit('B');
        System.out.println(b1);
    }
}
