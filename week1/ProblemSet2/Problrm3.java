import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the FirstName");
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        System.out.println("Enter the LastName");
        String lastName = scan.next();
        System.out.println("Enter the n to print n times");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
             System.out.println(firstName+lastName);
        }
        
    }
}
