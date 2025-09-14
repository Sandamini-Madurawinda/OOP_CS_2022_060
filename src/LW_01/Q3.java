package LW_01;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length in centimetres:");
        float cm = scanner.nextFloat( );

        double inches= cm/2.54;

        double feet=(int)inches/12;
        inches=(int)inches %12;

        System.out.println("Feet:"+feet+" inches:"+inches );


    }
}
