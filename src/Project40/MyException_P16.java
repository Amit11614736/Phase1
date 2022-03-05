package Project40;

public class MyException_P16 extends Exception 
{ 
    public MyException_P16(String s) 
    { 
        super(s); 
    } 
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException_P16("temp"); 
        } 
        catch (MyException_P16 ex) 
        { 
            System.out.println("Caught"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
 

