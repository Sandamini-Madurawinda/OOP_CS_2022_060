package LW_01;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the radius of outer circle");
        double r0=scanner.nextDouble();

        System.out.println("Enter the radius of inner circle");
        double r1=scanner.nextDouble();

        Circle outerCircle=new Circle(r0);
        Circle innerCircle=new Circle(r1);

        double outerCircleArea=outerCircle.computeArea();
        double innerCircleArea= innerCircle.computeArea();
        double area= outerCircleArea-innerCircleArea;

        System.out.println("The shader area: "+area);
    }
}
