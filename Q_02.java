import java.util.Scanner;

public class Q_02 {
    public static int countDigits(int i){
        int count=0;
        while (i>0){
            i=i/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int i=0,count=0;
        Scanner scanner=new Scanner(System.in);

        while(true) {
            if (i < 0) {
                System.out.println("Enter a positive value.");
                break;
            }
                System.out.println("Enter a number here");
                i = scanner.nextInt();
                count = countDigits(i);
                System.out.println("The number has "+count+" digits.");
        }
    }
}

