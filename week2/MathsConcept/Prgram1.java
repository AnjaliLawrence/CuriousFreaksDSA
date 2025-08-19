import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter n value");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count=0;
        while(n>0){
            int remainder = n%10;
            n = n/10;
            count++;
        }
        System.out.println(count);
    }
}
