import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name");
        String name = sc.nextLine();
        System.out.println("student name "+name);
        System.out.println("enter a day");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;
            default:
                System.out.println("enter correct number");


        }
    }
}