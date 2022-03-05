package Project40;

public class Multithreading_with_and_without_synchronization_P14 

{ 
    public void send(String msg) 
    { 
        System.out.println("Sending\t"  + msg ); 
        try
        { 
            Thread.sleep(1000); 
        } 
        catch (Exception e) 
        { 
            System.out.println("Thread  interrupted."); 
        } 
        System.out.println("\n" + msg + "Sent"); 
    } 
} 
class ThreadedSend extends Thread 
{ 
    private String msg; 
    private Thread t; 
    Multithreading_with_and_without_synchronization_P14  sender; 
    ThreadedSend(String m,  Multithreading_with_and_without_synchronization_P14 obj) 
    { 
        msg = m; 
        sender = obj; 
    } 
  
    public void run() 
    {  
        synchronized(sender) 
        { 
            sender.send(msg); 
        } 
    } 
} 
class SyncDemo 
{ 
public static void main(String args[]) 
{ 
	Multithreading_with_and_without_synchronization_P14 snd = new Multithreading_with_and_without_synchronization_P14(); 
    ThreadedSend S1 = 
        new ThreadedSend( " Hi " , snd ); 
    ThreadedSend S2 = 
        new ThreadedSend( " Bye " , snd ); 
    S1.start(); 
    S2.start(); 
    try
    { 
        S1.join(); 
        S2.join(); 
    } 
    catch(Exception e) 
    { 
        System.out.println("Interrupted"); 
    } 
} 
} 
