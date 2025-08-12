import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("enter the triangle sides");
        Scanner scan = new Scanner(System.in);
        int s1 = scan.nextInt();
        int s2 = scan.nextInt();
        int s3 = scan.nextInt();
        int triangle = s1+s2+s3;
        if(triangle == 180){
            System.out.println("Triangle can be formed");
        }else{
            System.out.println("Triangle cannot be formed");
        }
    }
}
