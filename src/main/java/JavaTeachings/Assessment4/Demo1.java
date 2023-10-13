package JavaTeachings.Assessment4;

public class Demo1 {
    public static void main(String[] args) {
        Demo1 ob = new Demo1();
        ob.checkAntiClockWise();
    }


    void checkAntiClockWise(){
        String s1 = "fiserv", s2="rvfise";

        int length = s1.length();
        String clock = s1.substring(length-2, length);

        if(s1.length()!=s2.length()){
            System.out.println("No");
        }else{
            String s3=s1.substring(0,length-2);
            s3=clock+s3;
            if(s3.equalsIgnoreCase(s2)){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}
