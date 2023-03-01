import java.util.Scanner;
class biggest{
public static void main(String args[])
{  
   //creating a object for scanner
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter first number");
   int num1=sc.nextInt();
   System.out.println("Enter second nummber");
   int num2=sc.nextInt();
   if(num1>num2)
   { 
     //if condition is true
     System.out.println(num1+"is the biggest");
   }
   else
       {
         //if condition is flase
         System.out.println(num2+"is the biggest");
       } 
}

}