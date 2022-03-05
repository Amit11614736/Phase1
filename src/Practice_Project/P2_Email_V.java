package Practice_Project;

import java.util.regex.Pattern;

public class P2_Email_V 
{
	 public static boolean isValid(String email)
	 {
	 String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
	 "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
	 Pattern pat = Pattern.compile(emailRegex);
	 if (email == null)
	 return false;
	 return pat.matcher(email).matches();
	 }
	 public static void main(String[] args) {
	 String email1 = "amit11614736@gmail.com";
	String email2 = "@amit11614736.com";
	String email3 = "yo.yoamitranbir@gmail.com";
	String email4 = "amitkrgmail.com";
	String email5 = "amit36@gmailcom";
	 String[] emails= {email1,email2,email3,email4,email5};
	 for (int i = 0; i < emails.length; i++) {
	 String email=emails[i];
	if (isValid(email))
	 System.out.print(email+" -- VALID EMAIL ID");
	 else
	 System.out.print(email+" -- INVALID EMAIL ID");
	 System.out.println();
	 }
	 }
	}