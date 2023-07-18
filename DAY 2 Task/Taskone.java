import java.util.Scanner;
class Taskone{

public static void main(String args[]){
System.out.println("Hello World");

long a = 34l,b = 10l;
System.out.println("Value of addition :"+ (a+b));

Scanner sc= new Scanner(System.in);
System.out.println("Enter the mark1 : ");
int markone =sc.nextInt();

System.out.println("Enter the mark2 : ");
int marktwo =sc.nextInt();

System.out.println("Product of two Marks :" + (markone*marktwo));

int c = 10 ,d =15; 

System.out.println("Sum is : " + (c+d));
System.out.println("Sub is : " + (c-d));
System.out.println("Mul is : " + (c*d));
System.out.println("Div is : " + (c/d));
System.out.println("Module is : " + (c%d));

byte e=20,f=10,g=5,h=15,i=25;

System.out.println("Byte is :" +(e+f+g+h+i)/5);


System.out.println("Area of Circle");
int j=9;
System.out.println(22/7*(j*j));

System.out.println("Area of Rectangle");
double len = 10;
double wid = 15;

double rec = len*wid;
System.out.println(rec);

System.out.println("Area of triangle");
double base = 12;
double ht = 32;

System.out.println((base*ht)/2);

System.out.println("Area of Equilateral triangle");

double eq= 1.7d;
int rqs=5;
System.out.println(eq*(rqs*rqs)/4);

System.out.println("Rhombus");
short p=56,q=5;
System.out.println((p*q)/2);

System.out.println("Parallelogram");
byte para=2,pas=10;
System.out.println(para*pas);

System.out.println("prism");
byte pr=4,pri=6;
System.out.println(pr*pri);

System.out.println("sphere");
int sp=19;
System.out.println((4/3)*(22/7)*(sp*sp*sp));

System.out.println("cylinder");
System.out.println((22/7)*(pr*pr)*sp);

System.out.println("Concatenate String");
System.out.println("Task"+"Completed");


















}
}