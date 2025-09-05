import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int fact=1;
        for(int i=1;i<=input;i++){
            fact = fact*i;
        }
        System.out.println(fact);
    }
}
