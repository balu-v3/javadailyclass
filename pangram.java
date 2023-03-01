class pangram
{
 public static void main(String [] args)
{
 	String x="cheril loves with his dintaragon bolwz";
	x = x.replace(" ","");
	char y[]= x.toCharArray();
	int size= y.length;

	int a[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};



	 	int i=0;
	while(i !=26)
	{
		if(a[i]==1)

		{
			++i;
	}
else
	{
		System.out.println("non-pangram");
		System.exit(0);
	}
}
System.out.println("pangram");
}
}