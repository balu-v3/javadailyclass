import java.util.Scanner;
class bigOfArrary
{

	public static void main(String args[])

{
		int sum=0,i;
		Scanner bs=new Scanner(System.in);
		System.out.println("Enter num of elements in array");
		int ns=bs.nextInt();
		
		int arr[]=new int[ns];
		
		System.out.println("enter array values");
		for(i=0;i<ns;i++)
		{
			arr[i]=bs.nextInt();
		}


		int big=arr[0];


		for(i=0;i<arr.length;i++)
		{
			if(arr[i]>big)
			{
				big=arr[i];
			}
		}
        System.out.println("The Biggie is:"+big);




}
}
