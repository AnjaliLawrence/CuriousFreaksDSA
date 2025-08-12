import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Enter the marks");
        Scanner scan = new Scanner(System.in);
        int marks = scan.nextInt();
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid mark");
        }else if(marks>=90){
            System.out.println("Grade A");
        }else if(marks>=80){
            System.out.println("Grade B");
        }else if(marks>=60){
            System.out.println("Grade C");
        }else if(marks>=35){
            System.out.println("Grade D");
        }else{
             System.out.println("Fail");
        }
        
    }
}
