package Project40;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_P30 
{
public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
        		locationsQueue.add("Bokaro");
        		locationsQueue.add("Ranchi");
        		locationsQueue.add("Dhanbad");
        		locationsQueue.add("Dumka");
        		locationsQueue.add("Godda");
        		locationsQueue.add("Deoghar");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}

