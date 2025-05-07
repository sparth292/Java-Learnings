class even implements Runnable{
  public void run(){
    for(int i = 0 ; i < 10 ; i+=2){
       System.out.println(i);
    }
  }
}

class odd implements Runnable{
    public void run(){
        for(int i = 1 ; i < 10 ; i+=2){
           System.out.println(i);
        }
      }
}



class Experiment6{
    public static void main(String[] args) {
        even e1 = new even();
        odd o1 = new odd();
        Thread t1 = new Thread(e1);
        Thread t2 = new Thread(o1);
        t1.start();
        t2.start();

    }
}