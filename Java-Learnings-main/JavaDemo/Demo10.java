class Demo10{
 void finalize(){
      System.out.println("Object Deleted");
 }
public static void main(String args[]){
       Demo10 d1 = new Demo10();
       d1 = null;
}

}