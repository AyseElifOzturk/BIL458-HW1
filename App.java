import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the 2 numbers:");
        int first = scan.nextInt();
        int second = scan.nextInt();
        System.out.println("First number:"+first+"  Second number:"+second);
        scan.close(); //Closing the scanner to avoid any leaks

        System.out.println("---Switching the numbers---");
        int temp = first;
        first = second;
        second = temp;
        System.out.println("First number:"+first+"  Second number:"+second);
        
    }
}
