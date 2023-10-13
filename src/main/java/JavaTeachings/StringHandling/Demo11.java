package JavaTeachings.StringHandling;

public class Demo11 {
    public static void main(String[] args) {
        String s1 = "Fi-Serv Batch2 Automation learning is interesting";
        String str[]=s1.split("is");
        for(String s2:str){
            System.out.println(s2);
        }
    }
}
