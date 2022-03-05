package Practice_Project;

import java.io.FileWriter;
import java.io.IOException;

public class P3_File_Handling_Append 
{
public static void main(String[] args){
// Append text to Existing File.
String path = "C:\\temp\\test.txt";
String text = " \n NAME- AMIT KUMAR \n AGE- 24\n GENDER- MALE";
try
{
FileWriter f = new FileWriter(path,true);
f.write(text);
f.close();
System.out.println("Append done Successfully..");
}
catch(IOException e){
System.out.println(e);
}
}
}