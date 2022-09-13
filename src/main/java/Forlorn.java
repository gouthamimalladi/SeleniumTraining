public class Forlorn {
    public static void main(String[] args) {
        String[] std = {"amar", "kavya", "nil", "asha"};
        System.out.println(std.length);
        System.out.println(std[1]);
        for (int i = 0; i <= 3; i++) {
            System.out.println(std[i]);

        }
        for(int i=3;i<=0;i++){
            System.out.println(std[i]);
        }

        for(String a :std){
            if(a.equals("asha")){
                System.out.println(a);
            }
            System.out.println(a);
        }
    }
}