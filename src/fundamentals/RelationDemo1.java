package fundamentals;

public class RelationDemo1 {
    public static void main(String[] args) {
        int i=10, j=20;
        boolean test = i>j;//10>20
        System.out.println(test);//false

        int k=20;
        test = (j-i)<=k;//20-10<=20
        System.out.println(test);//true

        boolean test1 = j<=k;//20<=20
        System.out.println(test1);//true

        test1 = j<k;//20<20
        System.out.println(test1);//false

        System.out.println(i>=10);//10>=10//true
        i+=10;//i=i+10//20
        System.out.println(i==j);//20==20//true
        System.out.println(i!=j);//20!=20//false
        System.out.println(15!=k);//15!=20//true
    }
}
