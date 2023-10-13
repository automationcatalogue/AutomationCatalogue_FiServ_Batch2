package JavaTeachings.fundamentals;

public class TernaryDemo1 {
    public static void main(String[] args) {
        int x=100, y=900;
        float z=(x<y) ? 10.56f : 65.23f;
        System.out.println(z);

        char ch='G';
        char x1=(ch==99)?100:'G';
        System.out.println(x1);

        int x2=(ch==99)?100:'G';
        System.out.println(x2);
    }
}
