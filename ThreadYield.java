public class ThreadYield extends Thread
{
public static void main(String[] args) throws InterruptedException
{
ThreadYield ty = new ThreadYield();		
ChildThread ct = new ChildThread();
ct.start();//1
ct.join();
ty.start();
//ct.setPriority(4);
//ty.setPriority(5);
for(int j=1;j<=5;j++)
{	
System.out.println("From Main Method " + j);
}
}
public void run()
{
	for(int i=1;i<=5;i++)
	{
		//Thread.yield();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		System.out.println("From Run Method " + i);
	}
}
}
