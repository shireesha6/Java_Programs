public class TypeConversion {
    public static void main(String[] args) {

        int a = 25;
        double b = a;

        double c = 50.75;
        int d = (int) c;

        char ch = 'Z';
        int ascii = ch;
          
        int s=63;
        char e=(char)s;

        System.out.println("Integer to Double = " + b);
        System.out.println("Double to Integer = " + d);
        System.out.println("Character to ASCII = " + ascii);
        System.out.println("ASCII to Character = " + e);
    }
}
