public class ThreadCollar1
{
public static void main(String[] args) 
{
ChildThread ct = new ChildThread();
//ct.run();
System.out.println(ct.getState());//it concerns,thread life cycle state
System.out.println(ct.getName());//default thread name is der
ct.setName("MY THREAD");//we can set d customized name
ct.start();
System.out.println(ct.getState());
System.out.println(ct.getName());
System.out.println(ct.getPriority());
ct.setPriority(6);
for(int i=1;i<10;i++)
{
System.out.println("Main Thread " + i);
}
}
}
