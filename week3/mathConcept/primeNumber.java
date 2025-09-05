import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the input");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        for(int i=2;i<=input;i++){
            int flag=0;
            for(int x=2;x<i;x++){
               if(i%x==0){
                    flag=1;
                }                          
            }
           if(flag==0){
               System.out.println(i);
           }
        }
    }
}
