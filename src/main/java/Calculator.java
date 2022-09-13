public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int x= cal.add(23,45);
        int y= cal.sub(35,10);
        System.out.println(x);;
        System.out.println(y);


    }
    public int add(int a,int b){
         return a+b;

    }
    public int sub(int a1,int b1){
        return a1-b1;
    }
}
