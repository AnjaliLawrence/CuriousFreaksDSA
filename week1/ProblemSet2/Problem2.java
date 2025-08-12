import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the x");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x<0){
            System.out.println("Negative Number");
        }else{
            System.out.println("Your Output");
        }
        for(int i=1;i<=1000;i++){
             System.out.println(x*i);
        }
        
    }
}
