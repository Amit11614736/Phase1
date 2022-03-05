package Practice_Project;

import java.io.FileWriter;
import java.io.IOException;

public class P3_File_Handling 
{
public static void main(String[] args){


try
{
FileWriter f = new FileWriter("C:\\temp\\test.txt");
try
{
f.write("------------------------AMIT----------------------");
}
finally
{
f.close();
}
System.out.println("Successfully Written..!! ");
}
catch(IOException i)
{
System.out.println(i);
}

}
}