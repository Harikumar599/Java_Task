import java.util.Scanner;

class main{
public static void main(String args[]){

 Scanner obj = new Scanner(System.in); 
 System.out.println("Enter your mark:"); 
int m = obj.nextInt();
if((m >= 0) && (m <= 39)){
 System.out.println("Your Grade D") ;
}
else if((m >= 40) && (m <= 59)){
System.out.println("Your Grade C");
}
else if((m >= 60) && (m <= 79)){
System.out.println("Your Grade B");
}
else if((m >= 80) && (m <= 89)){
System.out.println("Your Grade A");
}
  else if((m >= 90) && (m <= 100)){
System.out.println("Your Grade 0");
}
else{
System.out.println("Check your mark");
}
 }
}