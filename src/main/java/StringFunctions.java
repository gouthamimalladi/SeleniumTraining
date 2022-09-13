import java.util.Locale;

public class StringFunctions {
    public static void main(String[] args) {
        String name = "sunny ";
        String name1 = "SIRI";
        System.out.println("length "+name.length());
        System.out.println("uppercase "+name.toUpperCase());
        System.out.println("lowercase "+name1.toLowerCase());
        System.out.println("first "+name.substring(0,1).toUpperCase());
        System.out.println("character "+name.charAt(3));
        System.out.println("concatenation "+name.concat(name1));
        System.out.println("contains "+name.startsWith("su"));
        System.out.println("contains "+name.endsWith("ny"));
        System.out.println("contains "+name.contains("un"));
        System.out.println("equal "+name.equals("sunny"));
        System.out.println("case "+name.equalsIgnoreCase("SUNNY"));
        System.out.println("replace "+name.replace("n","N"));
        System.out.println(name.trim().length());
    }
}
