import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        numSum(num);


    }
    public static void numSum(int a){
        int b = a % 10;
        int c = a / 100;
        a = a / 10;
        a = a % 10;
        System.out.println(a + b + c);
    }
}