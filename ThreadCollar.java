public class ThreadCollar 
{
public static void main(String[] args) 
{
	ChildThread ct = new ChildThread();
	//ct.run();
	ct.start();

}

}
