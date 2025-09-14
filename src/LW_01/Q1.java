package LW_01;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner((System.in));
        System.out.println("Enter an odd-length word");
        String word= scanner.next();

        int n=word.length();
        //System.out.println(n);
        int a=n/2;
        //  System.out.println(word.substring(a,a+1));
        System.out.println("The middle letter of the word is "+word.substring(a,a+1));
    }
}

