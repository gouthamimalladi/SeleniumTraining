public class Marks {
    public static void main(String[] args) {
        int marks = 50;
        if (marks <= 35) {
            System.out.println("fail");
        } else if (marks > 35 && marks <= 50) {
            System.out.println("first");
        } else if (marks > 50 && marks <= 70) {
            System.out.println("second");
        } else if (marks > 70 && marks <= 90) {
            System.out.println("third");
        }


    }
}