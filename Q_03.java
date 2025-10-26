import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        int noOfRows;
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many rows in pyramid");
        noOfRows=scanner.nextInt();
        for(int i=1;i<=noOfRows;i++){
            for(int j=noOfRows;j>i;j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
