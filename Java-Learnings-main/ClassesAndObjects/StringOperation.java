class StringOperation{

public static void main(String args[]){

String s1 = "Parth";
int i1 = 1234;
String s2 = "   PARTH";
System.out.println(s1.toUpperCase());  //uppercase
System.out.println(s1.toLowerCase());  // lowercase
System.out.println(s1.equals("Parth"));  // equals
String s3 = Integer.toString(i1);
System.out.println(s3);           // toString
System.out.println(s1.charAt(0)); // charAt 
System.out.println(s2.trim());    // trim 
System.out.println(s1.length());  // length
System.out.println(s1.concat("Salunke"));  // concat
System.out.println(s1.equalsIgnoreCase("PaRth")); // equalsIgnoreCase
System.out.println(s1.compareTo("g"));  // compareTo
System.out.println(s1.replace("P" , "G")); // replace
System.out.println(s1.substring(2)); // substring

}

}