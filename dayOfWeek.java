import java.util.*;
class dayOfWeek
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number");
  int day=sc.nextInt();
  if(day==1)
    {
      System.out.println("It is sunday");
    }
  else if(day==2)
    {
      System.out.println("It is monday");
    }
  else if(day==3)
    {
      System.out.println("It is tuesday");
    }
   else if(day==4)
   {
      System.out.println("It is wednesday");
   }
   else
   {
      System.out.println("It i a invaild day");
   }
         

}   

}