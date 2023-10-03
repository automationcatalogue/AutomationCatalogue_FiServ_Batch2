package fundamentals;

public class LogicalDemo2 {
    public static void main(String[] args) {
        int x=25, y=26, a=90, b=91;

        boolean flag = x<=y && a<=b;
                    //25<=26 && 90<=91
                    //true && true --> true
        System.out.println(flag);//true

        flag = x<=++y && a<=b++;
            //25<=27 (27) && 90 <=91 (92)
            //true && true --> true
        System.out.println(flag);//true

        flag = ++x>=y || a>b++;
            //26 (26)>=27 || 90>92 (93)
            //false||false --> false
        System.out.println(flag);//false
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of x is:"+x+" Value of y is :"+y);
        //90, 93, 26, 27

    }
}
