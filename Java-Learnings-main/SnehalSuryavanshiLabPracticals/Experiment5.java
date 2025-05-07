class asc extends Thread{
      public void run(){
        for(int i = 10 ; i > 0 ; i--){
            System.out.println(i);
         }
      }
}

class desc extends Thread{
    public void run(){
        for(int i = 0 ; i < 10 ; i++){
           System.out.println(i);
        }
    }
}

public class Experiment5 {
    public static void main(String[] args) {
     
    asc a1 = new asc();
    desc d1 = new desc();
   a1.run();
   d1.run();
    }
}
