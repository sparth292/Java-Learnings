import java.lang.Exception;
import java.util.Scanner;
class authenticationFailureException extends Exception{
authenticationFailureException(String S)
{
super(S);
}
}
class userDefined2{
public static void main(String arg[]){
Scanner S1=new Scanner(System.in);
String u1="abc";
String p1="pqr";
System.out.print("Enter your username: ");
String u2=S1.nextLine();
System.out.print("Enter your password: ");
String p2=S1.nextLine();
try{
if(u1.equals(u2) && p1.equals(p2)){
System.out.println("Auth success");
}
else{
throw new authenticationFailureException("Auth failed");
}
}
catch(authenticationFailureException e){
System.out.println(e.getMessage());
}
}
}


