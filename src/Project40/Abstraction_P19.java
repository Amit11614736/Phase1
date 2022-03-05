package Project40;

public abstract class Abstraction_P19 
{  
	Abstraction_P19 (){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Abstraction_P19 {  
	 void run(){System.out.println("running safely..");}  
	 }  