import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the input");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String str = scan.next();
        char ch = scan.next().charAt(0);
         System.out.println("your Input");
        System.out.println(num);
        System.out.println(str);
        System.out.println(ch);
    }
}
