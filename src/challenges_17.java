import java.util.Scanner;

public class challenges_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num = input.nextInt();
        int sum = SumOfDigits(num);
        System.out.println("The Sum Of Digit is:" +sum);

    }

    public static int SumOfDigits( int num ) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
