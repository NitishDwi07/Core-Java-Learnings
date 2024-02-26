import java.util.*;

class readingfromkeyboard {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = a + b;
        System.out.println("the sum is=" + c);
        sc.close();
    }
}