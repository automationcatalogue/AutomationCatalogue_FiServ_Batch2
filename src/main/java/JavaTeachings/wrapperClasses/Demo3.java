package JavaTeachings.wrapperClasses;

public class Demo3 {
    public static void main(String[] args) {
        String str = "FiServ Batch2 @ Pune5 & Chennai9 Learning Core JAVA!!";

        System.out.println(str);

        int uc=0,lc=0,nc=0, sc=0;

        for(int i=0;i<str.length();++i){
            char ch = str.charAt(i);

            if(Character.isUpperCase(ch)){
                ++uc;
            }else if(Character.isLowerCase(ch)){
                ++lc;
            }else if(Character.isDigit(ch)){
                ++nc;
            }else if(ch!=' '){
                ++sc;
            }
        }
        System.out.println("Number of Uppercase characters are :"+uc);
        System.out.println("Number of Lowercase characters are :"+lc);
        System.out.println("Number of Number characters are :"+nc);
        System.out.println("Number of Special characters are :"+sc);
    }
}
