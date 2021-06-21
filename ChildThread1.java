public class ChildThread extends Thread 
{
public void run()
{
//System.out.println(this.getState());
for(int i=1;i<10;i++)
{
System.out.println("Child Thread " + i );
}
if(isAlive())
{
System.out.println("RUNNING");
}
}
}
