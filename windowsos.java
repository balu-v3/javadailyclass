class windowsos
{
	
	
			public static void main(String args[])
			{
				dowloading d=new dowloading();
				installing in=new installing();
				d.start();
							
							in.start();
			}
			

}
class dowloading extends Thread
{
		public void run(){
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				try{
					Thread.sleep(1000);
				}
				catch(Exception e){System.out.println(e);}
			}
		}
}

class installing extends Thread
{
	public void run(){
		for(int i=5;i>0;i--)
		{
			try{
				Thread.sleep(1000);
			}
			catch(Exception e){System.out.println(e);}
			System.out.println(i);
		}
	}
}