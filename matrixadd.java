import java.util.scanner;
class matrixadd{

	public static void main(String args[])
{
	int i,j;
	scanner bs=new Scanner(System.in);
	system.out.println("Enter num of rows");
	int rows=bs.nextInt();
	system.out.println("Enter num of columns");
	int cols=bs.nextInt(); 

	int arr[][]=new int[rows][cols];
	int brr[][]=new int[rows][cols];
	int res[][]=new int[rows][cols];
	system.out.println("Enter first array values");
	
	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
			{
				arr[i][j]=bs.nextInt();
			}
		}
system.out.println("Enter second array values");

	for(i=0;i<rows;i++)
	{
		for(j=0;j<cols;j++)
			{
				brr[i][j]=bs.nextInt();
			}
		}
{
for(i=0;j<cols;j++)
	{
		res[i][j]=arr[i][j]+brr[i][j];
	}

}
system.out.println("Addition is : ");

for(i=0;i<rows;i++)
	{
	
		for(j=0;j<cols;j++)
            {
			system.out.print(res[i][j]+"  ");
			}
			System.out.println();

	}
















