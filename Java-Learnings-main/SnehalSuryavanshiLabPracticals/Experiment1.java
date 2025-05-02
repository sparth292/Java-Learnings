public class Experiment1 {
    public static void main(String[] args) {
           System.out.println("This code calls Constructor of class A");
           A a = new A();
    }
}
class A{
     A(){
        System.out.println("Constructor of class A is called");
     }    
}
