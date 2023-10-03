package fundamentals;

public class AssignmentDemo1 {
    public static void main(String[] args) {
        int i=9, j=3, k=4;
        i+=10;//i=i+10==>19
        j-=i;//j=j-i ==> 3-19=-16
        System.out.println("Value of i is :"+i+" value of j is:"+j);//19,-16

        int a=10, b=45;
        b+=a;//b=b+a==>45+10=55
        System.out.println("Value of a is :"+a+" Value of b is :"+b);//10,55

        a-=b;//a=a-b==> 10-55=-45
        System.out.println("Value of a is :"+a+" Value of b is :"+b);//-45,55

        int c=(a*=3);//a=a*3==>-135, c=-135
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of c is :"+c);//-135,55,-135

        c/=10;//c=c/10
        System.out.println("Value of c is :"+c);//-13

        b%=c;//b=b%c==>55%13==> 3
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of c is :"+c);//-135, 3, -13

    }
}
