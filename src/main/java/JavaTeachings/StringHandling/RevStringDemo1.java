package JavaTeachings.StringHandling;

public class RevStringDemo1 {
    public static void main(String[] args) {
        String str="Automation Catalogue";
        //o/p: noitamotuA eugolataC
        String revString="";
        String str1[] = str.split(" ");
        for(String str2:str1){
            int l = str2.length();
            char ch[]=str2.toCharArray();
            for(int i=l-1;i>=0;--i){
                revString = revString+ch[i];
            }
            revString= revString+" ";
        }
        System.out.println(revString.trim());
    }
}
