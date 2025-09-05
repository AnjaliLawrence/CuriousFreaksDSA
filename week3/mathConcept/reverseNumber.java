import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int sum=0;
        while(input>0){
            int lastDigit = input%10;
            sum = (sum*10) + lastDigit;
            input = input/10;
        }
        System.out.println(sum);
    }
}
