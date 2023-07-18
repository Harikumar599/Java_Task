import java.util.Scanner;

public static class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a firstName: ");
        String root = scanner.nextLine();

 System.out.print("Enter a lastName: ");
        String main = scanner.nextLine();

  char firstCharacter = main.charAt(0);	
  System.out.println("The first character is: " + firstCharacter);

    
    }
}
