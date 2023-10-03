package StringHandling;

public class RevStringDemo {
    public static void main(String[] args) {
        String s1 ="Automation Catalogue";
        //o/p: eugolataC noitamotuA
        int l = s1.length();
        char ch[]=s1.toCharArray();
        String revString="";

        for(int i=l-1;i>=0;--i){
            revString=revString.concat(String.valueOf(ch[i]));
        }
        System.out.println(revString);
    }
}
