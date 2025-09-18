import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        int sum=1;
        for(int i=2;i<=Math.sqrt(n);i++){
            int k = n/i;
            if(n%i==0){
                sum = sum+i;
                if(k!=i){
                    sum+= k;
                }
            }
        }
        if(sum==n){
            System.out.print("perfect number");
        }else{
            System.out.print("not perfect number");
        }
    }
}
