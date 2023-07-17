package oops;

public class ArraysDemo {
    public static void main(String[] args) {
        int a[] = {72,45,500,68,95,67,89,23,45,31};

        int oddSum=0;
        for(int i=0;i<a.length;++i){

            if(a[i]%2!=0) {
                oddSum = oddSum+a[i];
            }
        }
        System.out.println("Sum of all Odd Number is :"+oddSum);
    }
}
