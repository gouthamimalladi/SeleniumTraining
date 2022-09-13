import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int num1 = sc.nextInt();
        System.out.println("Enter 2st number");
        int num2 = sc.nextInt();
        //System.out.println("Enter 2nd number");
        add(num1,num2);

    }
    public static void add(int y,int z){
        int x= y+z;
        System.out.println(x);

    }
}
