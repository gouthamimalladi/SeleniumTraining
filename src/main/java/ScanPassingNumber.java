import java.util.Scanner;

public class ScanPassingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
       int num1 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter 2nd number");
        int num2 = sc1.nextInt();

        add(num1,num2);
    }

    public static void add(int a, int b){
        int sum = a+b;
        System.out.println(sum);
    }
}
