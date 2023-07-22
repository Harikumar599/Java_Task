import java.util.Scanner;
public class kgm{
    public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
       System.out.print("ENTER THE FIRST NUMBER: ");
        int firstNumber = scanner.nextInt();

        System.out.print("ENTER THE SECOND NUMBER: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Expected Output: " + sum);
        }
}