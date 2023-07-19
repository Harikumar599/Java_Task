import java.util.Scanner;

class NestedIfExample{
public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     System.out.println("Your age:");
     int age = sc.nextInt();
     if(age >= 17){
System.out.println("Success");
     System.out.println("Enter your Mark:");
     int mark = sc.nextInt();
if(mark >= 60){
System.out.println("Apply");
}else{
System.out.println("Not ok");
}
      } else{
      System.out.println("Not Eligible");
}
 
  
}
}