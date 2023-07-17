package oops;

public class ForEachDemo {
    public static void main(String[] args) {
        int a[] = {72,45,500,68,95,67,89,23,45,31};

        int oddSum=0;
        for(int b:a){
            if(b%2!=0){
                oddSum=oddSum+b;
            }
        }
        System.out.println("Sum of All Odd Numbers is :"+oddSum);
    }
}
