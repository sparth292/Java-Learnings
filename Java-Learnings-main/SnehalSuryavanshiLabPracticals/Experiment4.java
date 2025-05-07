
//  substring()


class Experiment4{
      public static void main(String args[]){
        String str1 = "Parth";
        String str2 = "Prayag";
        String str3 = "Deep";
        String str4 = "Aayush";
        String str5 = "Ninad";
        int t1 = 1;
        
System.out.println(str1.toLowerCase());        
System.out.println(str2.toUpperCase());
System.out.println(str3.trim());
System.out.println(str4.replace("a","e"));
System.out.println(str5.charAt(0));

System.out.println(str1.length());        
System.out.println(str2.equals("Prayag"));
System.out.println(str3.equalsIgnoreCase("deep"));
System.out.println(str4.concat(str5));
System.out.println(str5.compareTo(str5));
 
str5 = Integer.toString(t1);
System.out.println(str5);

System.out.println(str1.substring(1,3));


}

}