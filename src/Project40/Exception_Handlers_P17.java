package Project40;

class Exception_Handlers_P17 extends Exception{

	   String str1;
	   Exception_Handlers_P17(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new Exception_Handlers_P17("This is My error Message");
		}
		catch(Exception_Handlers_P17 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
