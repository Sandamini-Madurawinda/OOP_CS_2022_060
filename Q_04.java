import java.util.Scanner;

public class Q_04 {
    public static void main(String[] args) {
        final int size=5;
        int number[] =new int[size];

        System.out.println("Enter values for array");
        Scanner scanner=new Scanner(System.in);
    for(int i=0;i<size;i++){
        System.out.println("value"+(i+1));
        number[i]=scanner.nextInt();
    }
    int largest=Integer.MIN_VALUE;
    int secondLargest=Integer.MIN_VALUE;
    for(int i=0;i<size;i++){
        if(number[i]>largest){
            secondLargest=largest;
            largest=number[i];
        }
    }
    System.out.println("second largest number is "+ secondLargest);
    }

}
