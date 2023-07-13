package fundamentals;

public class IfElseDemo4 {
    public static void main(String[] args) {
        int m=65, e=79, so=68, sc=72, h=63;

        float total = m+e+so+sc+h;
        System.out.println("Total Marks are :"+total);

        float avg = total/5;
        System.out.println("Average Marks are :"+avg);

        if(avg>=70){
            System.out.println("Distinction!!!");
        }else if(avg>=60 && avg<70){
            System.out.println("First Class!!!");
        }else if(avg>=50 && avg<60){
            System.out.println("Second Class!!!");
        }else if(avg>=40 && avg<50){
            System.out.println("Third Class!!!");
        }else if(avg<40){
            System.out.println("Failed");
        }

    }
}
