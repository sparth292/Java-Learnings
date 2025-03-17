//user defined exception: string mismatched exception
import java.lang.Exception;
import java.util.Scanner;
class stringMismatchedException extends Exception{
    stringMismatchedException(String s){
        super(s);
    }
}

class userDefined1{
    public static void main(String args[]){
        Scanner s1= new Scanner(System.in);
        System.out.print("Enter your matrubhumi: ");
        String country= s1.nextLine();
        try{
            if(country.equals("India")){
                System.out.println("Jai Hind!");     
            }
            else{
                throw new stringMismatchedException("It is not India");
            }
        }
        catch(stringMismatchedException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("Program executed.");
        }
    }
}