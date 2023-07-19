import java.util.Scanner;

class IfStatement{
public static void main(String args[]){
   
   
   Scanner obj = new Scanner(System.in);
   System.out.println("Enter your age:");
   int age = obj.nextInt();
   if(age>18){
   System.out.println("You are Eligible for Voting");}
   else{
   System.out.println("YOu are not Eligible for Voting");
}


}

}