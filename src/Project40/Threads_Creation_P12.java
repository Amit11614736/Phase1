package Project40;

public class Threads_Creation_P12 extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
 		Threads_Creation_P12  mt = new  Threads_Creation_P12 ();
  		mt.start();
 	}
}

