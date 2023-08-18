package exceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    static FileInputStream ob;
    public static void main(String[] args) {
        try{
            ob = new FileInputStream("C:\\Users\\AaradhyaVashisht\\Desktop\\Anudeep D.docx");
        }catch (FileNotFoundException fe){

        }finally {

        }

    }
}
